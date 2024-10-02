
namespace datastructurelastpartdeleting
{
    class Program {
        static void Main(string[] args)
        {
            // Scanner myObj = new Scanner(System.in);
            char[] collectionOfLetter = { 'a', 'b', 'c', 'd', 'e', 'f' };
            int pos = 0;

            Console.Write("Type a number of position: ");
            pos = Convert.ToInt32(Console.ReadLine());

            for (int x = pos; x < collectionOfLetter.Length - 1; x++)
            {

              //  a = 0 b = 1 c = 2 d = 3 e = 4 f = 5
                collectionOfLetter[x] = collectionOfLetter[x + 1];
            }

           collectionOfLetter = collectionOfLetter.Take(collectionOfLetter.Count() - 1).ToArray();

            foreach (char i in collectionOfLetter)
            {
                Console.Write(i);
            }
            Console.ReadKey();
        }
    }
}
