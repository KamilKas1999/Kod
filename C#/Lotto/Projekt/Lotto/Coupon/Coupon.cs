using System;
using System.Collections.Generic;
using System.Data;
using System.Text;
using System.Xml.Schema;

namespace Lotto
{
    abstract class Coupon
    {
        public int[] number = new int[6];
        public abstract void fill();     
        public abstract void fill(int[] tab);
       
        /// <summary>
        /// Pokazuje skreślone liczby
        /// </summary>
        /// <returns>zwraca łańych z liczbami</returns>
        public string showNumber() {
            foreach(int n in number)
            {
                if(n == 0)
                {
                    return "Kupon niepoprawnie wypełniony";
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            foreach (int n in number)
            {
                stringBuilder.Append(n + " ");
            }             
            return "Twoje liczby to: \n" + stringBuilder.ToString();
        }
        /// <summary>
        /// sprawdza czy kupon jest poprawnie wypełniony
        /// </summary>
        /// <returns>Jeśli tak, zwraca true</returns>
        public bool correct()
        {
            for (int i = 0; i < number.Length; i++)
            {
                for (int j = 0; j < number.Length; j++)
                {
                    if (i != j && number[i] == number[j])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
