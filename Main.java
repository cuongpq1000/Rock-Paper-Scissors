class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to my Rock Paper Scissors game !!! \n\n\n");
    System.out.println("ROCK: 0");
    System.out.println("PAPER: 1");
    System.out.println("SCISSORS: 2");
    System.out.println("\n\n\n");
    
    Game game = new Game();       // create the object and call the StartGame() method in
    game.StartGame();             // Game class
  }
}