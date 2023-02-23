package steps;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;
import runner.Executa;
import utils.DicionarioDeMensagens;

public class MagazineTest {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	DicionarioDeMensagens msg = new DicionarioDeMensagens();

	@Given("que eu acesse o site")
	public void queEuAcesseOSite() {
		Executa.abrirNavegador();
	}

	// Imagem

	@Given("realizar uma busca")
	public void realizarUmaBusca() {
		metodos.clicar(el.cookie);
		metodos.escrever(el.busque, "iphone 14");
		metodos.submit(el.busque);
		metodos.pause(2000);
		metodos.url(msg.validaBusca);
		metodos.pause(2000);
	}

	@When("clicar na imagem")
	public void clicarNaImagem() {
		metodos.clicar(el.imagem);
		metodos.pause(2000);
	}

	@When("adicionar ao carrinho imagem")
	public void adicionarAoCarrinhoImagem() {
		metodos.clicar(el.adicionar);
		metodos.pause(2000);
		metodos.clicar(el.sacola);
		metodos.pause(2000);
	}

	@Then("validar o produto no carrinho imagem")
	public void validarOProdutoNoCarrinhoImagem() {
		metodos.validarTexto(msg.valida1, el.validaCarrinho);
		metodos.evidencias("Valida carrinho imagem");
		metodos.fecharNavegador();
	}

	// Descrição

	@When("escolher clicar na descricao")
	public void escolherClicarNaDescricao() {
		metodos.clicar(el.descricao);
		metodos.pause(3000);
	}

	@When("escolher modelo")
	public void escolherModelo() {
		metodos.clicar(el.modelo);
		metodos.pause(2000);
	}

	@When("adicionar ao carrinho descricao")
	public void adicionarAoCarrinhoDescricao() {
		metodos.clicar(el.adicionar);
		metodos.pause(2000);
		metodos.clicar(el.sacola);
		metodos.pause(3000);
	}

	@Then("validar o produto no carrinho descricao")
	public void validarOProdutoNoCarrinhoDescricao() {
		metodos.validarTexto(msg.valida2, el.validaCarrinho);
		metodos.evidencias("Valida carrinho descrição");
		metodos.fecharNavegador();
	}

	// Cep

	@When("escolher o produto")
	public void escolherOProduto() {
		metodos.clicar(el.descricao);
		metodos.pause(3000);
	}

	@When("inserir o cep")
	public void inserirOCep() {
		metodos.clicar(el.cep);
		metodos.escrever(el.digiteCep, "02832-100");
		metodos.pause(3000);
	}

	@When("adicionar ao carrinho cep")
	public void adicionarAoCarrinhoCep() {
		metodos.clicar(el.adicionarcep);
		metodos.pause(3000);
		metodos.clicar(el.sacola);
		metodos.pause(3000);
	}

	@Then("validar o produto no carrinho cep")
	public void validarOProdutoNoCarrinhoCep() {
		metodos.validarTexto(msg.valida1, el.validaCarrinho);
		metodos.evidencias("Valida carrinho cep");
		metodos.fecharNavegador();
	}

	// Seguro

	@When("escolher um produto")
	public void escolherUmProduto() {
		metodos.clicar(el.descricao);
		metodos.pause(3000);
	}

	@When("adicionar ao carrinho seguro")
	public void adicionarAoCarrinhoSeguro() {
		metodos.clicar(el.adicionar);
		metodos.pause(2000);
	}

	@When("adicionar seguro")
	public void adicionarSeguro() {
		metodos.clicar(el.checkbox);
		metodos.pause(3000);
		metodos.clicar(el.sacola);
		metodos.pause(3000);
	}

	@Then("validar o produto no carrinho seguro")
	public void validarOProdutoNoCarrinhoSeguro() {
		metodos.validarTexto(msg.valida3, el.seguro);
		metodos.evidencias("Valida carrinho seguro");
		metodos.fecharNavegador();
	}

	// Retira

	@When("escolher um produto retira")
	public void escolherUmProdutoRetira() {
		metodos.clicar(el.descricao);
		metodos.pause(3000);
	}

	@When("escolher opcao de entrega")
	public void escolherOpcaoDeEntrega() {
		metodos.clicar(el.retirar);
		metodos.pause(2000);
	}

	@When("adicionar ao carrinho")
	public void adicionarAoCarrinho() {
		metodos.clicar(el.sacola);
		metodos.pause(3000);
	}

	@Then("validar o produto no carrinho")
	public void validarOProdutoNoCarrinho() {
		metodos.validarTexto(msg.valida4, el.identificacao);
		metodos.evidencias("Valida carrinho retira");
		metodos.fecharNavegador();
	}
}
