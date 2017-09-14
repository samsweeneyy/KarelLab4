
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
  
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        while (frontIsClear()) {
            move();
    }
    checkWalls();
    move();
}

public void checkWalls() {
     while (!frontIsClear()) {
         turnLeft();
         if (frontIsClear()) {
         move();
         turnRight();
        }
         else { 
            turnLeft();
            move();
            turnRight();
        }
    }
}

public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
}
}
