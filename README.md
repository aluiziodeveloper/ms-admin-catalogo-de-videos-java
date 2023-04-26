# FullCycle Course

## Projeto Prático - Backend Java (Microservice)

Microserviço referente ao backend da Administração do Catálogo de Vídeos utilizando:

- Clean Architecture
- Domain-Driven Design (DDD)
- Test Driven Development (TDD)
- Outras práticas de mercado


## Ferramentas necessárias

- JDK 17
- IDE de sua preferência
- Docker


## Executando a aplicação

1. Clonar este repositório.

2. Subir o banco de dados MySQL com Docker:

```shell
docker compose up -d
```

3. Executar as migrações do MySQL com o Flyway:

```shell
./gradlew flywayMigrate
```

4. Executar a aplicação como SpringBoot app:

```shell
GOOGLE_CLOUD_CREDENTIALS=A \
  GOOGLE_CLOUD_PROJECT=A \
  ./gradlew bootRun
``` 

> Também é possível executar como uma aplicação Java através do método main() na classe Main.java.


## Minhas Redes Sociais

[Site Aluizio Developer](https://aluiziodeveloper.com.br)

[YouTube](https://www.youtube.com/jorgealuizio)

[Servidor no Discord](https://discord.gg/3J87BMz5fD)

[LinkedIn](https://www.linkedin.com/in/jorgealuizio/)