# Command

- Encapsular uma solicitação como um objeto, desta forma permitindo parametrizar clientes com diferentes solicitações, enfileirar ou fazer o registro (log) de solicitações e suportar operações que podem ser desfeitas
- Também conhecido como action, transaction
- Use o padrão command quando:
  - Parametrizr objetos por uma ação a ser executada na forma como os objetos MenuItem fizeram acima. É possível espessar tal parametrização numa linguagem procedural através de uma função callback, ou seja, uma função que é registrada em algum lugar para ser chamada em um momento mais adiante
  - Especificar, enfileirar e executar solicitações em tempos diferentes. Um objeto Command pode ter um tempo de vida independente da solicitação original
  - Suportar desfazer operações. A operação Execute de command pode armazenar estados para reverter seus efeitos no próprio comando
  - Suportar registro (logging) de mudanças de maneiraque possam ser replicadas no caso de uma queda de sistema. Ao aumentar a interface de command com as operações de carrega e armazenar, você pode manter um registro persistente das mudanças
  - Estruturar um sistema em torno de operações de alto nível constrídas sobre operações primitivas. Tal estrutura é comum em sistemas de informação que suportam transações