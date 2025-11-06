CREATE DATABASE sistemas;
USE sistemas;

CREATE TABLE cliente (
cpf VARCHAR(11) PRIMARY KEY,
data_envio TIMESTAMP DEFAULT current_timestamp
);

select * from sistemas.cliente;
