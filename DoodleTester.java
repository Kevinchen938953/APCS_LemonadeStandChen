import doodlepad.*;

public class DoodleTester {
          boolean On;
          Rectangle selectButton;

    public DoodleTester() 
    {
        // Create button shape and initialize
        selectButton = new Rectangle(100, 100, 75, 50);
        selectButton.setFillColor(200);

        // Starts off
        On = false;

        // Set button click event handler method
        selectButton.setMousePressedHandler( this::onPressed );
     }
        
        private void onPressed(Shape shp, double x, double y, int button) {
        // Toggle button state
        On = !On;

        // Set button fill color based on state
        if (On) 
        {
            selectButton.setFillColor(0, 255, 0);
        } else 
        {
            selectButton.setFillColor(200);
        }
    }
   }
