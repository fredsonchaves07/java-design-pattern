# Proxy

- Fornece um substituto ou marcador da localização de outro objeto para controlar o acesso a esse objeto
- O padrão proxy introduz um nível de referência indireto no acesso a um objeto. A referência indireta adicional tem muitos usos, dependendo do tipo do proxy
  - Um proxy remoto pode ocultar o fato de que um objeto reside num espaço de endereçamento diferente
  - Um proxy virtual pode executar otimizações, tais como a criação de um objeto sob demanda
  - Tanto proxies de proteção como smart references permitem tarefas adicionais de organização (housekeeping) quando o objeto é acessado