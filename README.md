# Checkpoint 1

## 📌 Descrição do Projeto

Este projeto é uma API REST desenvolvida com **Spring Boot** para gestão de pedidos. Ele permite criar, listar, atualizar e deletar pedidos de clientes. O banco de dados utilizado é o **H2 Database**.

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.1**
- **H2 Database**
- **Postman**&#x20;

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/fiap-checkpoint1.git
cd fiap-checkpoint1
```

### 2️⃣ Configurar o Banco de Dados

No arquivo "application.properties", a configuração do banco de dados já está pronta:

```properties
spring.datasource.url=jdbc:h2:mem:testdbFIAP
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Compilar e Rodar o Projeto

```bash
mvn spring-boot:run
```

O projeto será iniciado na porta **8080**.

## 📌 Endpoints da API

![image](https://github.com/user-attachments/assets/4f060c12-6c99-45d6-b768-ff371265ed41)

### 🔹 1. Criar um Novo Pedido

- **URL:** `POST /pedidos`
- **Exemplo de Request (JSON):**

```json
{
    "clienteNome": "Pedro Guerra",
    "valorTotal": 15000
}
```

- **Exemplo de Response (JSON):**

```json
{
    "id": 1,
    "clienteNome": "Pedro Guerra",
    "dataPedido": "2025-03-26",
    "valorTotal": 15000
}
```

![image](https://github.com/user-attachments/assets/1c25a80a-58f6-4cef-9b6c-37d6740f17fc)

### 🔹 2. Buscar Todos os Pedidos

- **URL:** `GET /pedidos`
- **Response:** Lista com os pedidos cadastrados.

![image](https://github.com/user-attachments/assets/8a53f821-99f9-4d23-96df-4444c2a366e9)

### 🔹 3. Buscar um Pedido por ID

- **URL:** `GET /pedidos/{id}`
- **Exemplo de Response:**

```json
{
    "id": 1,
    "clienteNome": "Pedro Guerra",
    "dataPedido": "2025-03-26",
    "valorTotal": 15000
}
```

![image](https://github.com/user-attachments/assets/a8a163bf-88b0-4366-a5f0-dddd7fdd35ba)

### 🔹 4. Atualizar um Pedido

- **URL:** `PUT /pedidos/{id}`
- **Exemplo de Request:**

```json
{
    "clienteNome": "Maria Clara",
    "valorTotal": 20000
}
```

![image](https://github.com/user-attachments/assets/5e309aac-0b76-4d30-ae47-e7c526eb1a42)

### 🔹 5. Deletar um Pedido

- **URL:** `DELETE /pedidos/{id}`
- **Response:** Status \*\*200 \*\* (sem body).

![image](https://github.com/user-attachments/assets/3d114c49-e8f3-4640-9426-5afbdf1d0543)

## 🗄 Acessando o Banco H2

1. Acesse: "http\://localhost:8080/h2-console"
2. **JDBC URL:`jdbc:h2:mem:testdbFIAP`
3. Username: `sa`
4. **Password:** *(deixe em branco)*
5. Clique em **"Connect"** e execute a query:

```sql
SELECT * FROM PEDIDO;
```













