# Strategy

- Definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam
- Também conhecido como Policy
- Use o padrão Strategy quando:
  - Muitas classes relacionadas diferem somente no seu comportamento. As estratégias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos
  - Você necessita de variantes de um algoritmo. Por exemplo, pode definir algoritmos que refletem diferentes soluções de compromisso entre espaço / tempo. As estratégias podem ser usadas quando essas variantes são implementadas como uma hierarquia de classes de algoritmos
  - Um algoritmo usa dados dos quais os clientes não deveriam ter conhecimento
  - Use este padrão para evitar a exposição das estruturas de dados complexas, específicas do algoritmo
  - Uma classe define muitos comportamentos, e estes aparecem em suas operações como múltiplos comandos condicionais da linguagem
- Este padrão está relacionado com Flyweight