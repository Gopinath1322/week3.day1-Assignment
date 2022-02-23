package week3.day1;

public class Sports {
	public void acheiver(String Name,int MedalCount) {
		System.out.println("Name: "+Name);
		System.out.println("MedalCount: "+MedalCount);
		// TODO Auto-generated method stub

	}
	public void acheiver(String Country,String spoartsName,int Rnak) {
		System.out.println("CountryName: "+Country);
		System.out.println("spoartsName: "+spoartsName);
		System.out.println("Rnak: "+Rnak);
		// TODO Auto-generated method stub

	}
	public void acheiver(float Weight,int Height,long ContactNumber) {
		System.out.println("Weight: "+Weight);
		System.out.println("Height: "+Height);
		System.out.println("ContactNumber: "+ContactNumber);
		// TODO Auto-generated method stub

	}
	public void acheiver(String TournamentName,long PrizeMoney) {
		System.out.println("TournamentName: "+TournamentName);
		System.out.println("PrizeMoney: "+PrizeMoney);
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Sports detail=new Sports();
		detail.acheiver("Gopi", 50);
		detail.acheiver("INDIA", "LongJump", 3);
		detail.acheiver(65.3f, 6, 9500339662l);
		detail.acheiver("LongJump", 200000l);
		
	}

}
