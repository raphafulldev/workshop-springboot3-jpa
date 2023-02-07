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


## Foi implementado o padrão de projetos REST, visando romper a comunicação direta entre a camada de vizualização da camada de modelo de negócio.
![Mobile 1](https://github.com/raphafulldev/assets/blob/main/images/1.jpeg)

## Modelo Conceitual
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/2.jpeg)

## Passos para implementação das consultas:
- Foi criado repositório do JPA (Java Persistence API)

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/3.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/4.jpeg)
- Criada o service, que é a camada onde fica a lógica do negócio

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/5.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/6.jpeg)

- Classe controller/resources

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/7.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/8.jpeg)

## Tratamento de erros personalizados
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/9.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/10.jpeg)

## Povoamento (seeding) feito por meio de uma classe de testes
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/11.jpeg)


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
