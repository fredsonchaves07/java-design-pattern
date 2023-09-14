# Abstract Factory

- Fornecer uma interface para cria��o de fam�lias de objetos relacionados ou dependentes sem especificar suas classes concretas
- Use o padr�o quando:
  - Um sistema deve ser independente de como seus produtos s�o criados, compostos ou representados;
  - Um sistema deve ser configurado como um produto de uma fam�lia de m�ltiplos produtos
  - Uma fam�lia de objetos-produto for projetada para ser usada em conjunto e voc� necessita garantir esta restri��o
  - Voc� quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, n�o suas implementa��es
- O padr�o abstract factory tem os seguintes benef�cios e desvantagens
  - Ele isola as classes concretas: Ajuda a controlar as classes de objetos criadas por uma aplica��o
  - Torna f�cil a troca de fam�ias de produtos: A classe de uma f�brica concreta aparece apenas uma vez numa aplica��o, isto �, quando � instanciada. Isso torna f�cil mudar a f�brica concreta que uma aplica��o usa. Ela pode usar diferentes configura��es de produtos simplesmente trocando a f�brica concreta
  - Promove a harmonia entre produtos
  - D�ficil suportar novos tipos de produtos