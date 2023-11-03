# Flyweight

- Usar compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina
- O aspecto negativo de tal estruturação é o seu custo. Mesmo documentos de tamanhos moderados podem requerer centenas de milhares de objetos-caracteres, o que consumirá uma grande quantidade de memória, podendo incorrer num custo inaceitável em tempo de execução
- A eficiência do padrão depende muito de como e onde ele é usado. Aplique o padrão quando todas as condições a seguir forem verdadeiras:
  - Uma aplicação utiliza um grande número de objetos;
  - Os custos de armazenamento são altos por causa da grande quantidade de objetos
  - A maioria dos estados de objetos pode ser tornada extrínseca;
  - Muitos grupos de objetos podem ser substituídos por relativamente poucos objetos compartilhados, uma vez que estados extrínsecos são removidos
  - A aplicação não depene da identidade dos objetos. Uma vez que objetos podem ser compartilhados, testes de indentidade produzirão o valor verdadeiro para objetos conceitualmente distintoszz