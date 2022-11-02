import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Umpire u=new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayer();
        u.comparing();
    }
}
class Guesser
{
    int gnum;
    int guessingNum()
    {
        System.out.println("Guesser,Kindly guess a number!");
        Scanner scan=new Scanner(System.in);
        gnum=scan.nextInt();
        return gnum;
    }
}
class player
{
    int pnum;
    int predictingNum()
    {
    System.out.println("Player,Kindly guess a number!");
    Scanner scan=new Scanner(System.in);
    pnum=scan.nextInt();
    return pnum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectingNumFromGuesser()
    {
     Guesser g=new Guesser();
     numFromGuesser=g.guessingNum();
    }
    void collectingNumFromPlayer()
    {
        Player P1=new Player();
        Player P2=new Player();
        Player P3=new Player();
        numFromPlayer1=P1.predictingNum();
        numFromPlayer2=P2.predictingNum();
        numFromPlayer3=P3.predictingNum();
    }
        void comparing()
    {
        if(numFromPlayer1==numFromGuesser)
        {
        System.out.println("Player1 has won the game!");
        }
        else if(numFromPlayer2==numFromGuesser)
        {
        System.out.println("Player2 has won the game!");
        }
        else if(numFromPlayer3==numFromGuesser)
        {
        System.out.println("Player3 has won the game!");
        }
        else
        {
        System.out.println("Game lost,Try again!");
        }
    }
} 
    
 
