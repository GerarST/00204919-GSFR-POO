using System;

namespace E_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el numero: ");
            int n = Convert.ToInt32(Console.ReadLine());
            int num = 1;
            
            Recursividad R = new Recursividad();
            R.FuncionRecursiva(num,n);

        }
    }
}
