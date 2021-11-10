import doodlepad.*;

public class MyFirstOval {
	
	private static boolean isOn;//initialize boolean isOn to determine clicks.
	Rectangle selectButton;//initialize the button
	Rectangle background;
	Oval o1;//initialize shapes that will change colors on button press

	 
    public MyFirstOval() 
    {
	 
	  //Rectangles r1 to r4 create the lemonade stand. The color of all of them is brown
	  background= new Rectangle(0,0,600,600);
	  background.setFillColor(0,255,255); 
	  Rectangle ground = new Rectangle(0,500,600, 100);
	  ground.setFillColor(0,255,0);
	  Rectangle r1 = new Rectangle(200,500,200,75);
          r1.setFillColor(139, 69, 19);
          Rectangle r2 = new Rectangle(200, 400, 20, 100);
          r2.setFillColor(139, 69, 19);
    
          Rectangle r3 = new Rectangle(375, 400, 20,100);
          r3.setFillColor(139,69,19);
          Rectangle r4 = new Rectangle (200, 355, 200, 75);
          r4.setFillColor(139, 69, 19);
          o1 = new Oval (400,10, 100,100);//Create sun
          o1.setFillColor(255,255,0);
          selectButton = new Rectangle(100, 100, 75, 50);
          selectButton.setMousePressedHandler( this::onPressed );//User interface to detect clicks
	  Text lemonade = new Text("Lemonade Stand", 200, 500, 30);//Create lemonade text
      //139 69 19
      
    }
    	  private void onPressed(Shape shp, double x, double y, int button) {
        // Toggle button state
        isOn = !isOn;

        // Set button fill color based on state
        if (isOn) {
            background.setFillColor(0, 0, 0);//Change sky from blue to dark
	    o1.setFillColor(255,255,255);//Change sun to moon
	    
        } else {
            background.setFillColor(0,255,255);
	    o1.setFillColor(255,255,0);//Change sky and moon back to originial morning background
        }
    }
    public static void main(String[] args) {
		MyFirstOval oval = new MyFirstOval();//Call an instance of an object to main method
	}//Close main method
}
