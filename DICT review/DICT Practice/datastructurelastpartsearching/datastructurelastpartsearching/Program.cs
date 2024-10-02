
namespace datastructurelastpartsearching
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] collectionOfName = { "Luffy", "Nami", "Usopp", "Sanji", "Zoro" };
            Console.Write("Input a name: ");
            string givenName = Console.ReadLine();
            Boolean confirm = false;

            for (int x = 0; x <= collectionOfName.Length - 1; x++)
            {
                if (givenName == collectionOfName[x])
                {
                    confirm = true;
                }
            }
            Console.Write("Answer: " + confirm);
        
            Console.ReadKey();
        }
    }
}