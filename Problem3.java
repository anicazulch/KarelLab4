 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem1
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        checkWall();
        faceSouth();
        checkWall();
        faceWest();
        checkWall();
        faceNorth();
        checkWall();
        faceEast();
        checkWall();
    }
    
    public void checkLeft(){
        turnLeft();
        if (frontIsClear()){
            putBeeper();
            
        }
        turnRight();
    }
    
}

