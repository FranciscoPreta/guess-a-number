public class Game {
    private final int maxNumber;
    private final Player[] players;

    public Game (int maxNumber, Player[] players){
        this.maxNumber = maxNumber;
        this.players = players;
    }

    private int getGuess(){
        return RandomNumber.getRandom(maxNumber);
    }

    public void startGame(){
        int casinoGuess = getGuess();
        System.out.println("The game has strated with the max number of: " + maxNumber);
        System.out.println("Casino's number is: " + casinoGuess);
        System.out.println("--------------------------------------------");

        boolean correctGuess = false;

        while (!correctGuess){
            for (Player player : players) {
                int playerGuess = player.getNumber(maxNumber);
                System.out.println("Player " + player.getName() + " chose " + playerGuess);

                if(playerGuess == casinoGuess){
                    System.out.println(player.getName() + " chose " + playerGuess + " and won the game!");
                    correctGuess = true;
                    break;
                }
            }
        }
    }
}
