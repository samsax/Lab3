Lab3
====

Laboratorio 3 arquitectura de software

Script Base de datos

Nombre base de datos fruit

 CREATE TABLE fruit
(
	idfruta VARCHAR(8) not null primary key,
	name VARCHAR(30),
	price DOUBLE PRECISION,
	quantity INT
)



CREATE TABLE factura
(
    idfactura varchar(10) NOT NULL primary key,
    nombreCliente varchar(50) not null,
fecha varchar(20) not null
    
)

CREATE TABLE venta
(
	idventa varchar(8) NOT NULL primary key,
    idfactura varchar(10) NOT NULL ,
    idfruta varchar(8) NOT NULL,
    cantidad   INT,
    
    FOREIGN KEY (idfruta) REFERENCES fruit(id),
    FOREIGN KEY (idfactura) REFERENCES factura(idfactura)
    
)
