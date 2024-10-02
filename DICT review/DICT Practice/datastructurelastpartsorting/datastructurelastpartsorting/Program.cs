using System;
namespace datastructurelastpartsorting {
    class Program {
    
        static void Main(string [] args) {
    int[] storage = { 500, 3, 23, 4, 21, 100, 400 };
    int temp = 0;

    for(int x = 0; x <= storage.Length; x++)
    {
    for(int y = 0; x < storage.Length-1; y++)
    {
        if(storage[y] > storage[y+1])
        {
            temp = storage[y];
            storage[y] = storage[y + 1];
            storage[y + 1] = temp;
        }
    }
}
    foreach(int z in storage)
{
    Console.WriteLine(z);
}
        }
    }
}