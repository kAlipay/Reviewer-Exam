import java.util.Scanner;

class programsimulationpart2{

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // int num1 = 13, num2 = 5, equiv = 0;

        // equiv = num1 % num2;
        // System.out.println("13 % 5 = " + equiv);

        // int num1 = 1000;

        // if (num1 != 1000 || num1 < 2000 || num1 > 800)
        // {
        //     System.out.println("Yes correct");
        // }else
        // {
        
        // }

        int grade = 0;

        System.out.println("What is the grade:");
        grade = myObj.nextInt();

        if(grade == 100)
        {
         System.out.println("Excellent!");   
        }
        else if(grade >= 90 && grade <= 99)
        {
         System.out.println("Very Good!");
        }
        else if(grade >=80 && grade <= 89)
        {
            System.out.println("Good");
        }
        else if(grade >=75 && grade <= 79)
        {
            System.out.println("Fair");
        }
        else
        {
            System.out.println("Failed. Enroll this subject again.");
        }
    }
    
}
