package Players;


import java.util.Random;

public class PlayerComputer extends Player {

    private Random dice = new Random();

    public PlayerComputer() {
    }

    public PlayerComputer(String name) {
        super(name); //wywołanie konstruktora player
    }

    @Override
    public int guess() {
        return dice.nextInt(6) + 1;
    }
}
