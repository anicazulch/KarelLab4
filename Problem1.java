
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
        startingPosition();
        faceNorth();
        checkWall();
        faceEast();
        checkWall();
        faceSouth();
        checkWall();
        faceWest();
        checkWall();
    }
    public void startingPosition(){
        faceSouth();
        while (frontIsClear()){
            move();
        }
        faceWest();
        while (frontIsClear()){
            move();
        }
    }
    public void checkWall(){
        while (frontIsClear()) {
            move();
            checkLeft();
        }
    }
    public void checkLeft(){
        turnLeft();
        if (frontIsClear()){
            escape();
        }
        else{
            turnRight();
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

