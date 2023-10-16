# Singleton

- Garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso para a mesma
- Use este padrão quando
  - For preciso haver apenas uma instância de uma classe, e essa instância tiver que dar acesso aos clientes através de um ponto bem conhecido;
  - A única instância tiver de ser extensível através de subclasses, possibilitando aos clientes uar uma instância estendida sem alterar o seu código
  - 