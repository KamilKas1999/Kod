using System;

namespace Lotto
{
    internal class CouponRandom : Coupon
    {
       /// <summary>
       /// 
       /// </summary>
        public CouponRandom()
        {
            fill();
        }
        /// <summary>
        /// wypełnia losowo kupon 6 różnymi liczbami
        /// </summary>
        public override void fill() 
        {
            Random random = new Random();
            for (int i = 0; i < number.Length; i++)
            {
                number[i] = random.Next(1,49);
                for (int j = 0; j < number.Length; j++)
                {
                    while(i != j && number[i] == number[j])
                    {
                        number[i] = random.Next(1,49);
                        j = 0;
                    }
                }
            }
            Array.Sort(number);
        }             
        public override void fill(int[] tab){}
    }
}
