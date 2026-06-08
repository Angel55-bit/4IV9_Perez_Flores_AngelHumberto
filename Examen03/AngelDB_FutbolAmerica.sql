CREATE DATABASE IF NOT EXISTS AngelDB_FutbolAmerica;
USE AngelDB_FutbolAmerica;

CREATE TABLE divisiones (
    id_division INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    conferencia VARCHAR(10) NOT NULL
);

CREATE TABLE equipos (
    id_equipo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    estadio VARCHAR(100),
    id_division INT,
    FOREIGN KEY (id_division) REFERENCES divisiones(id_division) ON DELETE SET NULL
);

CREATE TABLE entrenadores (
    id_entrenador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    rol VARCHAR(50) DEFAULT 'Head Coach',
    id_equipo INT UNIQUE,
    FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo) ON DELTE SET NULL
);

CREATE TABLE jugadores (
    id_jugador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    numero_jersey INT NOT NULL,
    posicion VARCHAR(10) NOT NULL, -- Ej. 'QB', 'RB', 'WR', 'CB', 'LB'
    universidad VARCHAR(100),
    id_equipo INT,
    FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo) ON DELETE SET NULL
);

CREATE TABLE partidos (
    id_partido INT AUTO_INCREMENT PRIMARY KEY,
    id_equipo_local INT,
    id_equipo_visitante INT,
    fecha_partido DATETIME NOT NULL,
    semana INT NOT NULL, -- Semana de la temporada (Ej. Semana 1, Semana 2)
    puntos_local INT DEFAULT 0,
    puntos_visitante INT DEFAULT 0,
    FOREIGN KEY (id_equipo_local) REFERENCES equipos(id_equipo),
    FOREIGN KEY (id_equipo_visitante) REFERENCES equipos(id_equipo)
);

CREATE TABLE partidos (
    id_partido INT AUTO_INCREMENT PRIMARY KEY,
    id_equipo_local INT,
    id_equipo_visitante INT,
    fecha_partido DATETIME NOT NULL,
    semana INT NOT NULL, -- Semana de la temporada (Ej. Semana 1, Semana 2)
    puntos_local INT DEFAULT 0,
    puntos_visitante INT DEFAULT 0,
    FOREIGN KEY (id_equipo_local) REFERENCES equipos(id_equipo),
    FOREIGN KEY (id_equipo_visitante) REFERENCES equipos(id_equipo)
);


CREATE TABLE estadisticas_jugador_partido (
    id_estadistica INT AUTO_INCREMENT PRIMARY KEY,
    id_jugador INT,
    id_partido INT,
    -- Estadísticas Ofensivas (Pases / Carrera / Recepción)
    yardas_pases INT DEFAULT 0,
    td_pases INT DEFAULT 0,
    intercepciones_sufridas INT DEFAULT 0,
    yardas_carrera INT DEFAULT 0,
    td_carrera INT DEFAULT 0,
    recepciones INT DEFAULT 0,
    yardas_recepcion INT DEFAULT 0,
    td_recepcion INT DEFAULT 0,
    -- Estadísticas Defensivas
    tacleadas_solitarias INT DEFAULT 0,
    capturas_mariscal (sacks) DECIMAL(3,1) DEFAULT 0.0,
    intercepciones_defensivas INT DEFAULT 0,
    FOREIGN KEY (id_jugador) REFERENCES jugadores(id_jugador) ON DELETE CASCADE,
    FOREIGN KEY (id_partido) REFERENCES partidos(id_partido) ON DELETE CASCADE
);

INSERT INTO divisiones (nombre, conferencia) VALUES ('NFC Oeste', 'NFC'), ('AFC OESTE', 'AFC');
INSERT INTO equipos (nombre, ciudad, estadio, id_division) 
VALUES '49ers', 'San Francisco', 'Levi\'s Stadium', 1),
        ('Chiefs', 'Kansas City', 'GEHA Field at Arrowhead', 2);

INSERT INTO entrenadores (nombre, apellido, rol, id_equipo) 
VALUES ('Andy', 'Reid', 'Head Coach', 2),
       ('Kyle', 'Shanahan', 'Head Coach', 1);

INSERT INTO jugadores (nombre, apellido, numero_jersey, posicion, universidad, id_equipo)
VALUES ('Patrick', 'Mahomes', 15, 'QB', 'Texas Tech', 2),
       ('Travis', 'Kelce', 87, 'TE', 'Cincinnati', 2),
       ('Christian', 'McCaffrey', 23, 'RB', 'Stanford', 1);

INSERT INTO partidos (id_equipo_local, id_equipo_visitante, fecha_partido, semana, puntos_local, puntos_visitante)
VALUES (2, 1, '2026-09-10 19:20:00', 1, 27, 24);

INSERT INTO estadisticas_jugador_partido (id_jugador, id_partido, yardas_pases, td_pases, intercepciones_sufridas)
VALUES (1, 1, 286, 2, 1);

SELECT numero_jersey, nombre, apellido, posicion 
FROM jugadores 
WHERE id_equipo = 2 
ORDER BY posicion;

SELECT p.semana, el.ciudad AS Local, p.puntos_local, ev.ciudad AS Visitante, p.puntos_visitante
FROM partidos p
JOIN equipos el ON p.id_equipo_local = el.id_equipo
JOIN equipos ev ON p.id_equipo_visitante = ev.id_equipo;