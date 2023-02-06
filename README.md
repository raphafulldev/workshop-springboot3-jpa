# Workshop Springboot3 JPA
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Workshop Springboot3 JPA é um projeto para estudo de Web Services com Spring Boot e JPA / Hibernate

## Objetivos do Projeto
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções


## Foi implementado o padrão de projetos Web MVC, visando romper a comunicação direta entre a camada de vizualização da camada de modelo de negócio.
![Mobile 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2021.33.28.jpeg)

## Modelo Conceitual
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2021.27.43.jpeg)

## Passos para implementação das consultas:
- Foi criado repositório do JPA (Java Persistence API)

![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.01.53.jpeg)
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.15.11.jpeg)
- Criada o service, que é a camada onde fica a lógica do negócio

![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.19.14.jpeg)
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.20.52.jpeg)

- Classe controller/resources

![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.23.45.jpeg)
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.25.17.jpeg)

## Tratamento de erros personalizados
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.28.28.jpeg)
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.30.04.jpeg)

## Povoamento (seeding) feito por meio de uma classe de testes
![Web 1](https://github.com/raphafulldev/workshop-springboot3-jpa/blob/main/WhatsApp%20Image%202023-02-05%20at%2022.34.36.jpeg)


# Tecnologias utilizadas
## Back end
- Java
- Postman para testes do CRUD
- Banco de dados relacional H2 
- PostgresSQL

### Pré-requisitos: Java 11 ou superior

```bash
# clonar repositório
git clone https://github.com/raphafulldev/workshop-springboot3-jpa

```



# Autor

Raphael Barros Barreto

https://www.linkedin.com/in/raphael-barros-376583264/

Agradecimentos:
Professor: Nélio Alves.

https://devsuperior.com.br/cursos

https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br
