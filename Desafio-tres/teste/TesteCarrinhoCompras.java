import static org.junit.Assert.*;

import org.junit.Test;

import br.com.pizzaria.model.CarrinhoCompras;
import br.com.pizzaria.model.Pizza;

public class TesteCarrinhoDeCompras {


	@Test
	public void testVerificarPreco() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");

		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}


	@Test
	public void testIngredientesVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}
	
	
}