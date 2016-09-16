package introduction;

public class Senior extends Student {

	String favoriteColor;
	
	public Senior(String name){
		super(name);
	}
		
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior.");
	}
}
