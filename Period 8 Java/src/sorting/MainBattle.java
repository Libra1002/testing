package sorting;

public class MainBattle 
{
	public static void main(String[] args) 
	{
		Pokemon squirtle = new Pokemon("Squirtle",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Squirtle is preparing to attack with water gun");
		squirtle.attack(bulbasaur, new Attack()
		{
			public void attack(Pokemon target)
			{
				int newHP = target.getHP()/2;
				target.setHP(newHP);
			}
		});
		bulbasaur.attack(squirtle, new Attack()
		{
			public void attack(Pokemon target) 
			{
				target.setPoisoned(true);
			}
		});
		squirtle.lapse();
		bulbasaur.lapse();
		printScore(squirtle,bulbasaur);
	}

	private static void printScore(Pokemon a, Pokemon b) 
	{
		System.out.println(a.getName()+ ", HP = " + a.getHP());
		System.out.println(b.getName()+ ", HP = " + b.getHP());
	}
}
