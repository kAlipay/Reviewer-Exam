import java.util.*;


public class Testingstrings{
public static String[] products = {null, "1. Fried chicken ",
                                 "2. Beef steak", 
                                 "3. Lumpiang Shanhai"
                                , "4. Beef Tapa"};
    public static int[] product_price ={0,99,99,130,130};
    public static int[] final_qty=new int[5];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int product;
        int product1 = 0;
        int product2 = 0;
        int product3 = 0;
        int product4 = 0;
        int quantity;
        char decision;
        do
		{
        
        for(int i = 0; i < products.length; i++)
			{
				if(products[i] != null)
				System.out.println(products[i]);
			}
        

        System.out.println("Please enter the product you want to output.");
        product=s.nextInt();
        System.out.println("How many quantity would you like to output");
        quantity=s.nextInt();

        // System.out.println("Please enter what product would you like to choose");
        // choose=s.nextInt();

     
        switch(product)
			{
				case 1:
                product1 += quantity;
				final_qty[1]=product1;
				break;
				
				case 2:
                product2 += quantity;
				final_qty[2]=product2;
				break;

				case 3: 
                product3 += quantity;
				final_qty[3]=product3;
				break;
                case 4: 
                product3 += quantity;
				final_qty[4]=product3;
				break;
			}

    
        System.out.print("Would you like to continue again? Y/N / y/n: ");	
			decision=s.next().charAt(0);
		}while(decision != 'n' && decision != 'N');
        System.out.println("==Final Cart==");
		System.out.println("\t\\Item\t\\Qty\t\\Total");
		int sum=0;
		for(int i=0; i < final_qty.length; i++)
		{
			if(final_qty[i] != 0)
			{
				System.out.println(products[i]+"\\"+final_qty[i]+"\\"+final_qty[i]*product_price[i]);
				sum = sum + final_qty[i]*product_price[i];
			}
		}
		System.out.println("Total Purchased items: "+(product1+product2+product3+product4));
		System.out.println("Total Purchase: "+sum);
		int payment=0;
		do
		{
		System.out.print("Enter Payment: ");
		payment=s.nextInt();
		}while(sum > payment);
		System.out.println("Thank you for buying! here's your change: "+(payment-sum));
    
    }

}