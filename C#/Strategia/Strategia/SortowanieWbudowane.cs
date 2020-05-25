using System;
using System.Collections.Generic;
using System.Text;

namespace Strategia
{
    class SortowanieWbudowane : StrategiaSortowania
    {
        public void sortuj(int[] tablica)
        {
            Array.Sort(tablica);
        }
    }
}
