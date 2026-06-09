CREATE DATABASE AngelDB_FutbolAmerica;
USE AngelDB_FutbolAmerica;

CREATE TABLE equipos(
    id_equipo INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    ciudad VARCHAR(100),
    estadio VARCHAR(100),
);

CREATE TABLE jugadores(
    id_jugador INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    edad INT,
    posicion VARCHAR(50)
);

CREATE TABLE contratos(
    id_contrato INT PRIMARY KEY AUTO_INCREMENT,
    id_jugador INT,
    id_equipo INT,
    fecha_firma DATE,
    FOREIGN KEY(id_jugador) REFERENCES jugadores(id_jugador) ON DELETE CASCADE,
    FOREIGN KEY(id_equipo) REFERENCES equipos(id_equipo) ON DELETE CASCADE
);

INSERT INTO equipos(nombre, ciudad, estadio, anio_fundacion)
VALUES
('Chiefs', 'Kansas City', 'Arrowhead Stadium', 1960),
('49ers', 'San Francisco', 'Levis Stadium', 1946),
('Cowboys', 'Dallas', 'AT&T Stadium', 1960),
('Eagles', 'Philadelphia', 'Lincoln Financial', 1933),


INSERT INTO jugadores(nombre, edad, posicion)
VALUES
('Patrick Mahomes', 30, 'Quarterback'),
('Christian McCaffrey', 29, 'Running Back'),
('Travis Kelce', 36, 'Tight End'),


INSERT INTO contratos(id_jugador, id_equipo, fecha_firma)
VALUES
(1, 1, '2026-06-01'),
(2, 2, '2026-06-02'),
(3, 1, '2026-06-03'),
