# Backend - API de Gerenciamento de Produtos

Este projeto corresponde ao backend da aplicação de CRUD (Create, Read, Update, Delete) de Produtos, desenvolvido como requisito para a avaliação N1.

## Descrição do Sistema

A API foi construída utilizando **Java** com o framework **Spring Boot**. Ela fornece um conjunto de endpoints RESTful para gerenciar um catálogo de produtos, permitindo que um cliente (como um frontend web) possa criar, listar, buscar por ID, atualizar e deletar produtos.

Os dados são persistidos em um banco de dados em memória (H2 Database) para facilitar a execução e os testes durante o desenvolvimento.

## Funcionalidades da API

| Método HTTP | Endpoint                  | Descrição                           |
|-------------|---------------------------|---------------------------------------|
| `POST`      | `/api/produtos`           | Cria um novo produto.                 |
| `GET`       | `/api/produtos`           | Lista todos os produtos cadastrados.  |
| `GET`       | `/api/produtos/{id}`      | Busca um produto pelo seu ID.         |
| `PUT`       | `/api/produtos/{id}`      | Atualiza um produto existente.        |
| `DELETE`    | `/api/produtos/{id}`      | Deleta um produto pelo seu ID.        |


## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Web:** Para criação de APIs REST.
* **Spring Data JPA:** Para persistência de dados.
* **H2 Database:** Banco de dados em memória.
* **Maven:** Gerenciador de dependências e build do projeto.
* **Lombok:** Para reduzir código boilerplate nas entidades.

## Como Executar o Projeto

**Pré-requisitos:**
* Java Development Kit (JDK) 17 ou superior.
* Maven 3.8 ou superior.

**Passos para execução:**

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/crud-backend-springboot.git](https://github.com/seu-usuario/crud-backend-springboot.git)
    ```

2.  **Acesse a pasta do projeto:**
    ```bash
    cd crud-backend-springboot
    ```

3.  **Execute a aplicação via Maven:**
    ```bash
    mvn spring-boot:run
    ```
    *Alternativamente, você pode importar o projeto em sua IDE (IntelliJ, Eclipse, VS Code) e executar a classe principal `CrudbackendApplication.java`.*

4.  **Acesse a API:**
    A aplicação estará disponível em `http://localhost:8080`.

## Autor

* **[Seu Nome Completo]**
