import java.util.*;
class guessergame
{
    public static void main(String[] args)
    {
        umpire u=new umpire();
        u.collectingnumfromguesser();
        u.collectingnumfromplayer();
        u.comparing();
    }
}
class guesser
{
    int gnum;
    int guessingnum()
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
    int predictingnum()
    {
    System.out.println("Player,Kindly guess a number!");
    Scanner scan=new Scanner(System.in);
    pnum=scan.nextInt();
    return pnum;
    }
}
class umpire
{
    int numfromguesser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;
    void collectingnumfromguesser()
    {
     guesser g=new guesser();
     numfromguesser=g.guessingnum();
    }
    void collectingnumfromplayer()
    {
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numfromplayer1=p1.predictingnum();
        numfromplayer2=p2.predictingnum();
        numfromplayer3=p3.predictingnum();
    }
        void comparing()
    {
        if(numfromplayer1==numfromguesser)
        {
        System.out.println("Player1 has won the game!");
        }
        else if(numfromplayer2==numfromguesser)
        {
        System.out.println("Player2 has won the game!");
        }
        else if(numfromplayer3==numfromguesser)
        {
        System.out.println("Player3 has won the game!");
        }
        else
        {
        System.out.println("Game lost,Try again!");
        }
    }
} 
    
 
