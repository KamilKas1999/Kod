using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;
using System.Xml.Schema;

namespace Lotto
{
     class CouponManual : Coupon
    {
        public CouponManual() { }
        public CouponManual(int[] tab)
        {
            fill(tab);
        }
        /// <summary>
        /// sprawdza czy podano 6 różnych liczb w przedziale od 0 do 49 i wypełnia tablica jeśli tak
        /// </summary>
        /// <param name="tab">tablica, z której pobrane są liczby</param>
        public override void fill(int[] tab) 
        {
            bool ok = true;
            for(int i = 0; i < 6; i++)
            {
                if (tab[i] < 0 || tab[i] > 49)
                {
                   ok = false;
                   break;
                }
                for (int j = 0; j < 6; j++)
                {              
                    if (i != j && tab[i] == tab[j])
                    {
                        ok = false;
                        break;
                    }
                }
            }
            if (ok)
            {
                for (int i = 0; i < 6; i++)
                {
                    number[i] = tab[i];
                }
                Array.Sort(number);
            }
        }
        public override void fill() {}
    }
}
