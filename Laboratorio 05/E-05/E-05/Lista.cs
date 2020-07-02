using System;
using System.Collections;
using System.Collections.Generic;

namespace E_05
{
    public class Lista
    {
        public Lista()
        {
        }

        public void Almacenar()
        {
            List<char> Chars = new List<char>();
            int op = 0;
            char letter;
            Console.WriteLine("1. Introducir letras.");
            Console.WriteLine("0. Imprimir y salir. ");
            do
            {
                op = Convert.ToInt32(Console.ReadLine());
                switch (op)
                {
                    case 1: 
                        Console.WriteLine("Introduzca la letra que desee: ");
                        letter = Convert.ToChar(Console.ReadLine());
                        if(letter == 'a' ||letter == 'A'
                            || letter == 'e' || letter == 'E'
                            ||letter == 'i' || letter == 'I'
                            || letter == 'o' || letter == 'O'
                            ||letter == 'U' || letter == 'U')
                            Chars.Add(letter); 
                        
                        break;
                    case 0:
                        foreach (char Char in Chars)
                        {
                            Console.WriteLine(Char);
                            return;
                        }
                        break;
                }
                
                Console.WriteLine("1. Introducir letras.");
                Console.WriteLine("0. Imprimir y salir. ");
            } while (op != 0);
        }
        
    }
}