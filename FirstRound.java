public class FirstRound{                    // this class will start analysing 
                                            // user move
  public static String ROCK = "ROCK";        // create String variables for Rock
  public static String PAPER = "PAPER";      // Paper and Scissors
  public static String SCISSORS = "SCISSORS";
  public int ComputerMove = 0;
  public int input = 0;
  Player PlayerM = new Player();              // recall Player class


  public void Start(){
    String computer;
    String playerMove = PlayerM.PlayerMove();   // recall the PlayerMove() method in Player class
    ComputerMove = (int) (Math.random()*100);   // create the computer move by taking random
    input = ComputerMove % 3;                   // from 0 to 2

    if(input == 0){
      computer = Game.ROCK;
    }
    else if(input == 1){
      computer = Game.PAPER;
    }
    else{
      computer = Game.SCISSORS;
    }
    System.out.println("Computer Move: " + computer);
//////////////////Check for winner ///////////////////////////////////

    if(playerMove.equals(computer)){    // player and computer choose the same
      System.out.println("It's a tie");
    }
    else if(playerMove.equals(ROCK)){  // player choose Rock 
      if(computer.equals(PAPER)){     // if computer choose paper, player win
        System.out.println("computer wins !!!");
      }
      else{                          // else mean computer choose Scissors
        System.out.println("Player wins !!!");
      }
    }
    else if(playerMove.equals(PAPER)){  // player choose Paper
      if(computer.equals(SCISSORS)){    // computer choose Scissors,
        System.out.println("computer wins !!!");    // computer win
      }
      else{                             // else mean compute choose Rock
        System.out.println("Player wins !!!");      // player win
      }
    }
    else if(playerMove.equals(SCISSORS)){ // player choose Scissors
      if(computer.equals(ROCK)){          // computer choose Rock
        System.out.println("computer wins !!!");  // computer win
      }
      else{                              //else mean computer choose Paper
        System.out.println("Player wins !!!");     // player win
      }
    }
  }
}
