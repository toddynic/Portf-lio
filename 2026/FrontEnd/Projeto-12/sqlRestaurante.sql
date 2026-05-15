DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS restaurantes;
DROP TABLE IF EXISTS entregador;
DROP TABLE IF EXISTS tipo_pagamento;

CREATE TABLE clientes (
    id_cliente INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    telefone INT
);

CREATE TABLE entregador (
    id_entregador INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(11),
  	veiculo VARCHAR(50)
);

CREATE TABLE restaurantes (
    id_restaurante INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    categoria VARCHAR(100)
);

CREATE TABLE tipo_pagamento (
    id_pagamento INTEGER PRIMARY KEY AUTOINCREMENT,
    tipo_pagamento VARCHAR(50)
);

CREATE TABLE pedidos (
    id_pedido INTEGER PRIMARY KEY AUTOINCREMENT,
    id_cliente INTEGER,
    id_restaurante INTEGER,
    valor_total REAL,
    data_pedido DATE,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_restaurante) REFERENCES restaurantes(id_restaurante)
);

INSERT INTO clientes (nome, telefone) VALUES
('João Silva', '11999999999'),
('Maria Souza', '21988888888'),
('Carlos Lima', '31977777777');

INSERT INTO restaurantes (nome, categoria) VALUES
('Burger House', 'Hambúrguer'),
('Pizza Express', 'Pizza'),
('Comida Caseira da Ana', 'Caseira');

INSERT INTO entregador (nome, telefone, veiculo) VALUES
('Marcos Motoqueiro', '11977778888', 'Moto'),
('Lucas Ciclista', '21966665555', 'Bicicleta');

INSERT INTO tipo_pagamento (tipo_pagamento) VALUES
('Cartão de Crédito'),
('Pix'),
('Dinheiro');

INSERT INTO pedidos (id_cliente, id_restaurante, valor_total, data_pedido) VALUES
(1, 1, 35.00, '2026-05-10'),
(2, 2, 58.50, '2026-05-10'),
(3, 3, 25.00, '2026-05-11');

UPDATE entregador
SET telefone = '31931313131'
WHERE id_entregador = 2;

SELECT * FROM pedidos;
SELECT * FROM clientes;
SELECT * FROM restaurantes;
SELECT * FROM entregador;
SELECT * FROM tipo_pagamento;
