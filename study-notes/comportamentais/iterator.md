# Iterator

- Fornecer um meio de acessar, sequencialmente, os lementos deum objeto agregado sem expor a sua representação subjacente
- Também conhecido como cursor
- Use este padrão:
  - Para acessar os conteúdos de um objeto agregado sem expor a sua representação interna
  - Para suportar múltiplois percursos de objetos agregados;
  - Para fornecer uma interface uniforme que percorra diferentes estruturas agregadas (ou seja, suportar a iteração polimórfica)
- Os iterators são comuns em sistemas orientados a objetos. A maioria das bibliotecas de classes de coleções oferece iteradores de uma menira a outra