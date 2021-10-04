		import java.util.Scanner;
public class Lemonade
//Kevin Chen 
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
			lemons += moreLemons; //Method to allow user to add ingredients. 
			
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
            System.out.print(numPitchers);//Custom method to allow user to create custom lemonade cups. 
           }
         }
         
}






	
	
	
