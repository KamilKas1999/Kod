package Statistics;

import Players.Player;
import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {

    private Map<Player, Integer> stats = new HashMap();

    @Override
    public void print() {
        stats.forEach((Player player, Integer score)
                -> System.out.println(player.getName() + ": " + score));
    }

    @Override
    public void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0) + 1;
        stats.put(player, score);
    }

    @Override
    public void clear() {
        stats.clear();
    }

}
