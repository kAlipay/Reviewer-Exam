namespace objectorientedinterface

{
    class Program
    {
        //simple example of interface

        public interface Isettled 
        {
            void permission();
            void permission2();
            void permission3();
        }

        public class Marriage : Isettled
        {

            public void permission() 
            {
                Console.Write("Ok. Lets get Married");
            }

            public void permission2() 
            {
                Console.Write("\n Ok lets buy a house.");
            }

            public void permission3()
            {
                Console.Write("\n Lets have a baby");
            }
        }
        static void Main(string[] args)
        {
            Isettled obj = new Marriage();
            obj.permission();
            obj.permission2();
            obj.permission3();
            Console.ReadKey();
        }



    }
}