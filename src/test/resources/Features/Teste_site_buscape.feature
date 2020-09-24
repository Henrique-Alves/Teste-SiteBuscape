#language: pt

Funcionalidade: Buscar produtos
Como usuário 
Realizo pesquisa de produtos


Cenário: Deve inserir usuário com sucesso
Quando clicar em entrar
E inserir email "severinobento097@gmail.com"
E clicar em continuar
E inserir um nome
E clicar no botão para avançar
Então o sistema exibe a página inicial


Cenário: Deve Buscar Produto com sucesso
Quando inserir o nome do produto
E clicar em Buscar
Então o sistema deve exibir o nome do produto

