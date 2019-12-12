package br.com.basepages;

import static br.com.driver.Driver.getDriverChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Gabriel Loureiro Gomes
 * @Descricao Classe responsável por conter comandos que executam interações com
 *            a página da web. Os métodos contidos na classe são todos públicos
 *            e para utilizá-la, é necessário passar o WebDriver como parâmetro
 */
public class BasePageJava {

	WebDriver driver;

	/**
	 * @Descricao Método construtor, define que sempre que a classe for
	 *            instanciada, é necessário passar o driver como parâmetro
	 * @param WebDriver
	 */
	public BasePageJava(WebDriver driver) {
		this.driver = driver;
	}

	public void navegar(String url) {
		getDriverChrome().navigate().to(url);
	}

	public void escrever(By elemento, String texto) {
		getDriverChrome().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		getDriverChrome().findElement(elemento).click();
	}

}