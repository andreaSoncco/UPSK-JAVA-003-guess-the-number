import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class GuessTheNumberGame {

    Random random;
    int targetNumber;

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.random = new Random();
        int targetNumber = game.random.nextInt(100);

        HumanPlayer human = new HumanPlayer();
        System.out.println("Para empezar a jugar escribe tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        human.setName(name);

        ComputerPlayer computer = new ComputerPlayer();
        game.playGame(human, computer, targetNumber);
    }



    public boolean checkGuess(Player player) {

        int[] guessesHuman = player.getGuesses();
        //convierte el array en un flujo (stream) de enteros, y anyMatch(x -> x == numero)
        // verifica si algún elemento del stream es igual al número buscado.
        return Arrays.stream(guessesHuman).anyMatch(x -> x == this.targetNumber);
    }

    public String checkHighOrLow(int randNum, int userNum) {

        if (randNum < userNum) {
            return "Muy alta";
        } else {
            return "Muy baja";
        }

    }

    public void playGame(HumanPlayer human, ComputerPlayer computer, int targetNumber) {
        this.targetNumber = targetNumber;

        boolean gameOver = false;
        int intentos = 1;

        while (!gameOver) {

            int guessNumberPlayer1 = human.makeGuess();

            boolean adivino = this.checkGuess(human);
            if (adivino) {
                System.out.println(human.getName() + " INCREIBLE ¡Ganaste! el número que adivinaste es: " + this.targetNumber + " . En el turno número: " + (intentos) + " . Historial de suposiciones: " + Arrays.toString(human.getGuesses()));
                gameOver = true;
            } else {
                System.out.println(this.checkHighOrLow(this.targetNumber, guessNumberPlayer1));
            }

            int guessNumberComputer = computer.makeGuess();
            System.out.println("Elección de la máquina: " + guessNumberComputer);// Imprime en consola un mensaje y realiza un salto de línea
            //  Vemos si el número que ingreso el player 1 adivino el que generamos
            boolean adivinoComputer = this.checkGuess(computer);
            if (adivinoComputer) {
                System.out.println("La computadora ha ganado, el número fue: : " + this.targetNumber + " . En el turno: " + (intentos) + " . Historial de suposiciones: " + Arrays.toString(human.getGuesses()));
                gameOver = true;
            } else {
                System.out.println(this.checkHighOrLow(this.targetNumber, guessNumberComputer));
            }
            intentos++;
        }

    }
}

