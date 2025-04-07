
# Desafio - Backend JAVA | Tinnova

## 📘 Sobre o Projeto
Este projeto foi desenvolvido como parte da avaliação técnica da empresa Tinnova e segue os padrões arquiteturais, como Clean Code, DDD, SOLID e separação de responsabilidades entre camadas.

O sistema foi dividido em **5 desafios progressivos**, cada um em seu próprio módulo, para garantir clareza, testabilidade e manutenibilidade.

---

## 🧠 Architecture Haiku

### 🎯 Objetivos do Negócio
- Resolver problemas lógicos de forma clara e escalável
- Demonstrar domínio de Java e Spring Boot com boas práticas

### 🔐 Restrições
- Operação em API REST
- Foco exclusivo em backend
- Independência entre desafios

### ⚙️ Atributos de Qualidade
Clean Code > Clareza de camadas > Testabilidade

### 🧱 Decisões de Design
- Java Spring Boot + Maven
- Estrutura em camadas: Domain, API, Service, Controller, Repository
- Validações com Jakarta
- H2 para ambiente local

---

## 📂 Desafios Implementados

### 🟢 Desafio 1 - Sistema de Eleição
**Calcula o percentual de votos válidos, brancos e nulos.**

- **POST** `/v1/eleicao`
```json
{
  "votosBrancos": 30,
  "votosNulos": 15,
  "votosValidos": 55
}
```
- **Response:**
```json
{
  "totalVotos": 100,
  "percentualBrancos": 30.0,
  "percentualNulos": 15.0,
  "percentualValidos": 55.0
}
```

---

### 🟡 Desafio 2 - Fatorial
**Cálculo do fatorial de um número inteiro positivo.**

- **POST** `/v2/fatorial`
```json
{
  "numero": 10
}
```
- **Response:**
```json
{
  "numero": 10,
  "resultado": 3628800
}
```

---

### 🔵 Desafio 3 - Múltiplos de 3 ou 5
**Soma de múltiplos de 3 ou 5 abaixo de um valor informado.**

- **POST** `/v3/multiplos`
```json
{
  "limite": 20
}
```
- **Response:**
```json
{
  "limite": 20,
  "resultado": 78
}
```

---

### 🔴 Desafio 4 - Ordenação
**Ordena um vetor de números inteiros.**

- **POST** `/v4/ordenador`
```json
{
  "vetor": [5, 3, 2, 4, 7, 1, 0, 6]
}
```
- **Response:**
```json
{
  "vetorOrdenado": [0, 1, 2, 3, 4, 5, 6, 7]
}
```

---

# 🚗 Desafio 5 - CRUD de Veículos
**CRUD completo com filtros, métricas e atualização parcial.**

### 📥 Exemplo de Requisição (POST)
**POST** `/v5/veiculos`
```json
{
  "veiculo": "Punto",
  "marca": "Fiat",
  "ano": 2020,
  "descricao": "Reat Completo",
  "cor": "Rosa Choque",
  "vendido": false
}
```

### 📤 Exemplo de Resposta (POST)
```json
{
  "idVeiculo": "ca31005f-382d-4c89-9494-b762b3638987",
  "veiculo": "Punto",
  "marca": "Fiat",
  "ano": 2020,
  "descricao": "Reat Completo",
  "cor": "Rosa Choque",
  "vendido": false,
  "dataCriacao": "2025-04-07T00:13:40.9053216",
  "dataAtualizacao": "2025-04-07T00:13:40.9053216"
}
```

### 🔄 Endpoints Principais
| Método  | Rota                                 | Descrição                                  |
|---------|--------------------------------------|--------------------------------------------|
| POST    | `/v5/veiculos`                       | Criar um novo veículo                       |
| GET     | `/v5/veiculos/todos`                 | Listar todos os veículos                    |
| GET     | `/v5/veiculos?marca=Fiat`            | Filtrar por marca                           |
| GET     | `/v5/veiculos?ano=2020`              | Filtrar por ano                             |
| GET     | `/v5/veiculos?cor=Rosa Choque`       | Filtrar por cor                             |
| GET     | `/v5/veiculos/{id}`                  | Buscar por ID                               |
| PUT     | `/v5/veiculos/{id}`                  | Atualizar completamente                     |
| PATCH   | `/v5/veiculos/{id}`                  | Atualização parcial                         |
| DELETE  | `/v5/veiculos/{id}`                  | Remover veículo                             |

---

## 📚 Documentação da API (Swagger)
Acesse a documentação interativa via Swagger em:

🔗 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- JUnit 5 + Mockito
- H2 Database (local)
- Springdoc OpenAPI (Swagger)

---

## 🚀 Como Executar
```bash
git clone https://github.com/mardsantana/Avaliacao-Tinnova
cd avalicao-tinnova
./mvnw spring-boot:run
```

Acesse: [http://localhost:8080](http://localhost:8080)

---

## 🧪 Testes via Postman
Clique no botão abaixo para importar automaticamente:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://cloudy-meadow-78898.postman.co/workspace/f3ee7a66-ee3e-4194-a0d4-d3b18289ab98)

Inclui exemplos para os desafios 1 a 5 com todos os métodos REST.

---

## 👨‍💻 Autor
**Mardson Santos de Santana**  
Desenvolvedor Backend Java  
🔗 [linkedin.com/in/seu-perfil](https://www.linkedin.com/in/mardson-santana98-java/)

---

## 📄 Licença
Uso exclusivo para fins de avaliação técnica da empresa Tinnova.
