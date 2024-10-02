import java.util.Scanner;

class simulationquizsolution{

    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);
       // part 1 
    //     for(int x = 0; x <= 4; x++ )
    //     {
    //         for(int y = 0; y <= 5; y++ )
    //         {
    //             System.out.print(" *");
    //         }
    //         System.out.println();
    //    }
        
        // part 2
        int year = 0;
        System.out.println("Input a number: ");
        year = myObj.nextInt();

        if(year < 1896) 
        {
            System.out.println("Olympic games is not yet stated this year.");
        }
        else if(year >= 1896 )
        {
            if(year % 4 == 0)
            {
                System.out.println("This year is olympic game");
            }
            else
            {
                System.out.println("This year is not Olympic games.");
            }
        }
        

        // part 3
        // int range = 0;
        // System.out.print("Input a number for range: ");
        // range = myObj.nextInt();

        // for(int x = 0; x <= range; x++)
        // {
        //     for (int y = 0; y <= x; y++)
        //     {
        //         if(y == 0 || y == x ||x == range)
        //         {
        //             System.out.print(" +");
        //         }
        //         else
        //         {
        //             System.out.print(" -");
        //         }
                
        //     }
        //     System.out.println();
        // }
        

        // part 4
        // int[] storage = {500, 3, 23, 4, 21, 100, 400};
        // int temp = 0;
        
        // for (int x = 0; x <= storage.length; x++)
        // {
        //     for(int y = 0; y < storage.length-1; y++)
        //     {
        //         if(storage[y] > storage[y+1])
        //         {
        //             temp = storage[y];
        //             storage[y] = storage[y + 1];
        //             storage[y+1] = temp;
        //         }
        //     }
        // }
        // for (int z : storage) 
        // {
        //     System.out.println(z);   
        // }

    }
}