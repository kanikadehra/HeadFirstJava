package guessGame;

public class Player {

    int number;

    public void guess(){

        this.number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + this.number);

    }
}
