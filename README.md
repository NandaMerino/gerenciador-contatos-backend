# Gerenciador de Contatos - Backend

![GitHub repo size](https://img.shields.io/github/repo-size/NandaMerino/gerenciador-contatos-backend)
![GitHub contributors](https://img.shields.io/github/contributors/NandaMerino/gerenciador-contatos-backend)
![GitHub license](https://img.shields.io/github/license/NandaMerino/gerenciador-contatos-backend)

## Sobre o Projeto
O **Gerenciador de Contatos** é uma aplicação desenvolvida para facilitar a organização e gestão de contatos pessoais e profissionais. Este repositório contém o backend da aplicação, desenvolvido com **Spring Boot**.

🔗 Repositório do **Frontend**: [Gerenciador de Contatos - Frontend](https://github.com/NandaMerino/gerenciador-contatos-frontend)

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Postman** (para testes da API)

## Configuração do Ambiente
### Pré-requisitos
Antes de iniciar, certifique-se de ter instalado:
- [JDK 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Postman](https://www.postman.com/) (opcional, mas recomendado para testes)
  
### Como Rodar a Aplicação
1. ** Clone o repositório: **
   ```sh
   git clone https://github.com/NandaMerino/gerenciador-contatos-backend.git

2. ** Acesse o diretório do projeto: **
   ```sh
   cd gerenciador-contatos-backend

3. ** Instale as dependências e compile o projeto: **
   ```sh
   mvn clean install

4. ** Execute a aplicação: **
   ```sh
   mvn spring-boot:run

A API estará disponível em `http://localhost:8080`.

## Testes da API

Para testar a API, recomenda-se o uso do **Postman**:

1. Importe a coleção de requisições do Postman (caso disponível).
2. Configure o ambiente com a URL base:
   `http://localhost:8080`
3. Execute requisições para verificar os endpoints disponíveis.
