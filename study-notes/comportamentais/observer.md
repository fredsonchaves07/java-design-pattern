# Observer

- Definir uma dependência um-para-muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente
- Tambem conhecido como Dependents, pubsub
- Use o padrão observer em qualquer uma das seguintes situações
  - Quando uma abstração tem dois aspectos, um dependente do outro. Encapsulando esses aspectos em objetos separados, permite-se variá-los e reutilizá-los independentemente
  - Quando uma mudança em um objeto exige mudanças em outros, e você não sabe quantos objetos necessitam ser mudados;
  - Quando um objeto deveria ser capaz de notificar outros objetos sem fazer hiptóses, ou usar informações, sobre quem são esses objetos. Em outras palavras, você não quer que esses objetos sejam fortemente acopolados
- Padrões relacionados com Mediator e Singleton