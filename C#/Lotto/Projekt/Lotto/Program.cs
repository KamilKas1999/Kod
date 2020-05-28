using System;

namespace Lotto
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 10; i++)
            {
                Coupon c1 = new CouponRandom();
                Console.WriteLine(c1.showNumber());
                Lotto lotto1 = new Lotto();
                Console.WriteLine("\nTrafiłes "+lotto1.game(c1) + " liczb");
                Console.WriteLine("#############################");
            }

            int tryGet6 = 0;
            Coupon c3 = new CouponRandom();
            Lotto lotto2 = new Lotto();
            Console.WriteLine("\nPróbuję trafić 6 liczb...");
            do
            {
                c3.fill();
                tryGet6++;
            } while (lotto2.game(c3) != 6);
            Console.Write("Trafiono 6 liczb za " + tryGet6 + " razem" );
            Console.ReadKey();

        }
    }
}
