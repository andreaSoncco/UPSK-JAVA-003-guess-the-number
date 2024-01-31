import java.util.Scanner;
public class HumanPlayer extends Player {
    @Override
    public int makeGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número aleatorio entre 0 y 100: ");
        int humanPlayerNum = sc.nextInt();
        int[] newGuesses = new int[this.guesses.length + 1];
        System.arraycopy(this.guesses,0,newGuesses,0,guesses.length);
        newGuesses[this.guesses.length] = humanPlayerNum;
        guesses = newGuesses;
        return humanPlayerNum;
    }
}
