using System;
namespace E_04
{
    public class Replacement
    {
        public Replacement()
        {
        }

        public void Replace(string word)
        {
            Console.WriteLine("Palabra: " + word);

            foreach (var caracter in word)
                word = word.Replace('a', 'b');
            
            Console.WriteLine("Nueva palabra: " + word);
        }
    }
}