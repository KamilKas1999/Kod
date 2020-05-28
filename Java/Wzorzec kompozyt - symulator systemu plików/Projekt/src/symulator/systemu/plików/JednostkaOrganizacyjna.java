package symulator.systemu.plików;

import java.util.ArrayList;

class JednostkaOrganizacyjna extends JednostkaWzorcowa {

    public JednostkaOrganizacyjna(String nazwa, String typ) {
        super(nazwa, typ);
    }

    public void dodaj(JednostkaWzorcowa j) {
        skladowe.add(j);
    }

    int i = 0;

    protected ArrayList<JednostkaWzorcowa> skladowe = new ArrayList();

    @Override
    public void wypiszInfo() {
        System.out.println(typ + ": " + nazwa + ", zawiera: ");
        for (JednostkaWzorcowa j : skladowe) {
            j.wypiszInfo();
        }
    }

    public void wypiszInfoOgraniczone() { // dopisane

        for (JednostkaWzorcowa j : skladowe) {
            System.out.println(j.nazwa);
        }
    }

    public void usun(JednostkaWzorcowa j) {
        skladowe.remove(j);
    }

    public void wyczysc() {
        skladowe.clear();
    }

    public ArrayList<JednostkaWzorcowa> podajSkladowe() {
        return skladowe;
    }
}
