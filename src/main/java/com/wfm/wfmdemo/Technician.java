package com.wfm.wfmdemo;

import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @Column(name = "id")
    private UUID id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "email")
	private String email;

	public Technician() {
	}
	public Technician(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getEmail() {
		return email;
	}
	public void setEmail(String setEmail) {
		this.email = email;
	}
}