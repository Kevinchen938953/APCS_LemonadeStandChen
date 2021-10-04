import java.util.Scanner;

public class Tester
//Code by Kevin Chen 

{
	
	public static void main(String[] args){
	System.out.print("This is the Lemonade stand game");
	//Game introduction here
	

	Lemonade lemonadestand = new Lemonade();//Constructer for Lemonade java
	lemonadestand.amountofdays();
	for (int i=0; i<lemonadestand.day; i++){ //Amount of days method from Lemonade java runs and asks player to input amount of days he/she wants to buy
		
		Scanner yesno = new Scanner(System.in);
	    System.out.println(lemonadestand.cupsSugar);
	    System.out.print("Would you like to go to the store? Y/N");
	    String response = yesno.nextLine();
	    if(response.equals("Y") || response.equals("y"))//Asks user whether or not they want to go to the store. If they don't want to go, code will proceed to making lemonade. 
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
		Scanner customamount = new Scanner(System.in);//Making Lemonade method. Code will ask for inputs on how sweet and how cold the lemonade will be. 
        System.out.println("How many lemons do you want to add");
        int lemonsadded = customamount.nextInt();
        System.out.print("How many cups of Ice do you want to add");
        int iceadded = customamount.nextInt();
        System.out.print("How many cups of sugar do you want to add");
        int sugaradded = customamount.nextInt();
        lemonadestand.makeLemonadeCustom(lemonsadded, sugaradded, iceadded);
	}
	Scanner getprice = new Scanner(System.in); //After user creates custom lemonade, the game will prompt the user to input the price of each cup of Lemonade
	System.out.print("What price do you want?");
	double price = getprice.nextDouble();
	int customers;
	double difference=0; //Initialize money made from selling lemonade
	double profit=0; //Initialize profit
	int cupsleft=0; //initialize amount of cups left over after day of selling.
	int randtemp = (int)(Math.random()*30)+65; //Game generates random number between 65 and 95
	if(randtemp>=65 && randtemp<=75) //If the temperature is in cold range, only five customers will come
	   {
			customers = 5;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
			 
	   }
	 else if(randtemp>75 && randtemp<=85) //If the customer is in medium temperature range, then six customers will come
	 {
		    customers = 6;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
	 }   
	 else if(randtemp>85 && randtemp<=95) //If temperature is very hot, then 7 customers will come to the lemonade stand. 
	 {
		    customers = 7;
		    difference = (lemonadestand.cupsMade - customers)*price;
		    profit = 20 - difference;
		    cupsleft = lemonadestand.cupsMade-customers;
	 
	 
     }
     System.out.print(profit); //Print out profit.
     System.out.print(difference + " " + lemonadestand.cupsMade + " " +cupsleft ); // Logical error in calculating cups produced, the cups left, and the revenue from selling lemonade. Need to fix this error.
	}
   }
    
}

	
	
