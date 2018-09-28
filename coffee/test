public class test {
/////////////////////  GLOBAL VARIABLES ///////////////////////////////
	int coffee;
	int donuts;
	int muffins;
	double total;
	double salesTax;
	String customerName;
/////////////////////  CONSTRUCTOR ///////////////////////////////
	
	public test(){
//////////////////// Variables //////////////////////
		coffee = 0;
		donuts = 0;
		muffins = 0;
		customerName = "Not Available";
		salesTax = 0;
		total = 0;
	}


/////////////////////  ACCESSORS ///////////////////////////////

	public String getCustomerName(){
		return customerName;
	}
	
	public int getDonuts(){
		return donuts;
	}
	
	public int getMuffins(){
		return muffins;
	}
	
	public int getCoffee(){
		return coffee;
	}
	
	

/////////////////////  MUTATORS ///////////////////////////////
	
	public void setDonuts(int num){
		donuts = num;
	}
	
	public void setMuffins(int num){
		muffins = num;
	}
	
	public void setCoffee(int num){
		coffee = num;
	}
	
	public void setCustomerName(String name){
		customerName = name;
	}
	
	public void setSalesTax(double tax){
		salesTax = tax;
	}

/////////////////////  METHODS ///////////////////////////////

	public double getTotalBill(double coffeePrice, double muffinPrice, double donutPrice){
	// This gives the total (not including the sales tax)
		total = coffee*coffeePrice + donuts*donutPrice + muffins*muffinPrice;
		return total;
	}
	
	public double getSalesTax(){
	// This gives just the sales tax for the order
		return total*salesTax;
	}
	
	public double totalBillAmount(){
	// This gives the entire bill, including the sales tax, back
		return total*(1+salesTax);
	}
	
/////////////////////////  END    ///////////////////////////////
}
