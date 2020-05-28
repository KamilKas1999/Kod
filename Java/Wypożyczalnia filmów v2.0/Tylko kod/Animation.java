package wypożyczalnia.filmów.v2.pkg0;

public class Animation extends Movie {

    int dimension;

    public Animation(String title, int year, String director, int dimension)
    {
        super(title, year, director);
        this.dimension = dimension;
    }

    @Override
    String show()
    {
        return title + " " + year + " " + director + " " + year;
    }

}
