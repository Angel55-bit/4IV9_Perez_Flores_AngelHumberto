CREATE DATABASE productos_sql;
USE productos_sql;

create table if not exist PRODUCTO(
    id e+int primary key,
    nombre varchar(100) not null,
    precio double not null,
    cantidad int not null,
    categoria int not null,
    tipo varchar(20) not null,
    fecha_caducidad date not null, 
    es_perecedero BOOLEAN,
    peso double,
    marca varchar(50),
    garantia_meses INT,
    talla varchar(10),
    color varchar(30),
    material varchar(30)
);

