import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);
        char[] collectionOfLetter = {'a','b','c','d','e','f'};
        int pos = 0;

        System.out.print("Type a number of position");
        pos = myObj.nextInt();

        for(int x = pos; x < collectionOfLetter.length-1; x++)
        {
            collectionOfLetter[x] = collectionOfLetter[x + 1];
        }

        collectionOfLetter = collectionOfLetter.Take(collectionOfLetter.Count() - 1).ToArray();
    
        for (char i : collectionOfLetter)
        {
            System.out.println(i);
        }
    }
}
