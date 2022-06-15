DECLARE @CATEGORIA_INFORMATICA INTEGER;
DECLARE @CATEGORIA_ESCRITORIO INTEGER;
DECLARE @PRODUTO_COMPUTADOR INTEGER;
DECLARE @PRODUTO_IMPRESSORA INTEGER;
DECLARE @PRODUTO_MOUSE INTEGER;
DECLARE @ESTADO_SP INTEGER;
DECLARE @ESTADO_MG INTEGER;

INSERT INTO CATEGORIA (NOME) values ('Informática');
INSERT INTO CATEGORIA (NOME) values ('Escritório');

SET @CATEGORIA_INFORMATICA = SELECT ID FROM CATEGORIA WHERE NOME = 'Informática'
SET @CATEGORIA_ESCRITORIO = SELECT ID FROM CATEGORIA WHERE NOME = 'Escritório'

INSERT INTO PRODUTO (NOME, PRECO) VALUES ('Computador', 2000.0);
INSERT INTO PRODUTO (NOME, PRECO) VALUES ('Impressora', 800.0);
INSERT INTO PRODUTO (NOME, PRECO) VALUES ('Mouse', 80.0);

SET @PRODUTO_COMPUTADOR = SELECT ID FROM PRODUTO WHERE NOME = 'Computador'
SET @PRODUTO_IMPRESSORA = SELECT ID FROM PRODUTO WHERE NOME = 'Impressora'
SET @PRODUTO_MOUSE = SELECT ID FROM PRODUTO WHERE NOME = 'Mouse'

INSERT INTO PRODUTO_CATEGORIA (CATEGORIA_ID, PRODUTO_ID) VALUES (@CATEGORIA_INFORMATICA, @PRODUTO_COMPUTADOR);
INSERT INTO PRODUTO_CATEGORIA (CATEGORIA_ID, PRODUTO_ID) VALUES (@CATEGORIA_ESCRITORIO, @PRODUTO_IMPRESSORA);
INSERT INTO PRODUTO_CATEGORIA (CATEGORIA_ID, PRODUTO_ID) VALUES (@CATEGORIA_ESCRITORIO, @PRODUTO_MOUSE);

INSERT INTO ESTADO (NOME) VALUES ('São Paulo');
INSERT INTO ESTADO (NOME) VALUES ('Minas Gerais');

SET @ESTADO_SP = SELECT ID FROM ESTADO WHERE NOME = 'São Paulo'
SET @ESTADO_MG = SELECT ID FROM ESTADO WHERE NOME = 'Minas Gerais'

INSERT INTO CIDADE (NOME, ESTADO_ID) VALUES ('Uberlândia', @ESTADO_MG);
INSERT INTO CIDADE (NOME, ESTADO_ID) VALUES ('Campinas', @ESTADO_SP);
INSERT INTO CIDADE (NOME, ESTADO_ID) VALUES ('São Paulo', @ESTADO_SP);