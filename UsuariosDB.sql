dropdb Usuarios;
createdb Usuarios;
psql Usuarios;


CREATE TABLE Usuarios(
    Usuario         varchar(20)      NOT NULL   PRIMARY KEY,
    Contraseña      varchar(32)      NOT NULL,
    Rol             char(2)          NOT NULL
);

INSERT INTO Usuarios(Usuario, Contraseña, Rol)
VALUES
('Cleytonio', MD5('ded'), '00'),
('Boris',     MD5('dedtoo'), '01');