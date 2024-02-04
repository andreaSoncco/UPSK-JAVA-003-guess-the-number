import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer() {
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int computerPlayerNum = random.nextInt(101);
        this.guesses = new int[0];
        int[] newGuesses = new int[this.guesses.length + 1];
        System.arraycopy(this.guesses,0,newGuesses,0,guesses.length);
        newGuesses[this.guesses.length] = computerPlayerNum;
        this.guesses = newGuesses;
        return computerPlayerNum;
    }
}
