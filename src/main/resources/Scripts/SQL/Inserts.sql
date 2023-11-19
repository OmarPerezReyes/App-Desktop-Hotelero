-- INSERTS PARA LA TABLA CLIENTE
INSERT INTO CLIENTE (id_cliente, nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento)
VALUES
(1, 'John', 'Doe', 'DNI', '12345678', '+54 123-456-7890', 'john.doe@example.com', 'password123', 'Masculino', '1990-05-15'),
(2, 'Jane', 'Smith', 'Pasaporte', 'A98765432', '+591 987-654-3210', 'jane.smith@example.com', 'securepass', 'Femenino', '1985-08-20'),
(3, 'Robert', 'Johnson', 'DNI', '87654321', '+54 555-444-3333', 'robert.j@example.com', 'pass1234', 'Masculino', '1988-12-10'),
(4, 'Emily', 'Williams', 'Pasaporte', 'B56789012', '+591 111-222-3333', 'emily.w@example.com', 'securepass2', 'Femenino', '1992-04-25'),
(5, 'Michael', 'Brown', 'DNI', '11111111', '+54 777-888-9999', 'michael.b@example.com', 'mypassword', 'Masculino', '1987-07-15'),
(6, 'Sophia', 'Jones', 'Pasaporte', 'C98765432', '+591 555-555-5555', 'sophia.j@example.com', 'password567', 'Femenino', '1995-02-28'),
(7, 'William', 'Taylor', 'DNI', '22223333', '+54 123-456-7890', 'william.t@example.com', 'p@ssw0rd', 'Masculino', '1991-09-08'),
(8, 'Olivia', 'Clark', 'Pasaporte', 'D44445555', '+591 987-654-3210', 'olivia.c@example.com', 'olivia_pass', 'Femenino', '1984-11-03'),
(9, 'Ethan', 'Harris', 'DNI', '55556666', '+54 666-777-8888', 'ethan.h@example.com', 'secure123', 'Masculino', '1989-06-20'),
(10, 'Ava', 'Martin', 'Pasaporte', 'E12345678', '+591 222-333-4444', 'ava.m@example.com', 'myp@ssword', 'Femenino', '1993-03-12'),
(11, 'Liam', 'Ward', 'DNI', '77778888', '+54 888-999-0000', 'liam.w@example.com', 'wardpass', 'Masculino', '1994-08-05'),
(12, 'Mia', 'Fisher', 'Pasaporte', 'F87654321', '+591 111-222-3333', 'mia.f@example.com', 'secure_mia', 'Femenino', '1996-01-18'),
(13, 'Mar', 'Fis', 'Pasaporte', 'F87654321', '+591 111-222-3333', 'mar.f@example.com', 'secure_mia', 'Femenino', '1996-01-18');

-- INSERTS PARA LA TABLA RESERVA
INSERT INTO RESERVA (id_reserva, id_cliente)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12);

-- INSERTS PARA LA TABLA TIPO_HABITACION
INSERT INTO TIPO_HABITACION (id_tipo, precio, capacidad, check_in, check_out)
VALUES
(1, 100.00, 2, '14:00:00', '12:00:00'),
(2, 150.00, 4, '15:00:00', '11:00:00'),
(3, 120.00, 2, '14:30:00', '11:30:00'),
(4, 180.00, 4, '16:00:00', '10:00:00'),
(5, 90.00, 2, '13:00:00', '12:30:00'),
(6, 200.00, 6, '17:00:00', '10:30:00'),
(7, 130.00, 3, '15:30:00', '11:30:00'),
(8, 160.00, 4, '14:00:00', '11:00:00'),
(9, 110.00, 2, '16:30:00', '10:30:00'),
(10, 140.00, 3, '13:30:00', '12:00:00'),
(11, 170.00, 5, '15:00:00', '10:00:00'),
(12, 190.00, 6, '14:30:00', '11:30:00');

-- INSERTS PARA LA TABLA HABITACION
INSERT INTO HABITACION (numero_habitacion, id_tipo, estado_ocupacion, piso)
VALUES
(101, 1, 0, 1),
(102, 2, 1, 1),
(103, 1, 0, 2),
(104, 2, 1, 2),
(105, 3, 0, 1),
(106, 4, 1, 3),
(107, 5, 0, 2),
(108, 6, 1, 3),
(109, 7, 0, 1),
(110, 8, 1, 2),
(111, 9, 0, 2),
(112, 10, 1, 3);

