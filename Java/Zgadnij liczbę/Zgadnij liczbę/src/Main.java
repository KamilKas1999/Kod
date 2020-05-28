
import Statistics.WinStatistics;
import Players.PlayerComputer;
import Players.Player;


public class Main {

    public static void main(String[] args) {
        

        Game game = new Game(new WinStatistics() );

        Player player = new PlayerComputer("Stefan");
        game.addPlayer(player);

        game.addPlayer(new PlayerComputer("Stefan"));
        game.addPlayer(new PlayerComputer("Mariola"));
        for (int i = 0; i < 100; i++) {
            game.play();
        }

        game.stats.print();
        
    }

}

