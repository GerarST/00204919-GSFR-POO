using System;

namespace E_01
{
    public class SFibonacci
    {
        public SFibonacci()
        {
        }

        public void FibonacciSusesion()
        {
            Console.WriteLine("Digite la cantidad de digitos que desee: ");
            int n = Convert.ToInt32(Console.ReadLine());
            int auxn = 0;
            int auxn1 = 1;
            int auxn2;
            
            for (int i = 0; i < n; i++)
            {
                auxn2 = auxn;
                auxn = auxn1 + auxn;
                auxn1 = auxn2;

                Console.WriteLine(auxn);
            }
        }
    }
}