using System;

namespace E_03
{
    public class Recursividad
    {
        public Recursividad()
        {
        }

        public void FuncionRecursiva(int num, int numBase)
        {
            if (num < numBase)
            {
                Console.WriteLine(num);
                FuncionRecursiva(num+1,numBase);
                Console.WriteLine(num);
            }else if (num == numBase)
            {
                Console.WriteLine(num);
            }
        }
    }
}