
package wypożyczalnia.filmów.v2.pkg0;


public class WypożyczalniaFilmówV20 {

   
    public static void main(String[] args) {
        Movie an1 = new Animation("Coco", 2017, "Unkrich", 3);
        Movie an2 = new Animation("Zwierzogrod", 2016 , "Byron_Howard", 3);
        Movie an3 = new Animation("WALL-E", 2008  , "Andrew_Stanton", 3);
        Movie ac1 = new Action("Straznicy_Galaktyki", 2014, "James_Gunn");
        Movie ac2 = new Action("Player_One ", 2018 , "Steven_Spielberg");
        Movie ac3 = new Action("Avengers ", 2012  , "Joss_Whedon");
        Movie s1 = new Series("The_100", 2014, "Jason_Rotherberg",100,7);
        Movie s2 = new Series("The_Walking_Dead", 2010 , "Frank_Darabont",146, 10);
        Movie s3 = new Series("Kosci ", 2005  , "Hart_Hanson",246,12);
        Collection k = new Collection();
        k.add(an1);
        k.add(an2);
        k.add(an3);
        k.add(ac1);
        k.add(ac2);
        k.add(ac3);
        k.add(s1);
        k.add(s2);
        k.add(s3);
        k.show();
    }
    
}
