
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeepers();
            collectBeepers();
            collectBeepers();
            collectBeepers();
            collectBeepers();
            collectBeepers();
    }
   
}

public void collectBeepers() {
    faceEast();
    findABeeperColumn();
    collectColumn();
    returnToFloor();
}

public void faceEast() {
    while(!facingEast()) {
        turnLeft();
    }
}

public void findABeeperColumn(){
    while(!nextToABeeper()) {
        move();
    }
}

public void collectColumn(){
    turnLeft();
    while(nextToABeeper()) {
    pickBeeper();
    move();
}
}

public void returnToFloor() {
    while (!facingSouth()) {
        turnLeft();
    }
    
    while (frontIsClear()) {
        move();
    }
}
}

