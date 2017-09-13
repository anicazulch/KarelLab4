
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
        findWall();
        if (!frontIsClear()){
            turnRight();
            move();
        }
        if (checkLeftWall() && checkRightWall()){
            escape();
        }
    }
    public void findWall() {
        faceWest();
        while (frontIsClear()) {
            move();
        }
    }
    
    public boolean checkLeftWall(){
        faceWest();
        if (frontIsClear()){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean checkRightWall(){
        faceEast();
        if (frontIsClear()){
            return true;
        }
        else {
            return false;
        }

    }
    public void escape() {
        faceSouth();
        move();
        turnOff();
    }
        public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
        public void faceNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
    }
        public void faceWest() {
        while (!facingWest()) {
            turnLeft();
        }
    }
        public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
        public void faceSouth() {
        while (!facingSouth()) {
            turnLeft();
        }
    }
}

