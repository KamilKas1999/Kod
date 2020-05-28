package wypożyczalnia.filmów.v2.pkg0;

class Movie {

    String title;
    int year;
    String director;

    Movie(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }

    String show() {
        return title + " " + year + " " + director;
    }




}
