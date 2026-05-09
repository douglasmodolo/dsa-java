-- Tabela de clientes
CREATE TABLE clientes (
    id   INT PRIMARY KEY,
    nome VARCHAR(100),
    cidade VARCHAR(100)
);

-- Tabela de pedidos
CREATE TABLE pedidos (
    id         INT PRIMARY KEY,
    cliente_id INT,
    valor      DECIMAL(10,2),
    status     VARCHAR(50)
);

-- Tabela de produtos
CREATE TABLE produtos (
    id     INT PRIMARY KEY,
    nome   VARCHAR(100),
    preco  DECIMAL(10,2),
    categoria VARCHAR(50)
);

-- 1. Selecionar todos os clientes
SELECT * FROM clientes;

-- 2. Selecionar apenas nome e cidade dos clientes
SELECT nome, cidade FROM clientes;

-- 3. Selecionar clientes da cidade de São Paulo
SELECT * FROM clientes WHERE cidade = 'São Paulo';

-- 4. Selecionar pedidos com valor maior que 100
SELECT * FROM pedidos WHERE valor > 100;

-- 5. Selecionar pedidos com status 'aprovado' ordenados por valor decrescente
SELECT * FROM pedidos WHERE status = 'aprovado' ORDER BY valor DESC;

-- 6. Selecionar produtos ordenados por preço crescente
SELECT * FROM produtos ORDER BY preco ASC;

-- 7. Selecionar nome do cliente e valor do pedido (INNER JOIN)
SELECT c.nome, p.valor
FROM clientes c
INNER JOIN pedidos p ON c.id = p.cliente_id;

-- 8. Selecionar todos os clientes e seus pedidos, mesmo sem pedido (LEFT JOIN)
SELECT c.nome, p.valor
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id;

-- 9. Selecionar clientes que NÃO têm pedidos
SELECT c.nome
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id
WHERE p.id IS NULL;

-- 10. Contar quantos pedidos cada cliente tem
SELECT c.nome, COUNT(p.id) AS total_pedidos
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nome;

-- 11. Somar o valor total de pedidos por cliente
SELECT c.nome, SUM(p.valor) AS total_gasto
FROM clientes c
INNER JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nome;

-- 12. Média de valor dos pedidos por status
SELECT status, AVG(valor) AS media_valor
FROM pedidos
GROUP BY status;

-- 13. Clientes que gastaram mais de 500 no total
SELECT c.nome, SUM(p.valor) AS total_gasto
FROM clientes c
INNER JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nome
HAVING SUM(p.valor) > 500;

-- 14. Produto mais caro por categoria
SELECT categoria, MAX(preco) AS preco_maximo
FROM produtos
GROUP BY categoria;

-- WHERE
SELECT status, AVG(valor)
FROM pedidos
WHERE valor > 100  -- filtra linhas antes do GROUP BY
GROUP BY status;

-- HAVING
SELECT status, AVG(valor)
FROM pedidos
GROUP BY status
HAVING AVG(valor) > 100  -- filtra grupos depois do GROUP BY