# Mediator

- Definir um objeto que encapsula a forma como um conjunto de objetos interagem. O mediator promove o acoplamento fraco ao evitar que os objetos se refiram unns aos outros explicitamente e permite variar suas innterações independentemente
- Utilize este padrão quando:
  - Um conjunto de objetos se comunica de maneiras bem-definidas, porém complexas. As interdependências resultantes são desestruturadas e difíceis de entender.
  - A reutilização de um objeto é difícil porque ele referencia e se comunica com muitos outros objetos
  - Um comportamento que está distribpuido entre várias classes deveria ser customizável, ou adaptável, sem excessiva especialização em subclasses