import java.util.Random;

public class RPS_Player {
    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private final String name;

    public RPS_Player(String name){
        // TODO: replace this line with your code.
        this.name = name;
    }

    public String getName(){
        // TODO: replace this line with your code.
        return name;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
        // TODO: replace this line with your code.
        return numberOfGamesPlayed * 2;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){
        // TODO: replace this line with your code.
        return numberOfGamesWon;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        // TODO: replace this line with your code.
        return (double) getNumberOfGamesWon()/50;
    }

    /**
     * Starts a new game.
     */
    public void clear(){
        // TODO: replace this line with your code.
        numberOfGamesWon = 0;
        numberOfGamesPlayed = 0;
    }

    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player challenge(RPS_Player anotherPlayer) {
        // TODO: replace this line with your code.
        Random rand = new Random();
        RPS_Player name = new RPS_Player(getName());
        int ROCK = 0;
        int PAPER = 1;
        int SCISSORS = 2;
        anotherPlayer.choice = rand.nextInt(SCISSORS + 1);

        RPS_Player winner = null;
        if (choice > anotherPlayer.choice) {
            winner = name;
            numberOfGamesWon += 1;
            numberOfGamesPlayed +=1;
        } else if (choice < anotherPlayer.choice) {
            winner = anotherPlayer;
            anotherPlayer.numberOfGamesWon += 1;
            numberOfGamesPlayed +=1;
        } else {
            numberOfGamesPlayed+=1;
            return null;
        }
        return winner;
    }

    /**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.

        return challenge(anotherPlayer);

    }

}
