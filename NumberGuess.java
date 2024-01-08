import java.util.*;

public class NumberGuess{
	public static void main (String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("======================================================");
     
     System.out.println ("------ Welcom to the a Guess Number Game ------");
     System.out.println();
     System.out.print ("\tWould you like to play this game? [y/n]: ");
     String ch = sc.nextLine();
     

     if(ch.equals("Y") || ch.equals("y")){
        System.out.println("======================================================");
        System.out.println("\tLet's play");
     	guessAnum();
     }else{
     System.out.println ("\tThanks for visiting");
     }

	}
	static ArrayList <Integer> attemps = new ArrayList<>();
    static int games = 0;
	public static void guessAnum(){

      Random r = new Random();
      int random = r.nextInt(1,100);

      Scanner sc = new Scanner(System.in);
      int attemps = 0;
      int maxAttemps = 10;
      int guess = 0;

      while(maxAttemps-attemps > 0 && guess != random) {
          System.out.println();
          System.out.print("\tGuess a Number from [1-100]: ");
              guess = sc.nextInt();

              if (guess > random) {
                  System.out.println("\tyou guessed larger number");
              }else {
                  System.out.println("\tyou guessed smaller number");
              }
              attemps++;
              System.out.println("\t--> You have " + (maxAttemps - attemps) + " attemps left.");
          }

          NumberGuess.attemps.add(attemps);
          NumberGuess.games +=1;

      if(attemps == maxAttemps && guess != random){
        System.out.println();
        System.out.println("\tYou lost the game");
    }else{
        System.out.println();
        System.out.println("\tYou won the Game in "+attemps+" attemps.");
    }
    Scanner q = new Scanner(System.in);
    System.out.println();
    System.out.print("\tWould you like to play again [y/n]: ");

    String que = q.nextLine();

    if(que.equals("Y") || que.equals("y")){
        System.out.println("======================================================");
        System.out.println("\tLet's play again");
        guessAnum();
     }else{
        System.out.println();
        System.out.print("\tWould you like to see your previous score [y/n]: ");
        String qu = q.nextLine();
        
        if(qu.equals("Y") || qu.equals("y")){
            
            System.out.println();
            System.out.println("\t--> you played this game "+NumberGuess.games+" time.");
            System.out.println("\t--> Your previous score: "+NumberGuess.attemps);
        }
    }
 }
}