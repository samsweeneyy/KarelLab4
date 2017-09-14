 

import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 lucy = new Problem3(7,5,West,-1);
        lucy.closeWindows();
        lucy.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig6-28.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}