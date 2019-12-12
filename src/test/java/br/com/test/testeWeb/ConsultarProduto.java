package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;

import java.io.IOException;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class ConsultarProduto {

	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();

	// CENARIO CONSULTAR PRODUTO
	@Dado("que usuário acessa o site da magazineluiza")
	public void abrirSiteMagazineluiza() throws IOException {
		bpj.navegar(web.geturlmagazineluiza());
		bpj.esperar(3000);
		bpj.Print("Consultar_Evidência 1"); //print 1
	}

	@E("digita o produto 'Liquidificador Oster Osterizer Blender Classic BLSTBG4655B' e clica em Pesquisar")
	public void pesquisarProduto() throws IOException {
		bpj.escrever(web.getbarraPesquisa(),"Liquidificador Oster Osterizer Blender Classic BLSTBG4655B");
		bpj.Print("Consultar_Evidência 2"); //print 2
		bpj.esperar(3000);
		bpj.clicar(web.getbotaoPesquisar());
		bpj.esperar(2000);
	}

	@Então("visualiza o detalhe do produto")
	public void detalheProduto() throws IOException {
		bpj.clicar(web.getlogoProduto());
		bpj.Print("Consultar_Evidência 3"); //print 3
			
	}
	// CENARIO CONSULTAR PRODUTO
}
