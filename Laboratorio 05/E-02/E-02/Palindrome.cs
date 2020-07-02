using System;

namespace E_02
{
    public class Palindrome
    {
        public Palindrome()
        {
        }

        public Boolean esPalindrome(string Palabra)
        {
            Console.WriteLine("Función llamada con => " + Palabra);
            if(Palabra.Length < 2) 
                return true;
            Console.WriteLine("Vamos a comparar => " + Palabra[0]);
            Console.WriteLine("Con => " + Palabra[Palabra.Length - 1]);
            
            if(Palabra[0] == Palabra[Palabra.Length - 1])
                return esPalindrome(Palabra.Substring(1,Palabra.Length - 2));
            
            return false;
        }
    }
}