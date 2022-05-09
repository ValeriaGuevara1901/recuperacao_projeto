/* Lógico_1: */

CREATE TABLE Role (
    id_role INTEGER PRIMARY KEY,
    nome VARCHAR(50)
);

CREATE TABLE Habitante_Role (
    fk_Habitante_id_habitante INTEGER,
    fk_Role_id_role INTEGER
);

CREATE TABLE Habitante (
    id_habitante INTEGER PRIMARY KEY,
    nome VARCHAR(50),
    sobrenome VARCHAR(50),
    data_nascimento DATE,
    renda DECIMAL,
    cpf VARCHAR(11),
    fk_Vila_id_vila INTEGER
);

CREATE TABLE Relatorio (
    id_relatorio INTEGER PRIMARY KEY,
    orcamento_liquido_vila DECIMAL,
    gasto_total_vila DECIMAL,
    id_morador_maior_custo INTEGER,
    fk_Vila_id_vila INTEGER
);

CREATE TABLE Vila (
    id_vila INTEGER PRIMARY KEY,
    nome VARCHAR(50)
);
 
ALTER TABLE Habitante_Role ADD CONSTRAINT FK_Habitante_Role_1
    FOREIGN KEY (fk_Habitante_id_habitante???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE Habitante_Role ADD CONSTRAINT FK_Habitante_Role_2
    FOREIGN KEY (fk_Role_id_role)
    REFERENCES Role (id_role)
    ON DELETE RESTRICT;
 
ALTER TABLE Habitante ADD CONSTRAINT FK_Habitante_2
    FOREIGN KEY (fk_Vila_id_vila???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE Relatorio ADD CONSTRAINT FK_Relatorio_2
    FOREIGN KEY (fk_Vila_id_vila???)
    REFERENCES ??? (???)
    ON DELETE CASCADE;