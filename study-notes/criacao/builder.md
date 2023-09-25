# Builder

- Separar a construção de objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações
- Use este padrão quando
  - O algoritmo para criação de um objeto complexo deve ser independente das partes que compoem o objeto e de como elas são montadas
  - O processo de construção deve permitir diferentes representações para objeto que é construido
- Este padrão é semelhante ao Abstract Factory no sentido de que também pode construir objetos complexos. A diferença principal é que o padrão Builder focaliza a construção de um objeto complexo passo a passo.
- A enfase do Abstract Factory é sobre famílias de objetos-produtos (simples ou complexos). O Builder retorna o produto como um passo final, mas no caso do padrão Abstract Factory o produto é retornado imediatamente