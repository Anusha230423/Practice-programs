
public class Test {
	public static void main(String[] args) {
		Product product = new Product();
		product.price=200;
		double newprice=100;
		
		Test test = new Test();
		test.updatePrice(product, newprice);
		System.out.println(product.price+":"+newprice);
	}
	public void updatePrice(Product product,double price){
		price=price*2;
		product.price=product.price+price;
	}
	

}
