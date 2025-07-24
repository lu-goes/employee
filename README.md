# Employee API

API RESTful para cadastro e gerenciamento de funcionários.

---

## 📋 Funcionalidades

- ✅ Listar todos os funcionários (`GET /employees`)
- ✅ Cadastrar novo funcionário (`POST /employees`)
- ✅ Remover funcionário (`DELETE /employees/{id}`)

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Bean Validation (Jakarta)
- Swagger/OpenAPI 3
- JUnit 5 + Mockito
- Docker + Docker Compose
- Jacoco
- Arquitetura: DDD + Clean Architecture + SOLID

---

## 🏗️ Organização do Projeto

```
src/
├── domain               # Entidades e interfaces de repositório (camada de domínio)
├── application          # Casos de uso
├── adapters
│   ├── in/web           # Controllers (entrada da aplicação)
│   └── out/persistence  # Camada de persistência com JPA
└── MainApplication.java
```

---

## 🧑‍💻 Como rodar localmente

### 1. Clonar o repositório

```bash
git clone https://github.com/lu-goes/employee.git
```

### 2. Configurar o banco de dados

Certifique-se de ter um PostgreSQL local rodando com:

- Database: `employee_db`
- Usuário: `postgres`
- Senha: `postgres`
- Porta: `5432`

Ou configure no `application.properties`.

---

### 3. Compilar e rodar a aplicação

```bash
mvn clean package
mvn spring-boot:run
```

Acesse a API em:  
📍 `http://localhost:8080/employees`

---


## ✅ Como rodar os testes

```bash
mvn test
```

Cobertura de testes cobre as camadas de domínio, aplicação e controlador.

---

## 🐳 Rodando com Docker

### 1. Gerar o `.jar`

```bash
mvn clean package
```

### 2. Subir com Docker Compose

```bash
docker-compose up 
```

### 3. Acessar

- API: `http://localhost:8080/employees`
- Swagger UI: `http://localhost:8080/swagger-ui/index.html`

---

## 🧪 Exemplos de chamadas à API

### 🔍 Listar funcionários

```bash
curl -X GET http://localhost:8080/employees
```

---

### ➕ Cadastrar funcionário

```bash
curl -X POST http://localhost:8080/employees   -H "Content-Type: application/json"   -d '{
    "name": "Ana Souza",
    "email": "ana.souza@email.com",
    "department": "TI"
}'
```

---

### ❌ Remover funcionário

```bash
curl -X DELETE http://localhost:8080/employees/{id}
```

Substitua `{id}` pelo UUID do funcionário.

---

## 🤖 Uso de IA Generativa

Durante o desenvolvimento, foi utilizada Inteligência Artificial para:

- ✅ Criar testes unitários e testes de integração com JUnit 5 e Mockito
- ✅ Gerar a lista de funcionários de teste
- ✅ Auxiliar na escrita do `docker-compose.yml` e `Dockerfile`
- ✅ Garantir organização de camadas segundo os princípios Clean Architecture, DDD e SOLID 
- ✅ Escrever este README.md 

---

## 📌 Considerações finais

Essa aplicação foi desenvolvida com foco em qualidade, clareza de arquitetura e separação de responsabilidades, seguindo os padrões recomendados para aplicações com Spring Boot.

---