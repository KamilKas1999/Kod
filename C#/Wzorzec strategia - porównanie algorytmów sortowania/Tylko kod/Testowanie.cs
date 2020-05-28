using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;

namespace Strategia
{
    class Testowanie
    {
        Random random = new Random();
        Sortowanie strategia = new Sortowanie();
        Stopwatch stopwatch = new Stopwatch();
        long suma;
        int[] tablica;

        public void testuj(int wielkoscTablicy)
        {
            tablica = new int[wielkoscTablicy];
            testujBabelkowe(wielkoscTablicy);
            testujWybieranie(wielkoscTablicy);
            testujSzybkie(wielkoscTablicy);
            testujWbudowane(wielkoscTablicy);
            Console.WriteLine("##############################################################################################");
        }
        void wypelnijTablice(int[] tablica)
        {
            for (int i = 0; i < tablica.Length; i++)
            {
                tablica[i] = random.Next(1, 100);
            }
        }

        void testujBabelkowe(int wielkoscTablicy)
        {
            Console.WriteLine("Sortuje bąbelkowo dla tablicy o wielkości: " + wielkoscTablicy);
            suma = 0;
            strategia.ustawSortowanie(new SortowanieBabelkowe());
            for (int i = 0; i < 10; i++)
            {     
                wypelnijTablice(tablica);
                stopwatch.Restart();
                strategia.sortuj(tablica);
                stopwatch.Stop();
                suma += (stopwatch.ElapsedMilliseconds);
            }
            Console.WriteLine("Średnio zajęło to: " + suma / 10 + " milisekund");
        }

        void testujWybieranie(int wielkoscTablicy)
        {
            Console.WriteLine("Sortuje przez wybieranie dla tablicy o wielkości: " + wielkoscTablicy);
            suma = 0;
            strategia.ustawSortowanie(new SortowaniePrzezWybieranie());
            for (int i = 0; i < 10; i++)
            {
                wypelnijTablice(tablica);
                stopwatch.Restart();
                strategia.sortuj(tablica);
                stopwatch.Stop();
                suma += (stopwatch.ElapsedMilliseconds);
            }
            Console.WriteLine("Średnio zajęło to dla 10 prób: " + suma / 10 + " milisekund");
        }

        void testujSzybkie(int wielkoscTablicy)
        {
            Console.WriteLine("Sortuje szybko dla tablicy o wielkości: " + wielkoscTablicy);
            suma = 0;
            strategia.ustawSortowanie(new SzybkieSortowanie());
            for (int i = 0; i < 10; i++)
            {
                wypelnijTablice(tablica);
                stopwatch.Restart();
                strategia.sortuj(tablica);
                stopwatch.Stop();
                suma += (stopwatch.ElapsedMilliseconds);
            }
            Console.WriteLine("Średnio zajęło to dla 10 prób: " + suma / 10 + " milisekund");
        }
        void testujWbudowane(int wielkoscTablicy)
        {
            Console.WriteLine("Sortuje metodą wbudowaną dla tablicy o wielkości: " + wielkoscTablicy);
            suma = 0;
            strategia.ustawSortowanie(new SortowanieWbudowane());
            for (int i = 0; i < 10; i++)
            {
                wypelnijTablice(tablica);
                stopwatch.Restart();
                strategia.sortuj(tablica);
                stopwatch.Stop();
                suma += (stopwatch.ElapsedMilliseconds);
            }
            Console.WriteLine("Średnio zajęło to dla 10 prób: " + suma / 10 + " milisekund");
        }
    }

}



 
