# Template Method

- Definir o esqueleto de um algoritmo em uma operação, postergando alguns passos para as subclasses. 
- Permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo
- Este padrão pode ser usado:
  - Para implementar as partes invariantes de um algoritmo uma só vez e deixar para as subclasses a implementação do comportamento que pode variar
  - Quando o comportamento comum entre as subclasses deve ser fatorado e concentrado numa classe comum entre subclasses deve ser fatorado e concentrado numa classe comum para evitar a duplicação de código. Este é um bom exemplo de "refatorar para generizar"
  - Para controlar extensões de subclasses. Você pode definir um método-template que chama operações "gancho" em pontos específicos, desta forma permitindo extensões somente nesses pontos
- Os métodos templates são tão fundamentais que eles podem ser encontrados em quase todas as classes abstratas
- Factory Method, Strategy estão relacionados com este padrão