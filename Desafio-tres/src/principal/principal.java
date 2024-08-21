package br.com.pizzaria.main;

import br.com.pizzaria.model.CarrinhoCompras;
import br.com.pizzaria.model.Pizza;

public class Principal {

	public static void main(String[] args) {


		Pizza pedidoPizza1 = new Pizza();
		Pizza pedidoPizza2 = new Pizza();
		Pizza pedidoPizza3 = new Pizza();
		

		pedidoPizza1.adicionaIngrediente("Parmesão");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Calabresa");
		pedidoPizza1.adicionaIngrediente("Milho");
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		System.out.println("===============================");
		System.out.println("Total de pizzas no pedido: [" +carrinhoDeCompras.totalPizzas()+"]");
		System.out.println("TOTAL: [" + carrinhoDeCompras.getPrecoTotal()+"]");
		System.out.println("===============================");
		System.out.println("Ingredientes utilizados: \n" +Pizza.getListaIngredientes());
		

		
	}

}