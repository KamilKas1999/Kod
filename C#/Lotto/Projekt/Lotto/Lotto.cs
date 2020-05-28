using System;

namespace Lotto
{
    class Lotto
    {
        int[] winNumber = new int[6];
        public Lotto()
        {
            randomNumber();
            showNumber();
        }
        /// <summary>
        /// sprawdza, ile gracz trafił liczb
        /// </summary>
        /// <param name="coupon">Kupon gracza</param>
        /// <returns>zwraca liczbę trafionych liczb</returns>
        public int game(Coupon coupon)
        {
            int hitNumber = 0;
            for (int i = 0; i < winNumber.Length; i++)
            {
                for (int j = 0; j < coupon.number.Length;j++)
                {
                    if(coupon.number[i] == winNumber[j])
                    {
                        hitNumber++;
                    }
                }
            }
            return hitNumber;
        }
        /// <summary>
        /// pokazuje zwycięskie liczby
        /// </summary>
        private void showNumber()
        {
            Console.WriteLine("Zwycięskie liczby to: ");

            foreach (int n in winNumber)
            {
                Console.Write(n + " ");
            }
     }
        /// <summary>
        /// losuje 6 zwycięskich liczb
        /// </summary>
        private void randomNumber()  
        { 
            Random random = new Random();
            for (int i = 0; i < winNumber.Length; i++)
            {
                winNumber[i] = random.Next(1, 49);
                for (int j = 0; j < winNumber.Length; j++)
                {
                    while (i != j && winNumber[i] == winNumber[j])
                    {
                        winNumber[i] = random.Next(1, 49);
                        j = 0;
                    }
                }
            }
        }

    }
}
