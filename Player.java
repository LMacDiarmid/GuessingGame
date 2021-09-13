public class Player
{
    //Where the guess will be stored
    int number = 0;

    public void guess()
    {
        //guess generated and stored in number
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing " +  number);
    }
}
