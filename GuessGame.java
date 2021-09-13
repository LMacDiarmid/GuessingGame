public class GuessGame
{
    //GuessGame has three instance variables for the three player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame()
    {
        //Creates three Player objects and assign them to the three Player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //Declaring three variables to store the three guesses
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //Declaring three variables that hold whether the player is correct
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        ////Stores a random number between 0 and 9 that the players will need to guess

        int targetNumber = (int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9 \n");



        int winners = 0; //This counts how many winners there is

        while(true)
        {
            //removed line that displays the value to guess (shouldn't show the number until we have a winner)

            //Calling the players to guess a number
            p1.guess();
            p2.guess();
            p3.guess();

            //Storing the number the players guess into corresponding variable

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed "+guessp3);

            //Checking to see if any of the guesses match the target number and storing how many winners exist
            if(guessp1 == targetNumber)
            {
                p1isRight = true;
                winners++;

            }
            if(guessp2 == targetNumber)
            {
                p2isRight = true;
                winners++;

            }
            if(guessp3 == targetNumber)
            {
                p3isRight = true;
                winners++;

            }
            //if any of the players have guessed correctly then display which player won
            if(p1isRight||p2isRight||p3isRight)
            {

                //Deciding whether we have multiple winners
                if (winners > 1)
                {
                    System.out.println("\nWe have winners!");
                }
                else
                {
                    System.out.println("\nWe have a winner!");
                }
                //Displaying the target number
                System.out.println("\nThe number i was thinking of was:");
                System.out.println("\t\t"+targetNumber+"\n");

                //Displaying which user or users won
                if(p1isRight)
                {
                    System.out.println("Player one got it right!");
                }
                if(p2isRight)
                {
                    System.out.println("Player two got it right! ");
                }
                if(p3isRight)
                {
                    System.out.println("Player three got it right!" );
                }
                System.out.println("\nGame is over. Thanks for playing");
                break;
            }
            //if no one guessed correctly display this message
            else
            {
                System.out.println("\nNo-one won this round!");
                System.out.println("Players will have to try again. \n");
            }


        }



    }



}





