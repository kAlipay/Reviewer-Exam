namespace datastructurelastpartmerging
{
    class Program
    {
        static void Main(string[] args) 
        {
            string[] TeamJade = { "Jade", "Rombert", "Clyde", "Jazzy", "McMheil" };
            string[] TeamKyla = { "Kyla", "Joan", "Dhorees", "Valen", "Marie", "Joseph", "Franklimie Love" };

            string[] combinedGroup = TeamJade.Concat(TeamKyla).ToArray();

            foreach (string a in combinedGroup)
            {
                Console.WriteLine(a);
            }

            Console.ReadKey();
        }
    }
}