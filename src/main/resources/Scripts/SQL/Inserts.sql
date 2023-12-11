INSERT INTO CLIENTE (id_cliente, nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento)
VALUES
(1, 'Juan', 'Gómez', 'DNI', '123456789', '555-1234', 'juan@example.com', 'contraseña12', 'Masculino', '1990-05-15'),
(2, 'María', 'Hernández', 'Pasaporte', 'ABC123', '555-5678', 'maria@example.com', 'clave456', 'Femenino', '1988-09-22'),
(3, 'Carlos', 'Martínez', 'DNI', '987654321', '555-9876', 'carlos@example.com', 'secreto789', 'Masculino', '1995-12-10'),
(4, 'Ana', 'Sánchez', 'DNI', '294668401', '555-4321', 'ana@example.com', 'clave789', 'Femenino', '1998-03-28'),
(5, 'Javier', 'González', 'DNI', '456789012', '555-8765', 'javier@example.com', 'contraseña98', 'Masculino', '1985-07-04');

INSERT INTO RESERVA (id_cliente)
VALUES
(2),
(3),
(4),
(5);

INSERT INTO TIPO_HABITACION (id_tipo, precio, capacidad, check_in, check_out, descripcion)
VALUES
(1, 1000.00, 1, '14:00:00', '12:00:00', 'Individual'),
(2, 1500.00, 2, '15:00:00', '11:00:00', 'Doble'),
(3, 2000.00, 3, '16:00:00', '10:00:00', 'Triple');

INSERT INTO HABITACION (numero_habitacion, id_tipo, estado_ocupacion, piso)
VALUES
(101, 1, 0, 1),
(202, 2, 1, 2),
(303, 3, 0, 3),
(404, 1, 1, 4),
(505, 2, 0, 5);

INSERT INTO DETALLE_RESERVA (id_reserva, id_habitacion, fecha_entrada, fecha_salida)
VALUES
(2, 101, '2023-12-18 14:00:00', '2023-12-22 12:00:00'),
(3, 202, '2023-12-20 14:00:00', '2023-12-25 12:00:00'),
(4, 303, '2023-12-22 14:00:00', '2023-12-27 12:00:00'),
(5, 404, '2023-12-25 14:00:00', '2023-12-30 12:00:00');

INSERT INTO BOLETA (id_det_reserva, fecha_pago, monto, metodo_pago)
VALUES
(4, '2023-12-20', 10000.00, 'Transferencia Bancaria'),
(5, '2023-12-23', 12500.00, 'Efectivo'),
(6, '2023-12-26', 9000.00, 'PayPal'),
(7, '2023-12-29', 11000.00, 'Cheque');

INSERT INTO ACOMPAÑANTE (id_det_reserva, nombre, apellido, tipo_doc_identidad, num_doc_identidad, email)
VALUES
(4, 'Luisa', 'Ramírez'),
(5, 'Gabriel', 'Torres'),
(6, 'Carmen', 'Sánchez'),
(7, 'Sergio', 'Fernández');

INSERT INTO EMPLEADO (id_empleado, nombre, apellido, tipo_doc_identidad, num_doc_identidad, telefono, email, contraseña, sexo, fecha_nacimiento)
VALUES
(1, 'Alejandra', 'García', 'DNI', '987654321', '555-1111', 'alejandra@example.com', 'contraseña12', 'Femenino', '1990-08-12'),
(2, 'Raúl', 'Rodríguez', 'Pasaporte', 'A1B2C3', '555-2222', 'raul@example.com', 'clave456', 'Masculino', '1988-04-25'),
(3, 'Patricia', 'Mendoza', 'DNI', '123456789', '555-3333', 'patricia@example.com', 'secreto89', 'Femenino', '1995-11-18'),
(4, 'Jorge', 'Castillo', 'Licencia', 'XYZ987', '555-4444', 'jorge@example.com', 'clave789', 'Masculino', '1998-02-03'),
(5, 'Karla', 'Ruiz', 'DNI', '456789012', '555-5555', 'karla@example.com', 'contraseña98', 'Femenino', '1985-06-17');