# Memento

- Sem violar o encapsulamento, capturar e externalizar um estado interno de um objeto, de maneira que o objeto possa ser restaurado para esse estado mais tarde
- Também conhecido como token
- Use este padrão quando
  - Um instantâneo de (alguma porção do) estado de um objeto deve ser salvo de maneira que possa ser restaurado para esse estado mais tarde;
  - Uma interface direta para obtenção do estado exporia detalhes de implementação e romperia o encapsulamento do objeto
- Mementos podem ser usados para iteração. Se relaciona com o padrão Iterator

