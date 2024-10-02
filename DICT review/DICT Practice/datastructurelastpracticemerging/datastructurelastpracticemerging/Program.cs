using System.Linq;

namespace datastructurelastpracticemerging 
{
    class Program { 
    static void Main(String[] args) {

            String[] TeamJade = { "Jade", "Rombert", "Clyde", "Jazzy", "McMheil" };
            String[] TeamKyla = { "Kyla", "Joan", "Dhorees", "Valen", "Marie", "Joseph", "Franklimie Love" };

            String[] combinedGroup = TeamJade.Concat(TeamKyla).ToArray();

            foreach (String a in combinedGroup)
            {
                Console.WriteLine(a);
            }
            Console.ReadKey();
        }
        
    }
}