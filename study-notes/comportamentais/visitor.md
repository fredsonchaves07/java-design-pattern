# Visitor

- Representar uma operação a ser executada nos elementos de uma estrutura de objetos. Visitor permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera
- Use o padrão quando:
  - Uma estrutura de objetos contém muitas classes de objetos com interfaces que diferem e você deseja executar operações sobre esses objetos que dependem das suas classes concretas
  - Muitas operações distintas e não relacionadas necessitam ser executadas sobre objetos de uma estrutura de objetos, e você deseja evitar a "poluição" das suas classes com essas operações
  - As classes que definem a estrutura do objeto raramente mudam, porém, você frequentemente deseja definir novas operações sobre a estrutura.