# Descubra seu Stand — Backend

API REST feita em **Spring Boot** que descobre o Stand (JoJo's Bizarre Adventure) de uma pessoa a partir da data de nascimento, usando uma lógica baseada em arcanos de tarot e soma dos dígitos da data.

##  Sobre o projeto

Esse backend recebe a data de nascimento do usuário, calcula o arcano correspondente (somando os dígitos da data até chegar a um número de arcano) e retorna o Stand associado a esse arcano, com base num mapeamento inspirado nos arcanos do tarot presentes em JoJo's Bizarre Adventure.

##  Tecnologias

- Java
- Spring Boot
- Spring Web (REST)
- Maven

## 📁 Estrutura do projeto

```
src/main/java/.../
├── model/          # Enums e classes de domínio (Stand, Arcano, etc.)
├── service/        # Lógica de negócio (cálculo do arcano, mapeamento pro Stand)
├── controller/      # Endpoints REST
└── configurate/     # Configurações (ex: CORS)
```

##  Endpoint principal

### `POST /api/stand/descobrir`

Recebe a data de nascimento e retorna o Stand correspondente.

**Request (exemplo):**
```json
{
  "dataNascimento": "1998-05-23"
}
```

**Response (exemplo):**
```json
{
  "arcano": "O Sol",
  "stand": "Star Platinum",
  "descricao": "..."
}
```

> Os nomes exatos dos campos podem variar conforme a versão do código — ajuste esse exemplo se necessário.

##  Como rodar localmente

1. Clone o repositório
2. Certifique-se de ter o **JDK** e o **Maven** instalados (ou use o wrapper `./mvnw`)
3. Rode o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
4. A API sobe por padrão em `http://localhost:8080`

##  Testando

O projeto foi testado manualmente via **Postman**, enviando requisições `POST` para `/api/stand/descobrir` com diferentes datas de nascimento para validar o mapeamento arcano → Stand.

##  CORS

O backend está configurado para aceitar requisições do frontend (React) hospedado separadamente. Se for rodar localmente com o front, verifique se a origem (`localhost:porta`) está liberada na configuração de CORS.

##  Status

Projeto funcional, com backend e frontend integrados e implantados em produção (Spring Boot no backend, React no frontend).

##  Autor

Ryan Marques Monteiro Falcão — projeto criado como forma de aprendizado prático de Spring Boot e integração com React.
