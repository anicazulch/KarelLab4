
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
        faceEast();
        while(!nextToABeeper()){
           move(); 
        }
        while(nextToABeeper()){
            for(int x = 0; x<4; x++) {
            pickBeeper();
            faceNorth();
            move();
        }
        }
        faceSouth();
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