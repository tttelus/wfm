CREATE TABLE assignment (
    id UUID,
    technicianId UUID,
    startTime TIMESTAMP WITH TIME ZONE,
    endTime TIMESTAMP WITH TIME ZONE
);
CREATE TABLE technician (
    id UUID,
    firstName VARCHAR_IGNORECASE,
    lastName VARCHAR_IGNORECASE,
    email VARCHAR_IGNORECASE
);

INSERT INTO assignment (id, technicianId, startTime, endTime) VALUES (
    'fe1baef8-8891-40cb-9544-e3b67eeb7c91',
    'd2a4ef08-60bf-4532-8464-c07fc3006b51',
    '2022-06-28 13:00:00-7:00',
    '2022-06-28 14:00:00-7:00'
);
INSERT INTO assignment (id, technicianId, startTime, endTime) VALUES (
    '7be28241-6f5b-4622-81d0-abb97f811287',
    '18279946-fd25-407e-b02c-f69e11298b8f',
    '2022-06-28 14:00:00-7:00',
    '2022-06-28 15:00:00-7:00'
);
INSERT INTO assignment (id, technicianId, startTime, endTime) VALUES (
    '96913b67-9af6-4830-9907-7084a96d7fce',
    '7dda8892-588f-4691-b53b-a46181580aef',
    '2022-06-28 15:00:00-7:00',
    '2022-06-28 16:00:00-7:00'
);

INSERT INTO technician (id, firstName, lastName, email) VALUES (
    'd2a4ef08-60bf-4532-8464-c07fc3006b51',
    'firstName1',
    'lastName1',
    'email1@telus'
);
INSERT INTO technician (id, firstName, lastName, email) VALUES (
    '18279946-fd25-407e-b02c-f69e11298b8f',
    'firstName2',
    'lastName2',
    'email2@telus'
);
INSERT INTO technician (id, firstName, lastName, email) VALUES (
    '7dda8892-588f-4691-b53b-a46181580aef',
    'firstName3',
    'lastName3',
    'email3@telus'
);