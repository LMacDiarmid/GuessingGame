public class Player
{
    //Where the guess will be stored
    int number = 0;

    public void guess()
    {
        //guess generated and stored in number
        number = (int)(Math.random()*10);
        //Removed the i'm guessing line since it's repeated again later
    }
}
