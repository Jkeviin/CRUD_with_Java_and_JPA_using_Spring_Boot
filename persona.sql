create database persona;

use persona;
create table Humano(
	id int not null auto_increment,
	nombre varchar(50) not null,
    apellido varchar(50) not null,
    email varchar(50) not null,
    edad int not null,
    sexo varchar(50) not null,
    clave int not null,
    primary key (id));
 
 INSERT INTO Humano (nombre, apellido, email, edad, sexo, clave)
VALUES ('Juan', 'Pérez', 'juanperez@example.com', 30, 'hombre', 123456);

INSERT INTO Humano (nombre, apellido, email, edad, sexo, clave)
VALUES ('María', 'Gómez', 'mariagomez@example.com', 25, 'mujer', 654321);

INSERT INTO Humano (nombre, apellido, email, edad, sexo, clave)
VALUES ('Pedro', 'Rodríguez', 'pedrorodriguez@example.com', 40, 'hombre', 987654);

INSERT INTO Humano (nombre, apellido, email, edad, sexo, clave)
VALUES ('Andrés', 'Fernández', 'andresfernandez@example.com', 28, 'hombre', 456789);

INSERT INTO Humano (nombre, apellido, email, edad, sexo, clave)
VALUES ('Laura', 'López', 'lauralopez@example.com', 35, 'mujer', 789456);


select * from Humano;
