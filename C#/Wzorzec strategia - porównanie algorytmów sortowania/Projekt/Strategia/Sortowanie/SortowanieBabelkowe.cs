using System;
using System.Collections.Generic;
using System.Text;

namespace Strategia
{
    class SortowanieBabelkowe : StrategiaSortowania
    {
        public void sortuj(int[] tablica)
        {
            int n = tablica.Length;
            do
            {
                for (int i = 0; i < n - 1; i++)
                {
                    if (tablica[i] > tablica[i + 1])
                    {
                        int tmp = tablica[i];
                        tablica[i] = tablica[i + 1];
                        tablica[i + 1] = tmp;
                    }
                }
                n--;
            }
            while (n > 1);
        }
    }
}
