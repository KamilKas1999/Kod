package symulator.systemu.plików;

import java.util.ArrayList;
import java.util.List;

public class SystemPlików {

    JednostkaPodstawowa plikTest1 = new JednostkaPodstawowa("Pliczek.txt", "Dokument tekstowy");
    JednostkaPodstawowa plikTest2 = new JednostkaPodstawowa("Kody.txt", "Dokument tekstowy");

    JednostkaPodstawowa pdf = new JednostkaPodstawowa("Info.pdf", "Plik pdf");
    JednostkaPodstawowa odt = new JednostkaPodstawowa("zadanie.odt", "OD Dokument tekstowy");

    JednostkaPodstawowa java1 = new JednostkaPodstawowa("cmd.java", "Aplikacja");
    JednostkaPodstawowa java2 = new JednostkaPodstawowa("SystemPlików.java", "Aplikacja");
    JednostkaPodstawowa java3 = new JednostkaPodstawowa("kompozyt.java", "Aplikacja");

    JednostkaPodstawowa exe1 = new JednostkaPodstawowa("Netbeans IDE 8.2.exe", "Aplikacja");
    JednostkaPodstawowa exe2 = new JednostkaPodstawowa("Dev C++.exe", "Aplikacja");
    JednostkaPodstawowa exe3 = new JednostkaPodstawowa("Libre Office.exe", "Aplikacja");
    JednostkaPodstawowa exe4 = new JednostkaPodstawowa("Google Chrome.exe", "Aplikacja");
    JednostkaPodstawowa exe5 = new JednostkaPodstawowa("deleteSystem32.exe", "Aplikacja");
    JednostkaPodstawowa exe6 = new JednostkaPodstawowa("boot.exe", "Aplikacja");

    JednostkaOrganizacyjna symulatorSystemuPlików = new JednostkaOrganizacyjna("SymulatorSystemuPlików", "folder");
    JednostkaOrganizacyjna pulpit = new JednostkaOrganizacyjna("pulpit", "folder");
    JednostkaOrganizacyjna dokumenty = new JednostkaOrganizacyjna("dokumenty", "folder");
    JednostkaOrganizacyjna janusz = new JednostkaOrganizacyjna("Janusz", "folder");
    JednostkaOrganizacyjna uzytkownicy = new JednostkaOrganizacyjna("Użytkownicy", "folder");
    JednostkaOrganizacyjna boot = new JednostkaOrganizacyjna("boot", "folder");
    JednostkaOrganizacyjna system32 = new JednostkaOrganizacyjna("system32", "folder");
    JednostkaOrganizacyjna windows = new JednostkaOrganizacyjna("Windows", "folder");
    JednostkaOrganizacyjna C = new JednostkaOrganizacyjna("C:", "dysk");

    List<JednostkaWzorcowa> aktualnaPozycja = new ArrayList<JednostkaWzorcowa>();

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void wypisz() {
        char ukosnik = 92;
        System.out.print(aktualnaPozycja.get(0).nazwa);
        boolean pominPierwszy = false;

        for (JednostkaWzorcowa element : aktualnaPozycja) {
            if (pominPierwszy) {
                System.out.print(ukosnik + element.nazwa);
            } else {
                pominPierwszy = true;
            }
        }

        System.out.print("> ");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void cd(String gdzie) {

        if (gdzie.equals("..")) {

            if (aktualnaPozycja.size() > 1) {
                aktualnaPozycja.remove(aktualnaPozycja.size() - 1);
            } else {
                System.out.println("Nie możesz się już dalej cofnąć");
            }

        } else {
            JednostkaWzorcowa aktualnyKatalog = aktualnaPozycja.get(aktualnaPozycja.size() - 1);
            ArrayList<JednostkaWzorcowa> zawartosc = aktualnyKatalog.podajSkladowe();
            boolean czyZnaleziono = false;

            for (JednostkaWzorcowa s : zawartosc) {
                if (s.nazwa.equals(gdzie) && s.typ.equals("folder")) {
                    aktualnaPozycja.add(s);
                    czyZnaleziono = true;
                    break;
                }
            }

            if (!czyZnaleziono) {
                System.out.println("Brak folderu o podanej nazwie w obecnym katalogu");
            }

        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void dir() {
        JednostkaWzorcowa aktualnyKatalog = aktualnaPozycja.get(aktualnaPozycja.size() - 1);
        aktualnyKatalog.wypiszInfoOgraniczone();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void generuj() {

        symulatorSystemuPlików.dodaj(java1);
        symulatorSystemuPlików.dodaj(java2);
        symulatorSystemuPlików.dodaj(java3);

        pulpit.dodaj(symulatorSystemuPlików);
        pulpit.dodaj(exe1);
        pulpit.dodaj(exe2);
        pulpit.dodaj(exe3);
        pulpit.dodaj(exe4);
        pulpit.dodaj(plikTest1);

        dokumenty.dodaj(plikTest2);
        dokumenty.dodaj(odt);

        janusz.dodaj(pulpit);
        janusz.dodaj(dokumenty);

        uzytkownicy.dodaj(janusz);

        system32.dodaj(exe5);

        boot.dodaj(exe6);

        windows.dodaj(boot);
        windows.dodaj(system32);

        C.dodaj(uzytkownicy);
        C.dodaj(windows);

        aktualnaPozycja.add(C);
        aktualnaPozycja.add(uzytkownicy);
        aktualnaPozycja.add(janusz);

    }
}
