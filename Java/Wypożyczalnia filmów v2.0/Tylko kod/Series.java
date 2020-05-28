package wypożyczalnia.filmów.v2.pkg0;

public class Series extends Movie {
    int episodes;
    int season;

    Series(String title, int year, String director, int episodes, int season)
    {
        super(title, year, director);
        this.episodes = episodes;
        this.season = season;
    }

    @Override
    String show()
    {
        return title + " " + year + " " + director + " " + year + " " + episodes + " " + season;
    }
}
