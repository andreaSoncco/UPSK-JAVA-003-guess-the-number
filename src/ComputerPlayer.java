import java.util.Random;

public class ComputerPlayer extends Player {
    Random random;

    @Override
    public int makeGuess() {
        this.random = new Random();
        int computerPlayerNum = random.nextInt(100);
        this.guesses = new int[0];
        int[] newGuesses = new int[this.guesses.length + 1];
        System.arraycopy(this.guesses,0,newGuesses,0,guesses.length);
        newGuesses[this.guesses.length] = computerPlayerNum;
        this.guesses = newGuesses;
        return computerPlayerNum;
    }
}
