 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
        public void closeWindows() {
        while(!nextToABeeper()) {    
            checkWindows();
        }
    }
    
        public void checkWindows() {
            turnRight();
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
            if (frontIsClear() && !nextToABeeper()){
                putBeeper();
                turnLeft();
                move();
            }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}


