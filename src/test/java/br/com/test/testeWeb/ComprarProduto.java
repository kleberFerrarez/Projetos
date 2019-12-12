package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ComprarProduto {
	String nome4DevsCapturado;
	String cpf4DevsCapturado;
	String dataNasc4DevsCapturado;
	String email4DevsCapturado;
	String cep4DevsCapturado;
	String senha4DevsCapturado;
	String numeroRes4DevsCapturado;
	String cel4DevsCapturado;
	
	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();
		
	// CENARIO CRIAR CADASTRO
	@Dado("que o ator acessa o site 4devs_ComprarProduto")
	public void url4dev() throws IOException {
		bpj.navegar(web.geturl4devs());	
		bpj.Print("Comprar_Evidência 1"); //print 1
		bpj.esperar(1000);
	}
	
	@E ("o usuario clica no botão gerar pessoas_ComprarProduto")
	public void pesquisa() throws IOException {
		bpj.clicar(web.getbotaoGerarPessoas());
		bpj.esperar(1000);
		bpj.Print("Comprar_Evidência 2"); //print 2
	}
	
	@E ("o sistema visualiza e captura os dados pessoais criados_ComprarProduto")
	public void capturaDados4Devs(){
		
		bpj.clicar(web.getnome4Devs());
		nome4DevsCapturado = bpj.obterTextoDaTela(web.getnome4Devs());
		System.out.println(nome4DevsCapturado);
		
		bpj.clicar(web.getcpf4Devs());
		cpf4DevsCapturado = bpj.obterTextoDaTela(web.getcpf4Devs());
		System.out.println(cpf4DevsCapturado);
		
		bpj.clicar(web.getdataNasc4Devs());
		dataNasc4DevsCapturado = bpj.obterTextoDaTela(web.getdataNasc4Devs());
		System.out.println(dataNasc4DevsCapturado);
		
		bpj.clicar(web.getemail4Devs());
		email4DevsCapturado = bpj.obterTextoDaTela(web.getemail4Devs());
		System.out.println(email4DevsCapturado);
		
		bpj.clicar(web.getcep4Devs());
		cep4DevsCapturado = bpj.obterTextoDaTela(web.getcep4Devs());
		System.out.println(cep4DevsCapturado);
		
		bpj.clicar(web.getsenha4Devs());
		senha4DevsCapturado = bpj.obterTextoDaTela(web.getsenha4Devs());
		System.out.println(senha4DevsCapturado);
		
		bpj.clicar(web.getnumeroRes4Devs());
		numeroRes4DevsCapturado = bpj.obterTextoDaTela(web.getnumeroRes4Devs());
		System.out.println(numeroRes4DevsCapturado);
		
		bpj.clicar(web.getcel4Devs());
		cel4DevsCapturado = bpj.obterTextoDaTela(web.getcel4Devs());
		System.out.println(cel4DevsCapturado);
		bpj.esperar(2000);
	}
			
	@E ("o usuário acessa o site da magazineluiza_ComprarProduto")
	public void abrirSiteMagazineluizacadastro() throws IOException {
		bpj.navegar(web.geturlmagazineluizacadastro());
		bpj.Print("Comprar_Evidência 3"); //print 3
		bpj.esperar(2000);
	}
		
	@E ("o usuario clica no botão entre ou cadastre-se_ComprarProduto")
	public void entreCadastar() {
		bpj.clicar(web.getentreCadastrar());
		bpj.esperar(1000);
	}
	
	@E ("o usuario informa um e-mail e clica no botão continuar_ComprarProduto")
	public void contaEmail() throws IOException {
		bpj.escrever(web.getcontaEmail(), email4DevsCapturado);
		bpj.Print("Comprar_Evidência 4"); //print 4
		bpj.clicar(web.getbotaoContinuar());
		bpj.esperar(2000);
	}
	
	@E ("o usuario preenche os dados para o efetuar o cadastro e clica no botão continuar")
	public void prencherUsusarioProduto() throws IOException {
		bpj.escrever(web.getpreencheCpf(), cpf4DevsCapturado);
		bpj.escrever(web.getpreencheNomeCompleto(), nome4DevsCapturado);
		bpj.escrever(web.getpreencheDataNasc(), dataNasc4DevsCapturado);
		bpj.escrever(web.getpreencheSenha(), senha4DevsCapturado);
		bpj.escrever(web.getpreencheConfirmaSenha(), senha4DevsCapturado);
		bpj.escrever(web.getpreencheCep(), cep4DevsCapturado);
		bpj.clicar(web.getbotaoOK());
		bpj.esperar(1000);
		bpj.escrever(web.getpreencheNumeroRes(), numeroRes4DevsCapturado);
		bpj.escrever(web.getpreencheCel(),"11923456789");
		//bpj.escrever(web.getpreencheCel(), cel4DevsCapturado);
		bpj.Print("Comprar_Evidência 5"); //print 5
		bpj.clicar(web.getbotaoContinuarCadastro());
		bpj.esperar(2000);
	}	
	//CENÁRIO CRIAR USUÁRIO
	
	//CENÁRIO CONSULTAR PRODUTO
	@E ("informa o produto e clica em Pesquisar_ComprarProduto")
	public void pesquisarProduto() throws IOException {
		bpj.escrever(web.getbarraPesquisa(),"Liquidificador Oster Osterizer Blender Classic BLSTBG4655B");
		bpj.Print("Comprar_Evidência 6"); //print 6
		bpj.esperar(3000);
		bpj.clicar(web.getbotaoPesquisar());
		bpj.esperar(2000);
	}

	@E ("o usuario visualiza o detalhe do produto_ComprarProduto")
	public void detalheProduto() throws IOException {
		bpj.clicar(web.getlogoProduto());
		bpj.Print("Comprar_Evidência 7"); //print 7
	}
	//CENÁRIO CONSULTAR PRODUTO

	//CENÁRIO COMPRAR PRODUTO
	@E ("clica no botão Adicionar a Sacola_ComprarProduto")
	public void comprarProduto() throws IOException {
		bpj.clicar(web.getselecionarVoltagem());
		bpj.clicar(web.getadicionarSacola());
		bpj.clicar(web.getcontinuarBtn());
		bpj.esperar(2000);
		bpj.clicar(web.getcomprarMaisProd());
		bpj.esperar(2000);
		bpj.clicar(web.getcestaProduto());
		bpj.Print("Comprar_Evidência 8"); //print 8
			
	}
	@Então ("o produto vai para a cesta de compras_ComprarProduto")
	public void detalheCadastroNaCesta() {
		assertEquals("Sacola", bpj.obterTextoDaTela(web.getlogoNaCesta()));
	}
	//CENÁRIO COMPRAR PRODUTO

}	
		



	
	
	
