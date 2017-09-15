
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
        checkWall();
        turnRight();
        checkWall();
        turnRight();
        checkWall();
        turnRight();
        checkWall();

        
    }
    public void checkWall(){
        while (frontIsClear() && !nextToABeeper()) {
            checkLeft();
            move();
        }
    }
    public void goNorth(){
    }
    public void checkLeft(){
        turnLeft();
        if (frontIsClear()){
            goAroundCorner();
        }
        else{
            putBeeper();
            turnRight();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void goAroundCorner() {
        move();
        turnLeft();
    }
}
