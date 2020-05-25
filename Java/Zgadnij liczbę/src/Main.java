
import Statistics.WinStatistics;
import Players.PlayerComputer;
import Players.Player;


//import java.util.ArrayList;
//import java.util.List;
public class Main {

    public static void main(String[] args) {
        
//Statistics stats = new Statistics();
        Game game = new Game(new WinStatistics() );

        Player player = new PlayerComputer("Stefan");
        game.addPlayer(player);

        game.addPlayer(new PlayerComputer("Stefan"));
        game.addPlayer(new PlayerComputer("Mariola"));
        for (int i = 0; i < 100; i++) {
            game.play();
        }
        //game.stats = null; nie działa bo final
        game.stats.print();
        
    }

}
/*
        List<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++){
             System.out.println(list.get(i));
        }
        
        for(String s : list){
            System.out.println(s);
        }
        Iterator<String> it = list.interator();
        while.(it.hasNest()){
        system.out.println(it.next());
        }
        .next();
        .hasNext();
        
        for(Iterator<String> it = list.interator() ; it.hasNext(); ){ //operator w pętli
        system.out.println(it.next());
        }
        
        
        
       

        try {
            player.setName("Stefan");
        } catch (IllegalArgumentException ex) {
            System.err.println("Nieprawidłowe imię: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.err.println("Błąd: " + ex.getMessage());
        }
 

//regex101
 */
