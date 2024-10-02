import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        int[] collectionNumbers = new int[4];
        
        for(int x = 0; x <= collectionNumbers.length - 1; x++ )
        {
            System.out.print("Input a number: ");
            collectionNumbers[x] = myObj.nextInt();
        }
        System.out.print("Output \n");

        for(int z : collectionNumbers)
        {
            System.out.println(z);
        }
    }
}
