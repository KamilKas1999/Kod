package wypożyczalnia.filmów.v2.pkg0;

import java.util.ArrayList;

public class  Collection {
    ArrayList<Animation> animationList = new ArrayList<>();
    ArrayList<Action> actionList = new ArrayList<>();
    ArrayList<Series> seriesList = new ArrayList<>();

    void add(Movie movie)
    {
        if (movie instanceof Animation) {
                animationList.add((Animation) movie);
        }
        else if (movie instanceof Action) {
            actionList.add((Action) movie);
        }
        else if (movie instanceof Series) {
            seriesList.add((Series) movie);
        }
    }

    void show()
    {
        System.out.println("Filmy animowane: ");
        for (Animation animation: animationList) {
            System.out.println(animation.show());
            
        }
        System.out.println("Filmy aktorskie: ");
        for (Action action: actionList) {
            System.out.println(action.show());
        }
        System.out.println("Seriale: ");
        for (Series series: seriesList) {
            System.out.println(series.show());
        }
    }

   

}
