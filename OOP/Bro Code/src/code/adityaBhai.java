package code;

public class adityaBhai extends Aditya {

	private int time;
	private String location;

	public adityaBhai(String name,String location,int time)
	{
		super(name,location,time);
	}
	@Override
	public void canteen() {
		this.time=2;
		this.location="Canteen";
		System.out.print("hmlog "+getTime()+" bje se");
		this.time=4;
		System.out.println(this.time+" ke approx "+this.location+" pe hi padhai kr rhe the.");
	
	}

	@Override
	public void two2four() {
		System.out.println("Understood: Mom is on call.");
		canteen();
		this.location="Ghar";
		System.out.println("Fir "+this.location+" ke liye nikl gye.");
	}

	@Override
	public void eight2four() {
		this.location="College";
		System.out.print(this.location+" pe hi the.");
		this.location="ghar";
		System.out.print("fir "+this.location+" aa gye.");

	}
	
}
