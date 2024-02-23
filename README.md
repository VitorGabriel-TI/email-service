![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![AWS SES](https://img.shields.io/badge/Amazon_AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white)

Este projeto é uma API construída usando **Java, Java Spring, AWS Simple Email Service.**

## Table of Contents

- [Instalação](#instalação)
- [Iniciando o programa](#iniciando-o-programa)
- [API Endpoints](#api-endpoints)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/VitorGabriel-TI/email-service.git
```

2. Instale as dependências com o Maven

3. Atualize `application.properties` inserindo suas credenciais da AWS 

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Iniciando o programa

1. Instale as dependências com o Maven e inicie a aplicação
2. A API será acessível na porta http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Envie um e-mail do seu remetente para o destino
```

**BODY**
```json
{
  "to": "exemplodeemail@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```
