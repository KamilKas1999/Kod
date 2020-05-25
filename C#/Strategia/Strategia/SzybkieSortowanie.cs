using System;
using System.Collections.Generic;
using System.Text;

namespace Strategia
{
    class SzybkieSortowanie : StrategiaSortowania
    {
        public void sortuj(int[] tablica)
        {
            QuickSort(tablica, 0, tablica.Length - 1);
        }
        public static void QuickSort(int[] array, int left, int right)
        {
            var i = left;
            var j = right;
            var pivot = array[(left + right) / 2];
            while (i < j)
            {
                while (array[i] < pivot) i++;
                while (array[j] > pivot) j--;
                if (i <= j)
                {
                    // swap
                    var tmp = array[i];
                    array[i++] = array[j];  // ++ and -- inside array braces for shorter code
                    array[j--] = tmp;
                }
            }
            if (left < j) QuickSort(array, left, j);
            if (i < right) QuickSort(array, i, right);
        }
    }
}
