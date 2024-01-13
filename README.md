
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 600 200" width="300" height="100">  <!-- Retângulo preto como fundo -->  <rect width="100%" height="100%" fill="black" />  <!-- Conteúdo original da imagem -->  <image href="https://devsuperior.com.br/_next/static/images/logo-062c6633a2eb15831642636f96aa2c6c.svg" width="80%" height="80%" x="10%" y="10%" />  </svg>

[![DevSuperior](https://github.com/elderbr/assets/blob/main/DevSuperior/devSuperior_icon.png?raw=true)
](https://devsuperior.com.br/)

## DESAFIO TDD Event City

### Capítulo: API REST, camadas, CRUD, exceções, validações

Este é um sistema de eventos e cidades com uma relação N-1 entre eles
["Diagrama Event City"](https://github.com/elderbr/assets/blob/main/DevSuperior/JavaSpringExpert/diagrama_city.png?raw=true)

---

### Critérios de correção:
- DELETE /cities/{id} deve retornar 404 Not Found quando id não existir

- DELETE /cities/{id} deve retornar 204 No Content quando id for independente

- DELETE /cities/{id} deve retornar 400 Bad Request quando id for dependente

- POST /cities deve inserir recurso

- GET /cities deve retornar recursos ordenados por nome

- PUT /events deve atualizar recurso quando id existir

- PUT /events deve retornar 404 Not Found quando id não existir