

public class App {
    public static void main(String[] args) throws Exception {
            
        String[] letterStrings = { "Luffy" ,"Nami", "Usopp", "Sanji", "Zoro" };

        letterStrings[3] = "Franky";

        for(String z : letterStrings)
        {
            System.out.println(z);
        }
    }
}
