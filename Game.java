import java.util.Scanner;
public class Game{
  public static String ROCK = "ROCK";
  public static String PAPER = "PAPER";
  public static String SCISSORS = "SCISSORS";
  public int ComputerMove = 0;
  int tie = 0;
  int playerWin = 0;
  int playerLoose = 0;
  int RockMove = 0;
  int ScissorsMove = 0;
  int PaperMove = 0;
  int ComputerMove2 = 0;                     // create the second Computer Move variable
  int input2 = 0;
  FirstRound firstRound = new FirstRound();  // recall FirstRound class
  Player PlayerM2 = new Player();
  public boolean Continue = false;           // boolean to keep track of whether the user want to continue games or not
  Scanner scan = new Scanner(System.in);

  public void StartGame(){
    firstRound.Start();             // First Round class


    ///////Second Round which computer starting analysing user behaviour///////////////////////
    System.out.println("\n\n\n");


    while(Continue == false){
    System.out.println("ROCK: 0");              // print the board
    System.out.println("PAPER: 1");
    System.out.println("SCISSORS: 2");
    System.out.println("\n\n\n");

      String computer;
      String playerMove = PlayerM2.PlayerMove();      // Player Move

      if (playerMove.equals(ROCK)){
        RockMove++;                             // count the times that user use Rock
      }
      else if (playerMove.equals(PAPER)){
        PaperMove++;                            // count the times that user use Paper
      }
      else if (playerMove.equals(SCISSORS)){  
        ScissorsMove++;                         // count the times that user use Scissors
      }


  //////// check to see which options that user choose the most/////////////////////////////

  if((RockMove > PaperMove) && (RockMove > ScissorsMove)){       // Rock has the most move
    computer = PAPER;                               // computer chooses paper to againts player 
  } 
  else if((PaperMove > RockMove) && (PaperMove > ScissorsMove)){ // Paper has the most move
    computer = SCISSORS;                           // computer chooses scissors to againts player
  }
  else if((ScissorsMove > PaperMove) && (ScissorsMove > RockMove)){// Scissors have the most move
    computer = ROCK;                               // computer chooses Rock to againts player
  }
  else{                                      // else the computer just move randomly
    ComputerMove2 = (int) (Math.random()*100);
    input2 = ComputerMove % 3;

    if(input2 == 0){
      computer = Game.ROCK;
    }
    else if(input2 == 1){
      computer = Game.PAPER;
    }
    else{
      computer = Game.SCISSORS;
    }
  }
  System.out.println("Computer Move: " + computer);

////// check for winner (the same as First round check for winner)////////
if(playerMove.equals(computer)){
      System.out.println("It's a tie\n\n");
      tie++;
    }
    else if(playerMove.equals(ROCK)){
      if(computer.equals(PAPER)){
        System.out.println("computer wins !!!\n\n");
        playerLoose ++;
      }
      else{
        System.out.println("Player wins !!!\n\n");
        playerWin++;
      }
    }
    else if(playerMove.equals(PAPER)){
      if(computer.equals(SCISSORS)){
        System.out.println("computer wins !!!\n\n");
        playerLoose++;
      }
      else{
        System.out.println("Player wins !!!\n\n");
        playerWin++;
      }
    }
    else if(playerMove.equals(SCISSORS)){
      if(computer.equals(ROCK)){
        System.out.println("computer wins !!!\n\n");
        playerLoose++;
      }
      else{
        System.out.println("Player wins !!!\n\n");
        playerWin++;
      }
    }
    String choice;
    System.out.print("Do you want to continue, yes = y or no = n: "); // check if the user want to continue or not
    choice = scan.nextLine();
    if(!(choice.equals("n"))){
      Continue = false;
    }
    else{
      System.out.print("\nthank you for Playing !!!\n");
      displayBoard();
      break;
    }

      
    }
  }
    public void displayBoard(){   // print the result board
        System.out.println("----------");
        System.out.println("Wins: " + playerWin);
        System.out.println("Loses: " + playerLoose);
        System.out.println("Ties: " + tie);
        System.out.println("----------");
    }
    

}