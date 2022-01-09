package entidades;

public class Product {

	private String nome;
	private Double preco;
	
	public Product(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
		
		
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPreco(p.getPreco() * 1.1);
	}

	public  void nonStaticPriceUpdate() {
		preco = preco * 1.1;
	}

	@Override
	public String toString() {
		return nome  + ", " + String.format("%.2f", preco);
	}

	
	
}
