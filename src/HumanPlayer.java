import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer() {
        // Constructor sin argumentos
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int makeGuess() {
        if (scanner == null) {
            throw new IllegalStateException("Scanner no configurado. Llama a setScanner() antes de makeGuess().");
        }

        System.out.println("Adivina el número aleatorio entre 0 y 100: ");
        int humanPlayerNum = scanner.nextInt();
        int[] newGuesses = new int[this.guesses.length + 1];
        System.arraycopy(this.guesses, 0, newGuesses, 0, guesses.length);
        newGuesses[this.guesses.length] = humanPlayerNum;
        guesses = newGuesses;
        return humanPlayerNum;
    }
}