-- INSERTS PARA LA TABLA DETALLE_RESERVA
INSERT INTO DETALLE_RESERVA (id_det_reserva, id_reserva, id_habitacion, fecha_entrada, fecha_salida)
VALUES
(1, 1, 101, '2023-01-01 14:00:00', '2023-01-05 12:00:00'),
(2, 2, 102, '2023-02-01 15:00:00', '2023-02-10 11:00:00'),
(3, 3, 103, '2023-03-01 14:30:00', '2023-03-05 12:30:00'),
(4, 4, 104, '2023-04-01 16:00:00', '2023-04-10 10:00:00'),
(5, 5, 105, '2023-05-01 13:30:00', '2023-05-05 12:00:00'),
(6, 6, 106, '2023-06-01 17:00:00', '2023-06-10 11:30:00'),
(7, 7, 107, '2023-07-01 15:30:00', '2023-07-05 11:30:00'),
(8, 8, 108, '2023-08-01 14:00:00', '2023-08-10 11:00:00'),
(9, 9, 109, '2023-09-01 16:30:00', '2023-09-10 10:30:00'),
(10, 10, 110, '2023-10-01 13:30:00', '2023-10-05 12:00:00'),
(11, 11, 111, '2023-11-01 15:00:00', '2023-11-10 10:00:00'),
(12, 12, 112, '2023-11-01 14:30:00', '2023-11-05 11:30:00');


-- INSERTS PARA LA TABLA BOLETA
INSERT INTO BOLETA (id_pago, id_det_reserva, fecha_pago, monto, metodo_pago)
VALUES
(1, 1, '2023-01-05', 500.00, 'Credit Card'),
(2, 2, '2023-02-15', 1200.00, 'Cash'),
(3, 3, '2023-03-10', 700.00, 'Debit Card'),
(4, 4, '2023-04-20', 1500.00, 'Credit Card'),
(5, 5, '2023-05-15', 600.00, 'Cash'),
(6, 6, '2023-06-25', 1600.00, 'Credit Card'),
(7, 7, '2023-07-12', 800.00, 'Debit Card'),
(8, 8, '2023-08-18', 1000.00, 'Cash'),
(9, 9, '2023-09-30', 900.00, 'Credit Card'),
(10, 10, '2023-10-22', 1200.00, 'Debit Card'),
(11, 11, '2023-11-05', 1100.00, 'Cash'),
(12, 12, '2023-12-15', 1400.00, 'Credit Card');

-- INSERTS PARA LA TABLA ACOMPAÑANTE
INSERT INTO ACOMPAÑANTE (id_acompañante, id_det_reserva, nombre, apellido, tipo_doc_identidad, num_doc_identidad, email)
VALUES
(1, 1, 'Alice', 'Doe', 'DNI', '87654321', 'alice.doe@example.com'),
(2, 2, 'Bob', 'Smith', 'PASSPORT', 'B12345678', 'bob.smith@example.com'),
(3, 3, 'Charlie', 'Williams', 'DNI', '98765432', 'charlie.w@example.com'),
(4, 4, 'Diana', 'Brown', 'PASSPORT', 'C56789012', 'diana.b@example.com'),
(5, 5, 'Elijah', 'Taylor', 'DNI', '11112222', 'elijah.t@example.com'),
(6, 6, 'Fiona', 'Clark', 'PASSPORT', 'F12345678', 'fiona.c@example.com'),
(7, 7, 'George', 'Harris', 'DNI', '22223333', 'george.h@example.com');

-- INSERTS PARA LA TABLA EMPLEADO
INSERT INTO EMPLEADO (id_cliente, nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento)
VALUES
(101, 'Employee', 'One', 'DNI', '11112222', '999-888-7777', 'employee.one@example.com', 'employeepass', 'Male', '1980-06-10'),
(102, 'Employee', 'Two', 'PASSPORT', 'A1112222', '777-666-5555', 'employee.two@example.com', 'securepass', 'Female', '1982-09-25'),
(103, 'Employee', 'Three', 'DNI', '33334444', '111-222-3333', 'employee.three@example.com', 'employee3', 'Male', '1985-12-15'),
(104, 'Employee', 'Four', 'PASSPORT', 'B44445555', '444-555-6666', 'employee.four@example.com', 'secure45', 'Female', '1987-04-28');