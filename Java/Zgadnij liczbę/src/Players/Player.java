package Players;


public abstract class Player {

    private String name;

    public Player(String name) {
        setName(name);
    }

    public Player() {
        this.name = "Anonim";
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z~0-9.]{3,}$")) { // !imie.isEmpty() nie działa na null, name.lenght() != 0, name.equals(""), "".name.equals(name), name != "" czasami nie działa
            this.name = name;
        } else {
            throw new IllegalArgumentException();

        }
    }

    public String getName() {
        return name;
    }

    public abstract int guess();

}
