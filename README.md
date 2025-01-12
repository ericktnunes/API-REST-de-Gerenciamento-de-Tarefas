# API REST de Gerenciamento de Tarefas

Este projeto consiste em uma API RESTful desenvolvida com Spring Boot, Java, JPA (Hibernate), e H2 Database para gerenciamento de tarefas. A aplicação permite realizar operações de CRUD (Create, Read, Update, Delete) para tarefas. As tarefas possuem título, descrição, status (pendente ou concluída) e a data de criação.

## Funcionalidades

- **Cadastrar tarefas**: Criar novas tarefas com título, descrição, status e data de criação automática.
- **Listar todas as tarefas**: Retorna todas as tarefas cadastradas no sistema.
- **Buscar tarefa por ID**: Retorna uma tarefa específica com base no seu identificador.
- **Atualizar tarefa**: Altera o título, descrição ou status de uma tarefa.
- **Deletar tarefa**: Exclui uma tarefa do sistema.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **JPA (Hibernate)**: ORM (Mapeamento Objeto-Relacional) utilizado para comunicação com o banco de dados.
- **H2 Database**: Banco de dados em memória, utilizado para armazenar as tarefas.
- **Postman**: Utilizado para testar a API durante o desenvolvimento.

## Pré-requisitos

- **Java 17+**
- **Maven**
- **Spring Boot** 3.x

## Como Rodar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
