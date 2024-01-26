USE master
GO

CREATE DATABASE quarkus;
GO

USE quarkus;

CREATE TABLE poc(
  id   INT PRIMARY KEY,
  name VARCHAR(20)
);

INSERT INTO poc(id, name) VALUES (0, 'ce la facciamo')
GO
