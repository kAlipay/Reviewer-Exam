import java.util.*;

public class Main {

    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int quantity;
		int p1=0;
        int choose;
        char decision;
		do
		{
            System.out.print("what operation would you use 1. for addition 2. for subtraction");
			choose=s.nextInt();

			if(choose == 1){
			System.out.print("Add an number ");
			quantity=s.nextInt();
			
            p1 += quantity ; 

            System.out.println("adition is "+ (p1));
             }
            else if(choose == 2){
            System.out.print("Minus an number ");
			quantity=s.nextInt();
			
            p1 -= quantity ;
            System.out.println("the number has minus "+ (p1));
            }else{
                System.out.println("You entered the wrong number");
            }

			System.out.print("Would you like to order again? Y/N / y/n: ");	
			decision=s.next().charAt(0);
		}while(decision != 'n' && decision != 'N');

}
}