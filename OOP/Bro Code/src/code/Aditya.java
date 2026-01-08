package code;

public class Aditya {
		private String name;
		private String location;
		private int time;
		
		public Aditya(String name,String location,int time)
		{
			this.name=name;
			this.location=location;
			this.time=time;
		}
		public void canteen()
		{
			this.time=2;
			this.location="Canteen";
			System.out.println("hmlog "+getTime()+" bje ke approx "+this.location+" pe the.");
		}
		
		public void two2four()
		{
			System.out.println("Father is on call.So the update given by his friend:\n");
			canteen();
			this.location=" College Library";
			System.out.println("fir uske baad "+getName()+" hmare saath "+this.location+" me tha.");
			System.out.println("fir "+this.name+" ghar nikl gya.");
		}
		
		public void eight2four()
		{
			System.out.println("Father is on call.So the update given by his friend from 8am to 4pm:\n");
			this.location="Classroom";
			this.time=4;
			System.out.println(this.time+" tk to "+this.location+" me hi the.");
			System.out.println("fir "+this.name+" ghar nikl gya.");

		}
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getlocation()
		{
			return location;
		}
		public void setLocation(String location)
		{
			this.location=location;
		}
		public int getTime()
		{
			return time;
		}
		public void setTime(int time)
		{
			this.time=time;
		}
}
