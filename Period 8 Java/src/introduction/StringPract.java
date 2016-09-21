package introduction;

public class StringPract {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2 = "Hello World";
		
		if(text1.equals(text2)){
			print("These strings are equal:");
		}
		print (text1);
		print (text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzya";
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}

	}
	
	public static void print (String s){
		System.out.println(s);
	}
}
