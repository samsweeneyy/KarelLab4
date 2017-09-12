
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        plantAllBeepers();
    }
    
           public void plantAllBeepers(){
            turnLeft();
                while (!nextToABeeper()) {
                   if (frontIsClear()) {
                       goAroundCorner();
                    } 
                    else {
                        while (!frontIsClear() && !nextToABeeper()) {
                          putBeeper();
                          turnRight();
                          if (frontIsClear()) {
                          move();
                          turnLeft();
                        }
                        else {
                            turnRight();
                            move();
                            turnLeft();
                        }
                        
                    }
            }
        }
    }
        
    public void goAroundCorner() {
            move();
            turnLeft();
            move();
            turnLeft();
        }
        
    public void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();
        }
    
    }