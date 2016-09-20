package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
	
		int[] results = new int[6];
		System.out.println(results[0]);
		//declare variable, logic test, increment
		for(int index = 0; index < 10000; index ++){
			//int result = rollFairDie();	
			int result = rollUnfairDie();	
			System.out.println("Roll #"+(index+1) + " Die is " + result);
			results[result-1] ++;
		}
		//print the results
		for(int i = 0; i< 6; i++){
			System.out.println((i+1+" appeared " + results[i]+ " times."));
		}
	}
	
	public static int rollFairDie(){
		double rand = Math.random();//returns a double between (0,1)
		int roll = (int) (6*rand);
		roll ++; //[1,6]
		return roll;
	}
	
	public static int rollUnfairDie(){
		double test = Math.random();
		int roll = (int) (6*test);
		
		if (test <.60)
			{roll = 3;}
		else
			{roll = 5;}
		return roll;
	}
	
	

}
