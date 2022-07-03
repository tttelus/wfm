package com.wfm.wfmdemo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class WfmdemoApplication {

	@Autowired
	TechnicianRepository technicianRepository;

	public static void main(String[] args) {
		SpringApplication.run(WfmdemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/technician")
	public ResponseEntity<List<Technician>> getAllTechnicians() {
		try {
			List<Technician> technicians = new ArrayList<Technician>();
			System.out.println("1");
			technicianRepository.findAll().forEach(technicians::add);
			System.out.println("2");
			if (technicians.isEmpty()) {
				System.out.println("3");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			System.out.println("4");
			return new ResponseEntity<>(technicians, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
