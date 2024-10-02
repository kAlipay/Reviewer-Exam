import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

 

    

    System.out.println("Please enter your first number");
    int firstnumber = myObj.nextInt();
    System.out.println("Please enter your last number");
    int lastnumber = myObj.nextInt();

    System.out.println("Please enter your number");
    int age = myObj.nextInt();

    for (int i = firstnumber; i < lastnumber; i++) {
        if (i == age) {
          continue;
        }
        System.out.println(i);
      }  
  }
}