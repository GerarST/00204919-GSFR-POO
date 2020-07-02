using System;

namespace E_02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            string palabra;
            Palindrome P= new Palindrome();
            
            Console.WriteLine("Ingrese la palabra a comparar: ");
            palabra = Console.ReadLine();

            if (P.esPalindrome(palabra))
            {
                Console.WriteLine("La palabra si es palindrome!");
            }
            else
            {
                Console.WriteLine("La palabra no es palindome!");
            }
        }
    }
}