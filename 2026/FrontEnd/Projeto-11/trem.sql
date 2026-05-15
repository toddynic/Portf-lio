DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS restaurantes;
DROP TABLE IF EXISTS pedidos;

CREATE TABLE clientes (
    id_cliente INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    telefone INT
);

CREATE TABLE restaurantes (
    id_restaurante INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    categoria TEXT
);

CREATE TABLE pedidos (
    id_pedido INTEGER PRIMARY KEY AUTOINCREMENT,
    id_cliente INTEGER,
    id_restaurante INTEGER,
    valor_total REAL,
    data_pedido Date,
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

INSERT INTO pedidos (id_cliente, id_restaurante, valor_total, data_pedido) VALUES
(1, 1, 35.00, '2026-05-10'),
(2, 2, 58.50, '2026-05-10'),
(3, 3, 25.00, '2026-05-11');

SELECT * FROM pedidos;