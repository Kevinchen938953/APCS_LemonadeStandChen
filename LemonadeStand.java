		import java.util.Scanner;
public class Lemonade
{
	public static void main(String[]args)
	{
	
		
		//Methods selllemons makeLemons dailyBatch?
		Scanner getdays = new Scanner(System.in);
		System.out.print("How many days? 7, 14, or 21?");
		int day = getdays.nextInt(); 
		while (day!=7 && day!=14 && day!= 21)
		{
			System.out.println("Select again: ");
			day = getdays.nextInt(); 
			
		}
		System.out.print("You chose this" + " " + day);
		
	
    
    public void buystuff(String ingredients, String item)
    {
		
		System.out.print("What do you want to buy or do you want to exit?");
		Scanner buythis = new Scanner(System.in);
		Scanner amount = new Scanner(System.in);
		String ingredients = buythis.nextline();
		
		while((!ingredients.equals("Exit") || !ingredients.equals("exit")) && money>=0 )
		{
			System.out.print("Do you want to buy Lemon, Sugar, Ice, or Cups?");
			Scanner chooseitem = new Scanner(System.in);
			String item = Scanner.nextLine();
			if(item.equals("Lemon"))  
			{
				System.out.println("How many lemons 10, 30, or 75?"); 
				int lemonpiece = amount.nextInt() 
				numLemons += lemonpiece;
				money -= lemonPrice* lemonpiece;
				
			
		    }
		    else if(item.equals("Ice"))
		    {
				System.out.println("How many cups of Ice do you want to buy?");
				int icepiece = amount.nextInt();
				numIce += icepiece;
				money -=icepiece*icePrice;
			}
			else if(item.equals("Sugar"))
			{
				System.out.println("How many cups of sugar do you want to buy?");
				int sugarpiece = amount.nextInt();
				numSugar += sugarpiece;
				money -=sugarpiece*sugarPrice;
		    }	
	    }
	
	//public void makeLemonade(int nL, int cS, int cI)
	//{
		//if(numLemons>=3 && cupsSugar>=3 && cupsIce>=3)
		//{
			//numPitchers++;
			//cupsMade+=10;
			//n//umLemons-=3;
			//cupsSugar-=3;
			//cupsIce-=3;
			//System.out.println("Made Lemonade");
		//	
	//	}
		
	//}
	
	
	//public void makeLemonade(int nL, int cS, int cI)
	//{
		//if(numLemons>=nL && cupsSugar>=cS && cupsIce>=cI)
	//	{
		//	numPitchers++;
		//	cupsMade+=3;
			//numLemons-=nL;
		//	cupsSugar-=cS;
		//	cupsIce-=cI;
		//	System.out.println("Made Lemonade");
			
		//}
		
	//}
	
	
	
	
