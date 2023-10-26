# Bridge

- Desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente
- Também conhecido como Handle/body
- Use o padrão quando:
  - Desejar evitar um vínculo permanente entre uma abstração e sua implementação. Isso pode ocorrer, por exemplo, quando a implementação deve ser selecionada ou alterada em tempo de execução
  - Tanto as abstrações como suas implementações tiverem de ser extensíveis por meio de subclasses. Neste caso, o padrão bridge permite combinar as diferentes abstrações e implemenação e estende-las independentemente;
  - Mudança na implementação de uma abstração não puderem ter impacto sobre os clientes; ou seja, quando o código dos mesmo não puder ser recompilado.
  - (C++) você deseja ocultar completamente a implementação de uma abstração dos cliente. Em C++, a representação de uma classe é vísível na interface da classe
  - Desenha compartilhar uma implementação entre múltiplos objetos (talvez usando a contagem de referências) e este fato deve estar oculto do cliente
- Um padrão abstract factory pode criar e configurar um bride específica. O padrão adapter é orientado para fazer com que as classes não-relacionados trabalhem em conjunto. Ele é normalmente aplicado a sistemas que já foram projetados. Por outro lado, o bridge é usado em um projeto, desde o inicio, para permitir que abstrações e implementações possam variar independentemente