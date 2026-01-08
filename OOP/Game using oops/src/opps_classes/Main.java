package opps_classes;

public class Main {

	public static void main(String[] args) {

		player1 p1=new player1("Raushan","Sword",100);
		player2 p2=new player2("Raushan","Sword",100,true);

		System.out.println("Object creation done.");
		//p2.damagedBySword1();
		//p1.damagedBySword2();
		p1.damagedBySword2();
////		p1.damagedBySword1();
		p1.heal();

		
	}

}
