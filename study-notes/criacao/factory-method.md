# Factory Method

- Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O factory method permite adirar a instanciação para subclasses
- Use este padrão quando:
  - Uma classe não pode antecipar a classe dos objetos que deve criar;
  - Uma classe quer que suas subclasses especifiquem os objetos que criam;
  - Classes delegam responsabilidade para uma dentre várias subclasses auxiliares, e você quer localizar o conhecimento dequal subclasse auxiliar que é adelegada
