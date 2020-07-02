using System;

namespace E_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Inserte la palabra: ");
            string palabra = Console.ReadLine();
            Replacement R = new Replacement();
            R.Replace(palabra);
        }
    }
}