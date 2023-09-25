# Builder

- Separar a constru��o de objeto complexo de sua representa��o de modo que o mesmo processo de constru��o possa criar diferentes representa��es
- Use este padr�o quando
  - O algoritmo para cria��o de um objeto complexo deve ser independente das partes que compoem o objeto e de como elas s�o montadas
  - O processo de constru��o deve permitir diferentes representa��es para objeto que � construido
- Este padr�o � semelhante ao Abstract Factory no sentido de que tamb�m pode construir objetos complexos. A diferen�a principal � que o padr�o Builder focaliza a constru��o de um objeto complexo passo a passo.
- A enfase do Abstract Factory � sobre fam�lias de objetos-produtos (simples ou complexos). O Builder retorna o produto como um passo final, mas no caso do padr�o Abstract Factory o produto � retornado imediatamente