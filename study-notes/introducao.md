# Introdu��o a padr�es de projetos

- Os padr�es resolvem problemas espec�ficos e tornam os projetos orientados a objetos mais flex�veis e, em �ltima inst�ncia, reutiliz�veis
- Em geral, o padr�o tem quatro elementos essenciais
  - O nome padr�o: � uma refer�ncia que podemos usar para descrever um problema de projeto, suas solu��es e consequ�ncias em uma ou duas palavras. Dar nome a um padr�o aumenta imediatamente o nosso vocabul�rio de projeto. Isso nos permite projetar em um n�vel mais alto de abstra��o
  - O problema: descreve em que situa��o aplicar o padr�o. Explica o problema e seu contexto
  - A solu��o: descreve os elementos que compoem o padr�o de projeto, seus relacionamentos, suas responsabilidades e colabora��es
  - As consequ�ncias: s�o os resultados e an�lises das vantagens e desvantagens (trade-offs) da aplica��o do padr�o. 
- Padr�es de projeto s�o descri��es de objetos e classes comunicantes que precisam ser personalizadas para resolver um problema geral de projeto num contexto particular

## Projetando mudan�as

- Um projeto que n�o leva em considera��o a possibilidade de mudan�as est� sujeito ao risco de um agrnade reformula��o no futuro. Essas mudan�as podem envolver redefini��es e reimplementa��es de classes, modifica��o de clientes e retestagem do sistema
- Os padr�es de projjeto ajudam a evitar esses problemas ao garantirem que o sistema possa mudar segundo maneiras espec�ficas
- Algumas causas comuns de refomula��o de projeto, junto com o padr�o que as tratam
  1. Criando um objeto pela especifica��o expl�cita de uma classe: Especificar um nome de uma classe quando voc� cria um objeto fz com que se comprometa com uma implementa��o em particular, em vez de se comprometer com uma determinada interface. Este compromisso pode complicar futuras mudan�as. Para evit�-lo, crie objetos indiretamente. Padr�es de projeto: Abstract factory, Factory method, Prototype
  2. Depend�nca de opera��es espec�ficas: Quando voc� especifica uma oper��o em particular, se compromete com uma determinada maneira de atender a uma solicita��o. Evitando solicita��es codificadas inflexivelmente (hard-coded), voc� torna mais f�cil mudar a maneira como uma solicita��o � atendida, tanto em tempo de compila��o como o tempo de execu��o. Padr�es de projeto: Chain of responsibility, Command
  3. Depend�ncia da plataforma de hardware e software: As interfaces externas do sistema operacional e as API s�o diferentes para diferentes plataformas de hardware e software. O software que dependede uma plataforma espec�fica ser� mais dif�cil de portar para outras plataformas. pode ser at� mesmo dif�cil mante-lo atualizado para sua plataforma nativa. Portanto, � importante projetar o seu sistema para limitar suas depend�ncias de plataformas. Padr�es de projeto: Abstracty Factory, Bridge
  4. Depend�ncia de representa��es ou implementa��es de objetos: Clientes que precisam saber como um objeto � representado, armazenado, localizado ou implementado podem necessitar ser alterados quando esse objeto muda. Ocultar essas informa��es dos clientes evita a propaga��o de mudan�a em cadeia. Padr�es de projeto: Abstract Factory, Bridge, Memento, Proxy
  5. Depend�ncia algor�tmicas: Os algoritmos s�o frequentemente estendidos, otimizados e subsitu�dos durante o desenvolvimento e reutiliza��o. Os objetos que dependem de algoritmos ter�o que mudar quando o algoritmo mudar. Portanto os algoritmos que provavelmente mudar�o deveriam ser isolados. Padr�es de projeto: Builder, Iterator, Strategy, Template, Method, Visitor
  6. Acoplamento forte: Classes que s�o fortemente acopladas s�o dif�ceis de reutilizar isoladamente, uma vez que dependem umas das outras. O acoplamento forte leva a sistemas monol�ticos, nos quais voc� n�o pode mudar ou remover uma classe em compreender e mudar muitas outras classes. Os padr�es de projeto usam t�cnicas como acoplamento abstrato e projeto em camadas para obter sistemas fracamente acoplados. Padr�es de projeto: Abstract factory, Bridge, Chain of Responsibility, Command, Fa�ade, Mediator, Observer
  7. Estendendo a funcionalidade pelo uso de subclasses: A composi��o de objetos, em geral, e a delega��o, em particular, fornecem alternativas flex�veis � heran�a para combina��o de comportamentos. Muitos padr�esde projeto produzem arquiteturas (design) nas quais voc� pode introduzir uma funcionalidade customizada smplesmente pela defini��o de uma subclasse e pela composi��o de suas inst�ncias com as existentes. Padr�es de projeto: Bridge, Chain of responsibility, Composite, Decorator, Observer, Strategy
  8. Incapacidade para alterar classes de modo conveniente: Algumas vezes voc? tem que modificar uma classe que n�o pode ser convenientemente modificada. Talvez necessite do c�digo fonte e n�o disponha do mesmo. Ou, talvez, qualquer mudan�a possa requerer a modifica��o de muitas subclasses existentes. Padr�es de projeto oferencem maneiras para modifica��o de classes em tais circust�ncias. padr�es d eprojeto: Adapter, Decorator, Visitor

## Como selecionar um padr�o de projeto?

- Apresentamos diversas abordagens para encontrar o padr�o de projeto correto para o seu problema
  - Considere como padr�es de projeto solucionam problemas de projeto
  - Examine as se��es inten��o
  - Estude como os padr�es se interrelacionam
  - Estude padr�es de finalidades semelhantes
  - Examine uma causa de reformula��o de projeto
  - Considere o que deveria ser vari�vel no seu projeto