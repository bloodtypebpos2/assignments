
public class testTest {
	


	public static void main(String[] args) {
		String customerName = "Cloud Strife";
		int donuts = 3;
		int muffins = 3;
		int coffee = 2;
		
		
		double donutPrice = 1.25;
		double coffeePrice = 2.00;
		double muffinPrice = 1.5;
		double salesTax = 0.06;
		double total = 0;
		
		
		test test = new test();
		
		// I'm setting everything specific to this bill into our class//
		test.setCoffee(coffee);
		test.setMuffins(muffins);
		test.setCustomerName(customerName);
		test.setDonuts(donuts);
		test.setSalesTax(salesTax);
		
		total = test.getTotalBill(coffeePrice, muffinPrice, donutPrice);
		
		
		System.out.println("Thank you for buying my sh*t: " + test.getCustomerName());
		System.out.println("Apparently, you ordered the following:");
		System.out.println("Donuts: " + donuts);
		System.out.println("Muffins: " + muffins);
		System.out.println("Coffee: " + coffee);
		System.out.println("--------------------------------");
		
		System.out.println("Your total comes out to be: " + total);
		System.out.println("Sales Tax: " + test.getSalesTax());
		System.out.println("If you ever wanna see your family again, you owe me: " + (total + test.getSalesTax()));
		
	}

}
