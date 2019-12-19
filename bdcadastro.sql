
--
-- Banco de dados: `bdcadastro`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabficha`
--
create database bdcadastro;
use bdcadastro;

CREATE TABLE tabficha (
  Matricula integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nome varchar(100),
  CPF varchar(13),
  Telefone varchar(20),
  Rua varchar(100),
  Numero varchar(20),
  Bairro varchar(100),
  Cidade varchar(100),
  Estado varchar(100)
); 

