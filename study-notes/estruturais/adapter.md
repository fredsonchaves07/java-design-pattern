# Adapter

- Converter a interface de uma classe em outra interface, esperada pelos clientes. O Adapter permite que classes com interfaces incompatíveis trabalhem em conjunto o que, de outra forma, seria impossível
- Também conhecido como wrapper
- Use o padrão quando
  - Você quiser usar uma classe existente, mas sua interface não corresponder à interface de que necessita;
  - Você quiser criar uma classe reutilizável que coopere com classes não relacionadas ou não previstas, ou seja, classes que não necesseriamente tenham inerfaces compatíveis;
  - (Somente para adaptadores de objetos) você precisar usar várias subclasses existentes, porém, for impraticável adptar essas interfaces criando subclasses para cada uma. Um adaptardor de objeto pode adpatar a interface da sua classe-mãe