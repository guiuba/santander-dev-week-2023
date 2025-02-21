# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week

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
