# Chain of Responsability

- Evitar o acoplamento do remetente de uma solicitação ao seu recepetor, ao dar a mais de um objeto a oportunidade de tratar a solicitação
- Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate
- A ideia desse padrão é desacoplar remetentes e receptores fornecendo a múltiplos objetos a oportunidade de tratar uma solicitação. A solicitação é passada ao longo de uma cadeia de objetos até que um deles a trate
- Use o padrão quando:
  - Mais de um objeto pode tratar uma solicitação e o objeto que a tratará não conhecido a priori. O objeto que trata a solicitação deve ser escolhido automaticamente
  - Você quer emitir uma solicitação para um dentre vários objetos, sem especificar explicitamente o receptor
  - O conjunto de objetos que pode tratar uma solicitação deveria ser especificado dinamicamente