package br.com.modelPage;

import org.openqa.selenium.By;

/**
 * @author Gabriel Loureiro Gomes
 * @Descricao Classe responsável por guardar os elementos das páginas.
 */

public class ModelWeb {

	String urlGoogle = "https://www.google.com.br";
	By barraPesquisa = By.name("q");
	By logo = By.xpath("//*[@id=\"hplogo\"]");
	By botao = By.name("btnK");
	By pesquisa = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3");

	public String geturlGoogle() {
		return urlGoogle;
	}

	public By getbarraPesquisa() {
		return barraPesquisa;
	}

	public By getlogo(){
		return logo;
	}
	
	public By getbotao(){
		return botao;
	}
	
	public By getpesquisa(){
		return pesquisa;
	}
}
