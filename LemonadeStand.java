		import java.util.Scanner;
public class Lemonade
{
	
	
		int cupsSugar=9;
		int cupsIce=9;
		int numPitchers=0;
		int lemons = 9;
		int day;
		int cupsMade;
		
		
		public void amountofdays(){
		Scanner getdays = new Scanner(System.in);
		System.out.print("select seven fourteen or twenty one days");
		day = getdays.nextInt(); 
		while (day!=7 && day!=14 && day!= 21)
		{
			System.out.println("Select again: ");
			day = getdays.nextInt(); 
			
		}
	}
		
		public void addstuff(int moreLemons, int moreSugar, int moreIce)
		{
			cupsSugar += moreSugar;
			cupsIce += moreIce;
			lemons += moreLemons;
			
		}
		public void makeLemonadeCustom(int nL, int nS, int nI)
        {
         if(cupsSugar>=nS && cupsIce>=nI && lemons>=nL)
          {
            numPitchers++;
            cupsMade+=10;
            lemons-=nL;
            cupsSugar-=nS;
            cupsIce-=nI;
            System.out.print(numPitchers);
           }
         }
         
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //public void buystuff()
   // {
		
		//{
		//	System.out.print("What do you want to buy or do you want to exit?");
		   // Scanner buythis = new Scanner(System.in);
		   // Scanner amount = new Scanner(System.in);
		    
		  //  String ingredients = buythis.nextline();
	//	}
	//	else
	//	{
			
	//	}
		
	//	while(!ingredients.equals("Exit") || !ingredients.equals("exit") )
	//	{
	//		System.out.print("Do you want to buy Lemon, Sugar, Ice, or Cups?");
	//		Scanner chooseitem = new Scanner(System.in);
	//		String item = Scanner.nextLine();
		//	if(item.equals("Lemon")) { System.out.println("How many lemons 10, 30, or 75?"); int pieces = amount.nextInt(); lemons += pieces; cash -= pieces*lemonprice; }
			
	//	}
			
	//}
	
	
		//}
	//}
	//public void weather()
	//{
	//	int temp = (int)math.random()*100; 
	//}


    


//}
//Twyford example:
//public makeLemonade() if(numLemons>=3 && cupSugar>=3 && cupsIce>=3)numPitchers++ numLemons-=3 cupsSugar-=3 cupsIce-=3







	
	
	
