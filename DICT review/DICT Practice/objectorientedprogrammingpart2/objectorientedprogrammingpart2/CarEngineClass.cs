using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogrammingpart2
{
    class CarEngineClass
    {
        public String Brand = "", Unit = "", Color = "";
       
        public void Drive()
        {
            Console.WriteLine("The Car is now driving . . .");
        }

        public void Stop()
        {
            Console.WriteLine("The Car is now stoping. . .");
        }
    }
}
