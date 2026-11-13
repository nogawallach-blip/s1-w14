import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = myRandoms.nextInt(3) + 1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor, int strat) {
        //do this ...;
        int mySecondGuess = myRandoms.nextInt(3) + 1;
        if(strat == 1){
            return myInitialGuess;
        }

        else if(strat == 2){
            while(mySecondGuess == myInitialGuess || mySecondGuess == openedDoor){
                mySecondGuess = myRandoms.nextInt(3) + 1;
        }
        
        return mySecondGuess;
        }
        else{
            int t = myRandoms.nextInt(2);
            if(t == 0)
                return myInitialGuess;
            else 
                return mySecondGuess;
        }

    }
}
