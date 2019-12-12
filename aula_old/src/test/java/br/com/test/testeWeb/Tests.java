package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;

import org.junit.Test;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;

public class Tests {

	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();

	@Test
	public void brq() {
		bpj.navegar(web.geturlGoogle());
		bpj.escrever(web.getbarraPesquisa(), "BRQ");
		bpj.clicar(web.getlogo());
		bpj.clicar(web.getbotao());
		bpj.clicar(web.getpesquisa());
	}
	
	@Test
	public void penta(){
		bpj.navegar(web.geturlGoogle());
		bpj.escrever(web.getbarraPesquisa(), "penta");
		bpj.clicar(web.getlogo());
		bpj.clicar(web.getbotao());
	}
}