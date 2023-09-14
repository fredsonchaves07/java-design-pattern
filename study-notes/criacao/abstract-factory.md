# Abstract Factory

- Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas
- Use o padrão quando:
  - Um sistema deve ser independente de como seus produtos são criados, compostos ou representados;
  - Um sistema deve ser configurado como um produto de uma família de múltiplos produtos
  - Uma família de objetos-produto for projetada para ser usada em conjunto e você necessita garantir esta restrição
  - Você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas implementações
- O padrão abstract factory tem os seguintes benefícios e desvantagens
  - Ele isola as classes concretas: Ajuda a controlar as classes de objetos criadas por uma aplicação
  - Torna fácil a troca de famíias de produtos: A classe de uma fábrica concreta aparece apenas uma vez numa aplicação, isto é, quando é instanciada. Isso torna fácil mudar a fábrica concreta que uma aplicação usa. Ela pode usar diferentes configurações de produtos simplesmente trocando a fábrica concreta
  - Promove a harmonia entre produtos
  - Díficil suportar novos tipos de produtos