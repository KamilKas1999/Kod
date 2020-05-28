using System;
using System.Collections.Generic;
using System.Text;

namespace Strategia
{
    class SortowaniePrzezWybieranie : StrategiaSortowania
    {

        public void sortuj(int[] tab)
        {
            for (int i = 0; i < 20; i++)
            {
                int min = tab[i], k = 1;
                for (int j = i + 1; j < 20; j++)
                    if (min > tab[j])
                    {
                        min = tab[j];
                        k = j;
                    }
                tab[k] = tab[i];
                tab[i] = min;
            }

        }




   

    }
}
