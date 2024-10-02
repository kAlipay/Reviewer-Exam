using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objectorientedprogramminglastpart
{
    class Program
    {
        class GrandFather 
        {
          public String Eyes = "Diamond Shape eyes";
        }
        class Father : GrandFather 
        {
           public String Nose = "Pointed Nose";
        }

        class Son : Father
        {
            public String Panit = "White Skin";
        }

        static void Main(string[] args)
        {
            Father obj = new Father();

            Console.Write("Son Inherits" + obj.Eyes + "and " + obj.Nose + " \nexcepts his owned" + obj.Nose );
            
        }
    }
}