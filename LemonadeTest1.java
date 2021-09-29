import java.util.Scanner;

public class Tester
{
	public static void main(String args[]){
	System.out.print("This is the Lemonade stand game");
	Scanner yesno = new Scanner(System.in);
	String response = yesno.nextLine();
	System.out.print("Would you like to go to the store? Y/N");
	Lemonade lemonadestand = new Lemonade();
	System.out.println(lemonadestand.cupsSugar);
	if(response.equals("Y") || response.equals("y"))
	{
		System.out.print("Let's go to the store");
		Scanner ingredients = new Scanner(System.in);
		System.out.println("How many lemons do you want to buy?");
		int boughtlemons = ingredients.nextInt();
		//lemonadestand.addstuff(boughtlemons);
		ingredients.nextLine();
		System.out.println("How many cups of Ice do you want to buy?");
		int boughtsugar = ingredients.nextInt();
		//lemonadestand.addstuff(boughtsugar);
		ingredients.nextLine();
		System.out.println("How many cups of sugar do you want to buy?");
		int boughtice = ingredients.nextInt();
		//lemonadestand.addstuff(boughtIce);
		ingredients.nextLine();
		lemonade.addstuff(boughtlemons, boughtsugar, boughtice)
	}
	else
	{
		Scanner customamount = new(System.in);
        System.out.print(“How many lemons you want to add?”);
        int lemonsadded = customamount.nextInt();
        System.out.print(“How many cups of Ice you want to add?”);
        int iceadded = customamount.nextInt();
        System.out.print(“How many cups of Sugar you want to add?”);
        int sugaradded = customamount.nextInt();
        lemonadestand.makeLemonadeCustom(lemonsadded, sugaradded, iceadded);
	}
	public void Weather()
	{
		int randtemp = (int)(Math.random()*30)+65;
		 
	}
}
}
