package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entidades.Product;
import util.UpperCaseName;

public class Programa {

	public static void main(String[] args) {
		//FUNÇÃO- interface- nomes de produtos em caixa alta 
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.stream().map(new UpperCaseName()).collect(Collectors.toList());

	}

}
