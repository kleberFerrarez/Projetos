#language: pt

Funcionalidade: Teste Cadastrar

@Teste1
Cenário: Criar Usuário
 	Dado que usuário acessa o site 4devs
 	E clica no botão gerar pessoas
 	E visualiza e captura os dados pessoais criados 
  E o usuário acessa o site da magazineluiza para efetuar o cadastro
	E clica no botão entre ou cadastre-se
	E informa um e-mail válido e clica no botão continuar
	E o usuario preenche os dados para o cadastro
	E o usuario clica no botão continuar
	Então visualiza o cadastro do usuário efetuado com sucesso