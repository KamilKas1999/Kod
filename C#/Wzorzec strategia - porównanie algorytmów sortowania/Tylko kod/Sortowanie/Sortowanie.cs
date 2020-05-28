using System;
using System.Collections.Generic;
using System.Text;

namespace Strategia
{
    class Sortowanie
    {
        private StrategiaSortowania strategia;
       
            public void sortuj(int[] tablica)
            {
                strategia.sortuj(tablica);
            }
            public void ustawSortowanie(StrategiaSortowania s)
            {
                strategia = s;
            }
           
        }
    
}

