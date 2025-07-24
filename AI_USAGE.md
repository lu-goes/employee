# Uso de IA Generativa no Projeto

## 🛠️ Ferramentas Utilizadas

- BlackBox AI para:
    - Referência de padrão da estrutura do projeto (DDD, Clean Architecture)
- ChatGPT (OpenAI) para:
    - Apoio em testes unitários com JUnit 5 e Mockito
    - Auxílio na escrita do `docker-compose.yml` e `Dockerfile`
    - Elaboração da documentação
    - Refatoração de código para aderência ao SOLID
- Claude 3.5 para:
    - Sugestão de validações e endpoints

---

## 💬 Prompts Efetivos

### 1. Estrutura e organização do projeto
**Prompt:**  
"Preciso de uma referência/exemplo de DDD, Clean Architecture e SOLID. O exemplo precisa ser de uma aplicação web"

**Resultado:**  
Resposta com exemplo de uma aplicação web que implementa os conceitos de DDD, Clean Architecture e SOLID. O exemplo é apresentado em formato HTML explicando sobre os pacotes (`domain`, `application`, `adapters`, `config`).

---

### 2. Criação de testes unitários com JUnit 5 e Mockito
**Prompt:**  
"Crie testes unitários com JUnit 5 e Mockito para a classe EmployeeService que realiza cadastro, listagem e remoção de funcionários."

**Resultado:**  
Classe de testes gerada com cobertura de casos de sucesso, garatindo que qualquer alteração das funcionalidades os testes terão que ser revistos ou quebrarão.

---

### 3. Montagem da estrutura do README.md
**Prompt:**  
"Crie uma estrutura de um arquivo README.md para um projeto java com docker, spring boot e jpa. Inclua também instruções para rodar o projeto localmente e via Docker."

**Resultado:**  
Arquivo `README.md` estruturado com instruções de execução, exemplos de quebrar por tópicos e padronização para projetos Java Spring Boot.

---

## 🧠 Decisões Influenciadas por IA

1. Separação das camadas com base em DDD e Clean Architecture
2. Organização do `pom.xml` com as versões compatíveis do Spring Boot 3.x
3. Auxílio da estrutura Dockerizada com `Dockerfile` e `docker-compose.yml`
4. Criação de testes
5. Solução de iteração do resultado de uma consulta de uma tabela para uma lista de employeeresponse
6. Criação da pipeline no GitHub

---

## ⚠️ Limitações e Soluções

- Algumas sugestões iniciais estavam inadequadas:
  - Sugestão da IA era retornar um objeto do tipo employeejpaentity no response das requisições de get e post. Esse tipo de situação deve ser evitada para garantir que dados sensíveis não sejam expostos. 
  - Sugestão da IA era manter no docker-compose a versão do .jar estática. Fiz um ajuste para docker-compose para pegar o .jar do dockerfile gerado no momento do build.
- Código gerado não validava e-mails → adicionado `@Email` via Bean Validation.

---

## ✅ Conclusão

A IA foi essencial para acelerar o desenvolvimento, garantir boas práticas, criar documentação clara e manter um padrão arquitetural consistente em todo o projeto.