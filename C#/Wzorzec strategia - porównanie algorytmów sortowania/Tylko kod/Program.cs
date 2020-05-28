using System;
using System.Diagnostics;

namespace Strategia
{
    class Program
    {
        static void Main(string[] args)
        {
            Testowanie test = new Testowanie();
            test.testuj(1000);
            test.testuj(10000);
            test.testuj(100000);
        }
    }
}
