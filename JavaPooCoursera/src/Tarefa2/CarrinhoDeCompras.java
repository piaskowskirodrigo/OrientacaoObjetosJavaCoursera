package Tarefa2;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList <Pizza> pizzas = new ArrayList <Pizza>();
	private double precoTotal =0;
 
public void addPizza(Pizza pizza) {
 
 		if (pizza.getIngrediente().isEmpty()){}
 		else
 		pizzas.add(pizza);
 	}

	public int totalPizzas() {

		return pizzas.size();
	}
	
	public double getPrecoTotal() {
		for(int i=0; i< pizzas.size(); i++) {
			precoTotal += pizzas.get(i).getPreco();	
		}
		return precoTotal;
	}

}
