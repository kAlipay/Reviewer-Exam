import java.util.*;

public class orders
{
   

	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
        int choose, fnumber, snumber, answer;
		char decision, choice;

		do
		{
	
        System.out.print("Please enter your firstnumber: ");
			fnumber = s.nextInt();
			
			System.out.print("Please enter your second number: ");
			snumber = s.nextInt();

            System.out.print("What opperation would you use 1. Addition 2. Subtraction 3. Multiplication 4. Division?");
			choose = s.nextInt();

			if(choose == 1){
                answer = fnumber + snumber;
                System.out.println("fhe answer of " + fnumber + " and " + snumber + "is "+ answer);
            }else if (choose == 2) {
                answer = fnumber - snumber;
                System.out.println("fhe answer of " + fnumber + " and " + snumber + "is "+ answer);
            }else if (choose == 3) {
                answer = fnumber * snumber;
                System.out.println("fhe answer of " + fnumber + " and " + snumber + "is "+ answer);
            }else if (choose == 4) {
                answer = fnumber / snumber;
                System.out.println("fhe answer of " + fnumber + " and " + snumber + "is "+ answer);
            }else{
                System.out.println("no operation is found");
            }
        System.out.print("Would you like to calculate again? Y/N / y/n: ");	
			decision=s.next().charAt(0);
		}while(decision != 'n' && decision != 'N');
	}	
}