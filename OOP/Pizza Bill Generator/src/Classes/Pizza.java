package Classes;

public class Pizza {
	int price;
	boolean veg;
	
	int cheezExtraPrice=100;
	int toppingExtraPrice=150;
	int packingPrice=20;
	
	boolean isCheezeExtra=false;
	boolean isToppingExtra=false;
	boolean isPacked=false;
	int basePizzaPrice;
	
	//Constructer
	Pizza(boolean veg)
	{
		this.veg=veg;
		if(this.veg)
		{
			//it means this is veg;
			this.price=300;
		}
		else
		{
			// it means this is non-veg;
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	
	public void cheezExtra()
	{
		isCheezeExtra=true;
		this.price+=cheezExtraPrice;
	}
	
	public void toppingExtra()
	{
		isToppingExtra=true;
		this.price+=toppingExtraPrice;
	}
	
	public void packing()
	{
		isPacked=true;
		this.price+=packingPrice;
	}
	
	public void bill()
	{
		String bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isCheezeExtra)
			bill+="Cheeze Extra: "+cheezExtraPrice;
		
		if(isToppingExtra)
			bill+="\nTopping Extra: "+toppingExtraPrice;
		
		if(isPacked)
			bill+="\nPacking Charge: "+packingPrice;
		
		bill+="\nTotal Bill: "+this.price;
		System.out.println(bill);
	}

}
