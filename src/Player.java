public abstract class Player {
    private String name;
    int[] guesses;

    public abstract int makeGuess();

    public String getName() {
        return this.name;
    }
    public int[] getGuesses() {
        return this.guesses;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Player() {
        this.guesses = new int[0];
        this.name = "Primer Jugador";
    }
}
