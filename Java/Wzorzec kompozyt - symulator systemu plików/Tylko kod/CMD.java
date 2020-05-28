package symulator.systemu.plików;

import java.util.Scanner;

public class CMD {

    void cmd() {
        SystemPlików system = new SystemPlików();
        Scanner scan = new Scanner(System.in);
        String komenda;
        String[] podzielonaKomenda = null;
        boolean exit = true;

        //główny program//
        system.generuj();
        while (exit) {

            //wyswietlenie aktualnej lokacji//
            system.wypisz();

            //uzytkownik wpisuje komende do wykonania//
            komenda = scan.nextLine();
            podzielonaKomenda = komenda.split(" ");

            // wywołanie odpowiedniego efektu//
            switch (podzielonaKomenda[0]) {
                case "cd":
                    try {
                        system.cd(podzielonaKomenda[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Brak folderu docelowego lub ..");
                    }
                    break;
                case "dir":
                    if (podzielonaKomenda.length == 1) {
                        system.dir();
                    } else {
                        System.out.println("Wpisz samo dir");
                    }
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Błędna komenda");
                    break;
            }

        }

    }

}
