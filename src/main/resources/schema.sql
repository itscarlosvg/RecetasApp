CREATE TABLE dificultad (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255)
);

CREATE TABLE receta (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    fk_dificultad INTEGER,
    FOREIGN KEY (fk_dificultad) REFERENCES dificultad(id)
);