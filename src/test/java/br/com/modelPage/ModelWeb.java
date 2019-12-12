package br.com.modelPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

/**
 * @author Kleber Ferrarez
 * @Descricao Classe responsável por guardar os elementos das páginas.
 */

public class ModelWeb {

	String urlmagazineluiza = "https://www.magazineluiza.com.br/";
	String urlmagazineluizacadastro = "https://www.magazineluiza.com.br/";
	String url4devs = "https://www.4devs.com.br/gerador_de_pessoas/";
		
	By barraPesquisa = By.name("q");
	By botaoPesquisar = By.xpath("//*[@id=\"btnHeaderSearch\"]");
	By logoProduto = By.xpath("//*[@id=\"product_217729100\"]");
	By pesquisa = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3");
	By botaoGerarPessoas = By.xpath("//*[@id=\"bt_gerar_pessoa\"]");
	By nome4Devs = By.xpath("//*[@id=\"nome\"]");
	By cpf4Devs = By.xpath("//*[@id=\"cpf\"]");
	By dataNasc4Devs = By.xpath("//*[@id=\"data_nasc\"]");
	By email4Devs = By.xpath("//*[@id=\"email\"]");
	By cep4Devs = By.xpath("//*[@id=\"cep\"]");
	By senha4Devs = By.xpath("//*[@id=\"senha\"]");
	By numeroRes4Devs = By.xpath("//*[@id=\"numero\"]");
	By cel4Devs = By.xpath("//*[@id=\"celular\"]");
	By entreCadastar = By.xpath("//*[@href='/cliente/login/']");
	By contaEmail = By.name("login");
	By botaoContinuar = By.xpath("//*[@data-reactid='.0.1.0.$main.1.1.0.1.1']");
	By preencheCpf = By.name("cpf");
	By preencheNomeCompleto = By.name("fullName");
	By preencheDataNasc = By.name("birthDate");
	By preencheSenha = By.name("password");
	By preencheConfirmaSenha = By.name("passwordRepeat");
	By preencheNumeroRes = By.name("number");
	By preencheCel = By.name("telephone");
	By preencheCep = By.name("zipcode");
	By botaoOK = By.xpath("//*[@data-reactid='.0.1.0.$main.2.2:0.0.1.1.2']");
	By botaoContinuarCadastro = By.xpath("//*[@data-reactid='.0.1.0.$main.2.2:0.0.2']");
	By logoNome = By.xpath("//*[@class=\"welcome-header\"]");
	By selecionarVoltagem = By.xpath("//select[@id='variation-label']/option[2]");
	By adicionarSacola = By.xpath("//*[@class=\"button__buy button__buy-product-detail js-add-cart-button js-main-add-cart-button js-add-box-prime\"]");
	By continuarBtn = By.xpath("//*[@class=\"price-warranty__btn--continue btn-buy-warranty\"]");	
	By comprarMaisProd = By.xpath("//*[@class=\"BasketPriceBox-Continue-Button\"]");	
	By cestaProduto = By.xpath("//*[@class=\"container-checkout\"]");	
	By logoNaCesta = By.xpath("//*[@class=\"BasketTable-header-product\"]");
	
	
	public By getlogoNaCesta() {
		return logoNaCesta;
	}
	
	public By getcestaProduto() {
		return cestaProduto;
	}
	
	public By getcomprarMaisProd() {
		return comprarMaisProd;
	}
	
	public By getcontinuarBtn() {
		return continuarBtn;
	}
		
	public By getadicionarSacola() {
		return adicionarSacola;
	}
	
	public By getselecionarVoltagem() {
		return selecionarVoltagem;
	}
	
	public By getpreencheCel() {
		return preencheCel;
	}
	
	public By getpreencheNumeroRes() {
		return preencheNumeroRes;
	}
	
	public By getlogoNome() {
		return logoNome;
	}
	
	public By getbotaoContinuarCadastro() {
		return botaoContinuarCadastro;
	}
	
	public By getbotaoOK() {
		return botaoOK;
	}
	
	public By getpreencheCep() {
		return preencheCep;
	}
	
	public By getpreencheConfirmaSenha() {
		return preencheConfirmaSenha;
	}
	
	public By getpreencheSenha() {
		return preencheSenha;
	}
	
	public By getpreencheDataNasc() {
		return preencheDataNasc;
	}
	
	public By getpreencheNomeCompleto() {
		return preencheNomeCompleto;
	}
	
	public By getpreencheCpf() {
		return preencheCpf;
	}
	
	public By getbotaoContinuar() {
		return botaoContinuar;
	}
	
	public By getcel4Devs() {
		return cel4Devs;
	}
	
	public By getnumeroRes4Devs() {
		return numeroRes4Devs;
	}
	
	public By getsenha4Devs() {
		return senha4Devs;
	}
	
	public By getcep4Devs() {
		return cep4Devs;
	}
	
	public By getemail4Devs() {
		return email4Devs;
	}
	
	public By getdataNasc4Devs() {
		return dataNasc4Devs;
	}
	
	public By getcpf4Devs() {
		return cpf4Devs;
	}
	
	public By getentreCadastrar() {
		return entreCadastar;
	}
	
	public By getnome4Devs() {
		return nome4Devs;
	}

	public String geturlmagazineluiza() {
		return urlmagazineluiza;
	}
	
	public String geturlmagazineluizacadastro() {
		return urlmagazineluizacadastro;
	}

	public String geturl4devs() {
		return url4devs;
	}

	public By getbarraPesquisa() {
		return barraPesquisa;
	}

	public By getbotaoPesquisar() {
		return botaoPesquisar;
	}

	public By getbotaoGerarPessoas() {
		return botaoGerarPessoas;
	}
	
	public By getlogoProduto() {
		return logoProduto;
	}
	
	public By getcontaEmail() {
		return contaEmail;
	}
	
}
