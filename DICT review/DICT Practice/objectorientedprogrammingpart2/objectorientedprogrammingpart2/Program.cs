using Microsoft.VisualBasic.FileIO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogrammingpart2 
{
  
    class Program
    {
     //   String author = "PinoyEinstein";
        
        static void Main(string[] args)
        {
            String option = "";
            CarEngineClass Car = new CarEngineClass();

            Console.WriteLine("What car do you want?");
            Console.Write("Brand: ");
            Car.Brand = Console.ReadLine();
            Console.Write("Unit: ");
            Car.Unit = Console.ReadLine();
            Console.Write("Color: ");
            Car.Color = Console.ReadLine();

            Console.WriteLine("The car that you have chose is " + Car.Brand + ", \n" + Car.Unit + ", \n" + Car.Color );
             start:
            Console.WriteLine("What do you want to do? ");
            option = Console.ReadLine();

            if(option== "Drive")
            {
                Car.Drive();
            }
            else 
            {
                Car.Stop();
            }

            goto start;
            Console.ReadKey();
        }
    }
}