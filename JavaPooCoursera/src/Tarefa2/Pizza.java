package Tarefa2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	public static int totalIngredientes=0;
	private double preco;
	private ArrayList <String>  ingrediente = new ArrayList<String>();
	public static Map <String, Integer> mapIngredientes = new HashMap <String, Integer> ();

	
	public ArrayList<String> getIngrediente()
	{
		return ingrediente;
	}
	
	public static Map<String, Integer>  getListaIngredientes()
	{
		return   mapIngredientes;
	}
	
	public void adicionaIngrediente (String ingrediente)
	{
		this.ingrediente.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public double getPreco ()
	{
		if (ingrediente.size() <= 2) {
			preco = 15;
		}
		if (ingrediente.size() >= 3 && ingrediente.size() <=5) {
			preco = 20;
		}
		if (ingrediente.size() > 5) {
			preco = 23;
		}
	return preco;
	}
	
	public static void contabilizaIngrediente(String ingrediente)
	{
		if (mapIngredientes.containsKey(ingrediente))
		{
			int value = mapIngredientes.get(ingrediente);
			mapIngredientes.put(ingrediente, value+1);	
			}
		else
		{
			mapIngredientes.put(ingrediente, 1);
		}
		totalIngredientes++;
				 
	}
	
	
}
