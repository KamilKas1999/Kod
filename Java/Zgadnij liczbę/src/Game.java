
import Statistics.NullStatistics;
import Statistics.Statistics;
import Players.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private Random dice = new Random();
    //public final Statistics stats = new Statistics();
    public final Statistics stats;
    private List<Player> list = new ArrayList();
    private Player player;

    public Game() { //w stats nie może być NULL
       this(null); // jako konstruktor
    }

    public Game(Statistics stats) {
        if(stats != null){
        this.stats = stats;
        }else{
          this.stats = new NullStatistics();  
        }
    }

    public void addPlayer(Player player) {
        list.add(player);
        this.player = player;
        for (int i = 0; i < list.size() - 1; i++) {

            if (this.player.getName() == list.get(0).getName()) {
                System.out.println("Istnieje dwóch takich samych graczy");
                this.player.setName(this.player.getName() + "1");
            }
        }
    }

    public void removePlayer(Player player) {
        list.remove(player);
    }

    public void removePlayerByName(String name) {
        for (int i = 0; i < list.size() - 1; i++) {

            if (this.player.getName() == name) {
                list.remove(player);
            }
        }
        //for(Player player : list){ nie działa nie bo nie działa
        // if(player.getName()==name){ 
        //   list.remove(player);
        // }

        // }
        //for(Iterator<Player> it = players.iterator(); it.hasNext();{
        //if (it.next().getName().equals(name)){
        //  it.remove();
        //}
        //}
        //players.removeIf ((Player player) -> {return playet.getName().equals(name);}); wyrażenie lambda
    }

    public void showPlayer() {
        System.out.println("Lista graczy:");
        for (Player player : list) {
            System.out.println(player.getName());
        }
    }

    public void play() {

        System.out.println("Liczba graczy: " + list.size());
        int diveThrow = 0;
        int playerGuess = 0;
        int round = 1;
        boolean repeat;

        System.out.println(list.size());
        do {
            System.out.println();
            System.out.println("Runda " + round++);
            repeat = true;
            diveThrow = dice.nextInt(6) + 1;

            for (Player player : list) {
                playerGuess = player.guess();
                System.out.println("Wylosowana liczba: " + diveThrow);
                System.out.print(" Liczba gracza " + player.getName() + ": " + playerGuess);
                if (diveThrow != playerGuess) {
                    System.out.println(" Nie zgadłeś!");
                } else {
                    System.out.println(" Zgadłeś");
                    repeat = false;
                    stats.andTheWinnerIs(player);
                }
            }
        } while (repeat);
    }
    

    //public void printStats(){
    //    stats.print();
    //}
}
//list.get(0).getName()
