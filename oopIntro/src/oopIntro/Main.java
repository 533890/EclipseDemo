package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenavo V14", 15000,"16 GB RAM",10);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenavo V15");
		product2.setDetail("16 gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(1600);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		
		
	}

} 
