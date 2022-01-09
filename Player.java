import java.util.Scanner;

public class Player{
  int a = 0;
  public static String ROCK = "ROCK";
  public static String PAPER = "PAPER";
  public static String SCISSORS = "SCISSORS";

  

  public String PlayerMove(){
    String player;
    Scanner scan = new Scanner(System.in);       
    System.out.print("Enter your input: ");
    a = scan.nextInt();             // take input from user
    

  
    if(a == 0){                   // 0 is ROCK
      player = ROCK;
     
    }
    else if(a == 1){              // 1 is PAPER
      player = PAPER;
    }
    else {                        // 2 is Scissors
      player = SCISSORS;
    }
    
    System.out.println("Player Move: " + player);  // print user choose
    return player;                                 
  }
}