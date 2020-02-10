package guessGame;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;



    public void startGame(){

        this.p1 = new Player();
        this.p2 = new Player();
        this.p3 = new Player();


        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() *10);
        System.out.println("I am thinking of numbers between 0 to 9..");

        while (true){

            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed " + guessP1);

            guessP2 = p2.number;
            System.out.println("Player 2 guessed " + guessP2);

            guessP3 = p3.number;
            System.out.println("Player 3 guessed " + guessP3);

            if(guessP1 == targetNumber){
                p1isRight = true;
            }

            if(guessP2 == targetNumber){
                p2isRight = true;
            }

            if(guessP3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){

                System.out.println("We have a winner! ");

                if(p1isRight){

                    System.out.println("Player 1 got it right");

                }

                if(p2isRight){
                    System.out.println("Player 2 got it right");
                }

                if(p3isRight){
                    System.out.println("Player 3 got it right");
                }

                System.out.println("Game is over, Fuck off");
                break;
            }
            else {
                System.out.println("Try again");
            }
        }
    }


}
