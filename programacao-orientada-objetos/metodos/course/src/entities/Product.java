package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {		
	}
	
	public Product(String name, double price, int quantity) { /* M�todo Construtor Especificado*/
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { /* M�todo de Sobrecarga */
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

}
