package Tarefa2;


public class Principal {

	public static void main(String[] args) {
		

			Pizza pizza1 = new Pizza();
			Pizza pizza2 = new Pizza();
			Pizza pizza3 = new Pizza();
			

			pizza1.adicionaIngrediente("Frango");
			pizza1.adicionaIngrediente("Azeitona");
			pizza1.adicionaIngrediente("Portuguesa");
			
			pizza2.adicionaIngrediente("Chocolate");
			pizza2.adicionaIngrediente("Amendoim");
			pizza2.adicionaIngrediente("Morango");
			pizza2.adicionaIngrediente("Nozes");
			
			
			pizza3.adicionaIngrediente("Calabresa");
			pizza3.adicionaIngrediente("Cebola");
			pizza3.adicionaIngrediente("Cheddar");
			
			CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
			carrinho.addPizza(pizza1);
			carrinho.addPizza(pizza2);
			carrinho.addPizza(pizza3);
		

			System.out.println("Total de pizzas no carrinho: " +carrinho.totalPizzas());
			System.out.println("Valor total da compra: " + carrinho.getPrecoTotal());
			

			System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getListaIngredientes());
			

			
		}

	}
