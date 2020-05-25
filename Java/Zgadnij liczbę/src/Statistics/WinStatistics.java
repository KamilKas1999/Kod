package Statistics;


import Players.Player;
import java.util.HashMap;
import java.util.Map;

public class  WinStatistics implements Statistics  {

    private Map<Player, Integer> stats = new HashMap();

    @Override
    public void print() {
        //System.out.println(stats);

        //  for(Player player:stats.keySet()){
        //     System.out.println(player.getName()+": "+stats.get(player));
        // }
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

//wyswietlanie statystyk print()
// winner(Player)
//clear()
