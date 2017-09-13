
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
            collectBeeperSteeple();
        }
    }
    public void collectBeeperSteeple() {
        findBeepers();
    }
    public void findBeepers() {
        while(!nextToABeeper() && frontIsClear()){
           move(); 
        }
        pickUpColumn();
        goDown();
        faceEast();
        }
    public void pickUpColumn(){
        while(nextToABeeper()){
            faceNorth();
            pickBeeper();
            move();
        }
    }
    public void goDown(){
        while(frontIsClear()){
            faceSouth();
            move();
        }
    }
    public void faceEast() {
        while(!facingEast()){
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
}
