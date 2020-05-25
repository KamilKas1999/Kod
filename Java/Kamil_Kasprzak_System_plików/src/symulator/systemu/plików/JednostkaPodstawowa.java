package symulator.systemu.plików;

import java.util.ArrayList;

public class JednostkaPodstawowa extends JednostkaWzorcowa {

    public JednostkaPodstawowa(String nazwa, String typ) {
        super(nazwa, typ);
    }

    @Override
    public void wypiszInfo() {
        System.out.println(typ + ": " + nazwa);
    }

    public void wypiszInfoOgraniczone() { // dopisane
    }

    @Override
    public ArrayList<JednostkaWzorcowa> podajSkladowe() { // dopisane
        return null;
    }
}
