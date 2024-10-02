namespace objectoriented

{
    class Program
    {

        private class NeighbhorHouse
        {
            private Int32 Money = 0;
            public Int32 Rolando
            {
                get
                {
                    return Money;
                }

                set
                {
                    Money = value;
                }
            }
        }
        static void Main(string[] args)
        {
            NeighbhorHouse obj = new NeighbhorHouse();
            Console.Write("How much are you going to lend");
            obj.Rolando = Convert.ToInt32(Console.ReadLine());

            Console.Write("The money gave to Rolando is: " + obj.Rolando);

            Console.ReadKey();
        }



    }
}