import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        
        String[] collectionOfName = { "Luffy", "Nami", "Usopp", "Sanji", "Zoro"};
        System.out.print("Input a name: ");
        boolean confirm = true;
        String givenName = myObj.nextLine();
        

        for(int x = 0; x <= collectionOfName.length - 1; x++)
        {
            if (givenName != collectionOfName[x])
            {
                confirm = false;
            }
        }
        System.out.print("Answer: "+ confirm);
    }
}
