CREATE TABLE CLIENTE (
    id_cliente INTEGER PRIMARY KEY NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    tipo_doc_identidad VARCHAR(15) NOT NULL,
    num_doc_identidad VARCHAR(15) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    contraseña VARCHAR(12) NOT NULL,
    sexo VARCHAR(12) NULL,
    fecha_nacimiento DATE NULL
);

CREATE TABLE RESERVA (
    id_reserva INTEGER PRIMARY KEY NOT NULL,
    id_cliente INTEGER NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES CLIENTE(id_cliente)
);

CREATE TABLE TIPO_HABITACION(
    id_tipo INTEGER PRIMARY KEY NOT NULL,
    precio MONEY NOT NULL,
    capacidad INTEGER NOT NULL,
    check_in TIME NOT NULL,
    check_out TIME NOT NULL 
);
CREATE TABLE HABITACION(
    numero_habitacion INTEGER PRIMARY KEY NOT NULL,
    id_tipo INTEGER NOT NULL,
    estado_ocupacion BIT NOT NULL,
    piso INTEGER NOT NULL,
    FOREIGN KEY (id_tipo) REFERENCES TIPO_HABITACION(id_tipo)
);

CREATE TABLE DETALLE_RESERVA(
    id_det_reserva INTEGER PRIMARY KEY NOT NULL,
    id_reserva INTEGER NOT NULL,
    id_habitacion INTEGER NOT NULL,
    fecha_entrada DATETIME NOT NULL,
    fecha_salida DATETIME NOT NULL,
    FOREIGN KEY (id_reserva) REFERENCES RESERVA(id_reserva),
    FOREIGN KEY (id_habitacion) REFERENCES HABITACION(numero_habitacion)
);

CREATE TABLE BOLETA(
    id_pago INTEGER PRIMARY KEY NOT NULL,
    id_det_reserva INTEGER NOT NULL,
    fecha_pago DATE NOT NULL,
    monto MONEY NOT NULL,
    metodo_pago VARCHAR(30) NOT NULL,
    FOREIGN KEY (id_det_reserva) REFERENCES DETALLE_RESERVA(id_det_reserva)
);

CREATE TABLE ACOMPAÑANTE(
    id_acompañante INTEGER PRIMARY KEY NOT NULL,
    id_det_reserva INTEGER NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    tipo_doc_identidad VARCHAR(15) NOT NULL,
    num_doc_identidad VARCHAR(15) NOT NULL,
    email VARCHAR(50) NOT NULL,
    FOREIGN KEY (id_det_reserva) REFERENCES DETALLE_RESERVA(id_det_reserva)
);

CREATE TABLE EMPLEADO (
    id_empleado INTEGER PRIMARY KEY NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    tipo_doc_identidad VARCHAR(15) NOT NULL,
    num_doc_identidad VARCHAR(15) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    contraseña VARCHAR(12) NOT NULL,
    sexo VARCHAR(12) NULL,
    fecha_nacimiento DATE NULL
);