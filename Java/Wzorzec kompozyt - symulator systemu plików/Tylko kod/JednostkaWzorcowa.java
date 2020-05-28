package symulator.systemu.plików;

import java.util.ArrayList;

public abstract class JednostkaWzorcowa {

    public JednostkaWzorcowa(String nazwa, String typ) {
        this.nazwa = nazwa;
        this.typ = typ;

    }

    public abstract void wypiszInfo();
    public abstract void wypiszInfoOgraniczone(); // dopisane
    public abstract ArrayList<JednostkaWzorcowa> podajSkladowe(); // dopisane  
    protected String nazwa;
    protected String typ;

}
