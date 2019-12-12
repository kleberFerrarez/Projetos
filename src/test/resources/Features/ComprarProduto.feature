#language: pt

Funcionalidade: Testes Básicos

@Teste3
Cenário: Comprar Produto
	Dado que o ator acessa o site 4devs_ComprarProduto
 	E o usuario clica no botão gerar pessoas_ComprarProduto
 	E o sistema visualiza e captura os dados pessoais criados_ComprarProduto
  E o usuário acessa o site da magazineluiza_ComprarProduto
	E o usuario clica no botão entre ou cadastre-se_ComprarProduto
	E o usuario informa um e-mail e clica no botão continuar_ComprarProduto
	E o usuario preenche os dados para o efetuar o cadastro e clica no botão continuar
	E informa o produto e clica em Pesquisar_ComprarProduto
	E o usuario visualiza o detalhe do produto_ComprarProduto
	E clica no botão Adicionar a Sacola_ComprarProduto
	Então o produto vai para a cesta de compras_ComprarProduto