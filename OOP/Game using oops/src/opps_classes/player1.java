package opps_classes;

public class player1 {

		private String name;
		private String weapon;
		private int health;
		
		
		
		public player1(String name,String weapon,int health)
		{
			this.name=name;
			this.weapon=weapon;
//			if(this.health>100)
			this.health=health;
		}
		
		public void damagedBySword1()
		{
			this.health-=30;
			
			if(this.health<=0) {
					this.health=0;
			}
			System.out.println("Damaged by Sword 1. Updated health is "+this.health+" reduced by 30.");
			if(this.health==0)
			{
					System.out.println(getName()+" is dead.");
			}
		}
		
		public void damagedBySword2()
		{
			this.health-=50;
			if(this.health<=0)
			{
				this.health=0;
			}
			System.out.println("Damaged by Sword 2. Updated health is "+this.health+" reduced by 50.");
			if(this.health==0)
			{
				System.out.println(getName()+" is dead.");
			}
		}
		public void heal()
		{
			if(this.health<=0)
			{
				System.out.println("Healing impossible.Try next time!!!");
			}
			else {
				this.health=100;
				System.out.println("Healing done and health is :"+this.health);
			}
		}
		
		
		//getter
		public String getName() {
			return name;
			}
		public String getWeapon() {
			return weapon;
		}
		public int getHealth()
		{
			return health;
		}
		
		//setter
		void setName(String name) {
			this.name=name;
		}
		void setWeapon(String weapon)
		{
			this.weapon=weapon;
		}
		void setHealth(int health)
		{
			this.health=health;
		}
		
		
		
}
