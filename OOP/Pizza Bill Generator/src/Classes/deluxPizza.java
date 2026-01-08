package Classes;

public class deluxPizza extends Pizza{
	
	public deluxPizza(boolean veg)
	{
		super(veg);
		super.cheezExtra();
		super.toppingExtra();
	}
	
	@Override
	public void cheezExtra(){}
	
	@Override
	public void toppingExtra(){}
}
