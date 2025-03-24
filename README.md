# Santander Dev Week 2023
# RESTful API da Santander Dev Week 2023  🚀  

Construída em **Java 17** com **Spring Boot 3**.  

## 🔹 Principais Tecnologias  

- **Java 17**  
  Utilizaremos a versão **LTS** mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece.  

- **Spring Boot 3**  
  Trabalharemos com a mais nova versão do **Spring Boot**, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de **autoconfiguração**.  

- **Spring Data JPA**  
  Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com **bancos de dados SQL**.  

- **OpenAPI (Swagger)**  
  Vamos criar uma **documentação de API eficaz** e fácil de entender usando a **OpenAPI (Swagger)**, perfeitamente alinhada com a alta produtividade que o **Spring Boot** oferece.  

- **Railway**  
  Facilita o **deploy e monitoramento** de nossas soluções na **nuvem**, além de oferecer diversos **bancos de dados como serviço** e **pipelines de CI/CD**.  


## Diagrama de classes

``` mermaid
classDiagram
    class User {
        Account account
        Card card
        Feature[] features
        News[] news
    }

    class Account {
        String number
        String agency
        double balance
    }

    class Card {
        String number
        double limit
    }

    class Feature {
        String icon
        String description
    }

    class News {
        String icon
        String description
    }

    User "1" *--> "1" Account
    User "1" *--> "1" Card
    User "1" *--> "N" Feature
    User "1" *--> "N" News 
```

# 📄 Documentação da API (Swagger)  

🔗 Acesse a documentação da API pelo link abaixo:  
**[Swagger UI - Santander Dev Week 2023](https://sdk-2023-api-production.up.railway.app/swagger-ui/index.html)**  

⚠️ **Disponibilidade Limitada**  
Esta API ficará disponível no **Railway** por um período de tempo limitado.  

## 🚀 Código-Fonte Aberto  
Este é um projeto **open-source**, então sintam-se à vontade para:  
✔️ **Cloná-lo**  
✔️ **Modificá-lo** (é um ótimo projeto base para novos projetos!)  
✔️ **Executá-lo localmente** ou onde achar mais interessante  

💡 **Obrigado DIO!!** 🥰  
