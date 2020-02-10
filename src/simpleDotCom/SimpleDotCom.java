package simpleDotCom;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public String checkYourself(String userGuess){

        int userGuessInt = Integer.parseInt(userGuess);

        for(int i=0;i<this.locationCells.length;i++){

            if(userGuessInt == this.locationCells[i]){

                this.numOfHits++;
                if(this.numOfHits == 3){
                    return "KILL";
                }
                else {
                    return "HIT";
                }
            }
        }

        return "MISS";
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
