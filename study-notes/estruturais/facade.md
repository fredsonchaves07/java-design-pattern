# Façade

- Fornecer uma interface unificada para um conjunto de interfces em um subsistema
- Define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado
- Use o padrão quando:
  - Desejar fornecer uma interface simples para um subsistema complexo. Uma fachada pode fornecer, por comportamento padrão, uma visão simples do sistema, que é boa o suficiente para a maioria dos clientes
  - Existirem muitas dependências entre clientes e classes de implementação de uma abstração
  - Desejar estruturar subsistemas em camada