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

public class CadastrarUsuario {
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
	@Dado("que usuário acessa o site 4devs")
	public void url4dev() throws IOException {
		bpj.navegar(web.geturl4devs());	
		bpj.Print("Cadastrar_Evidência 1"); //print 1
		bpj.esperar(1000);
	}
	
	@E("clica no botão gerar pessoas")
	public void pesquisa() throws IOException {
		bpj.clicar(web.getbotaoGerarPessoas());
		bpj.Print("Cadastrar_Evidência 2"); //print 2
		bpj.esperar(1000);
	}
	
	@E("visualiza e captura os dados pessoais criados")
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
			
	@E("o usuário acessa o site da magazineluiza para efetuar o cadastro")
	public void abrirSiteMagazineluizacadastro() throws IOException {
		bpj.navegar(web.geturlmagazineluizacadastro());
		bpj.Print("Cadastrar_Evidência 3"); //print 3
		bpj.esperar(2000);
	}
		
	@E("clica no botão entre ou cadastre-se")
	public void entreCadastar() {
		bpj.clicar(web.getentreCadastrar());
		bpj.esperar(1000);
	}
	
	@E("informa um e-mail válido e clica no botão continuar")
	public void contaEmail() throws IOException {
		bpj.escrever(web.getcontaEmail(), email4DevsCapturado);
		bpj.Print("Cadastrar_Evidência 4"); //print 4
		bpj.clicar(web.getbotaoContinuar());
		bpj.esperar(2000);
	}
	
	@E ("o usuario preenche os dados para o cadastro")
	public void prencherUsusario() throws IOException {
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
		bpj.Print("Cadastrar_Evidência 5"); //print 5
		bpj.esperar(2000);
	}
	
	@E ("o usuario clica no botão continuar")
	public void botaoContinuarCadastro () throws IOException {
		bpj.clicar(web.getbotaoContinuarCadastro());
		bpj.Print("Cadastrar_Evidência 6"); //print 6
		bpj.esperar(1000);
	}
	
	@Então("visualiza o cadastro do usuário efetuado com sucesso")
	public void detalheCadastroComSucesso () {
		assertEquals("Olá,", bpj.obterTextoDaTela(web.getlogoNome()));
	}
	//CENÁRIO CRIAR USUÁRIO
}
		
		



	
	
	
