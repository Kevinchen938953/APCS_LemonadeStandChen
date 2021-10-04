import java.util.Scanner;

public class Tester
{
	
	public static void main(String[] args){
	System.out.print("This is the Lemonade stand game");
	

	Lemonade lemonadestand = new Lemonade();
	lemonadestand.amountofdays();
	for (int i=0; i<lemonadestand.day; i++){
		
		Scanner yesno = new Scanner(System.in);
	    System.out.println(lemonadestand.cupsSugar);
	    System.out.print("Would you like to go to the store? Y/N");
	    String response = yesno.nextLine();
	    if(response.equals("Y") || response.equals("y"))
	    {     
		
		System.out.println("Let's go to the store");
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
		lemonadestand.addstuff(boughtlemons, boughtsugar, boughtice);
	     }
	else
	{
		Scanner customamount = new Scanner(System.in);
        System.out.println("How many lemons do you want to buy");
        int lemonsadded = customamount.nextInt();
        System.out.print("How many cups of Ice do you want to add");
        int iceadded = customamount.nextInt();
        System.out.print("How many cups of sugar do you want to add");
        int sugaradded = customamount.nextInt();
        lemonadestand.makeLemonadeCustom(lemonsadded, sugaradded, iceadded);
	}
	Scanner getprice = new Scanner(System.in);
	System.out.print("What price do you want?");
	double price = getprice.nextDouble();
	int customers;
	double difference=0;
	double profit=0;
	int cupsleft=0;
	int randtemp = (int)(Math.random()*30)+65;
	if(randtemp>=65 && randtemp<=75)
	   {
			customers = 5;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
			 
	   }
	 else if(randtemp>75 && randtemp<=85)
	 {
		    customers = 6;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
	 }   
	 else if(randtemp>85 && randtemp<=95)
	 {
		    customers = 7;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
	 
	 
     }
     System.out.print(profit);
     System.out.print(difference + " " + lemonadestand.cupsMade + " " +cupsleft );
	}
   }
    
}

