INSERT INTO COZINHAS(ID, NOME) VALUES (1,'Brasileira');
INSERT INTO COZINHAS(ID, NOME) VALUES (2,'Tailandesa');
INSERT INTO COZINHAS(ID, NOME) VALUES (3,'Indiana');

INSERT INTO RESTAURANTES(ID, TAXA_FRETE, NOME, cozinha_id) VALUES (1,10.70,'Papila Deli', 2);
INSERT INTO RESTAURANTES(ID, TAXA_FRETE, NOME, cozinha_id) VALUES (2,19.99,'O Gaiteiro', 1);
INSERT INTO RESTAURANTES(ID, TAXA_FRETE, NOME, cozinha_id) VALUES (3,15.45,'Tutto in Famiglia',3);

INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (1,'CREDITO');
INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (2,'DEBITO');
INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (3,'PIX');

INSERT INTO PERMISSAO(ID, NOME, DESCRICAO) VALUES (1,'CONSULTA', 'PERMITE CONSULTAS');

INSERT INTO ESTADO(ID, NOME) VALUES (1,'São Paulo');

INSERT INTO CIDADE(ID, NOME, ESTADO_ID) VALUES (1,'São Paulo',1);
