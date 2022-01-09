package util;

import java.util.function.Function;

import entidades.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		
		return p.getNome().toUpperCase();
	}
	

}
