# Interpreter

- Dada uma linguagem, definir uma representação para sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças dessa linguagem
- O padrão interpreter descreve como definir uma gramática para linguagens simples, representar setençs na linguagem e interpretar essas sentenças
- Este padrão funciona melhor quando:
  - A gramática é simples. Para gramáticas complexas, a hierarrquia de classes para a gramaática se torna grande e incontrolável. Em tais casos, ferramentas tais como geradores de analisadores são uma alternativa melhor
  - A eficiência não é uma preocupação crítica. Os interpretadores mais eficientes normalmente não são implementados pela interpretação direta de árvores de análise sintática, mas pela tradução para uma outra forma