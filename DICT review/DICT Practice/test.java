import java.util.*;

public class test{

    public static void main (String [] args){
        Scanner myObj = new Scanner(System.in);

        int number = 100;
        int sum;
        
     do{
        System.out.println("Please input not below than 100:");
        sum = myObj.nextInt();
     }while(sum > number);
     
     System.out.println("You input now the number of "+ sum +" Your number is now below than 100");
}
     
    }