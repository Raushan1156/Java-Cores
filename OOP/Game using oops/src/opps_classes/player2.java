package opps_classes;

public class player2 extends player1 {
	private int health;
	private boolean armor;
	public player2(String name,String weapon,int health,boolean armor)
	{
		super(name,weapon,health);
		this.health=health;
		this.armor=armor;
	}
	@Override
	public void damagedBySword1()
	{
		if(armor)
		{
			this.health-=10;
			System.out.println("Armor on. health reduced by 10 and updated is "+this.health);
			
		}
		if(!armor)
		{
			this.health-=30;
			System.out.println("damaged,aromor off. health reduced by 30 and updated health is "+this.health);
		}
	}
}
