public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty();
         int countRuns = 0;
         myWinTotal = 0;
         //you write this...
          while(countRuns < numGames){
            if(m.playGame(1) == 1)
                myWinTotal++;
            countRuns++;
        
             
         }
         //stop here...
         System.out.println((myWinTotal * 1.0)/numGames);
    }
    
    
}      
