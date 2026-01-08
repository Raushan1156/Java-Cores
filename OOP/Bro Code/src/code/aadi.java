package code;
import java.util.*;
public class aadi extends Aditya {
	private String location;
	private String kharcha;
	private String kitnelog;
	private String bolo;
	private String kya;
	Scanner sc=new Scanner(System.in);
	public aadi(String name,String location,int time)
	{
		super(name,location,time);
	}

	@Override
	public void canteen() {
		this.location="Canteen";
		System.out.print(this.location+" me Veg ya Non-veg.\n");
		//sc.nextLine();
		//kya=sc.nextLine();
		kya=sc.next();
		switch(kya)
		{
		case "Veg": System.out.println(" call me "+getName()+"\nworking whatspp number: 9470074345");
					this.kharcha="Karcha Kitna";
					this.kitnelog="log Kitne";
					System.out.println("Message me--->>>"+this.kharcha+" + "+this.kitnelog);
					break;
		case "veg": System.out.println(" call me "+getName()+"\nworking whatspp number: 9470074345");
					this.kharcha="Karcha Kitna";
					this.kitnelog="log Kitne";
					System.out.println("Message me--->>>"+this.kharcha+" + "+this.kitnelog);
					break;
		case "Nonveg":	System.out.println("Soory bro, I am completely Veg.");
						break;
		case "nonveg":	System.out.println("Soory bro, I am completely Veg.");
						break;
		default:System.out.println("Please enter valid input\nLike veg/Veg or else non veg/Non veg:");
				canteen();

		}
//		if(kya.equals("veg")){
//				System.out.println(" call me "+getName()+"\nworking whatspp number: 9470074345");
//		this.kharcha="Karcha Kitna";
//		this.kitnelog="log Kitne";
//	System.out.println("Message me--->>>"+this.kharcha+" "+this.kitnelog);
//	
//		}
//		else
//			System.out.println("Soory bro, I am completely Veg.");
	}

	@Override
	public void two2four() {
		System.out.println("Canteen me hi mje krne hai n?");
		//bolo=sc.hasNext();
//		if(bolo)
//			canteen();
//		else
//			System.out.println("Sorry bro,"+getName()+" shall attend next time.");
		bolo=sc.nextLine();
		switch(bolo)
		{
		case "true":canteen();
					break;
		case "yes": canteen();
					break;
		case "ha": canteen();
					break;
		case "no": System.out.println("Sorry bro,"+getName()+" shall attend next time.");
					break;
		case "false":System.out.println("Sorry bro,"+getName()+" shall attend next time.");
					 break;
		case "nhi":System.out.println("Sorry bro,"+getName()+" shall attend next time.");
					break;
		default:System.out.println("Enter valid input like\nyes/true/ha or else no/nhi/false.");
				two2four();
				
		}
	}

	@Override
	public void eight2four() {
		this.location="Kidhar";
		System.out.println(this.location+" ka tour plan hai???");
	}
	
	
}
