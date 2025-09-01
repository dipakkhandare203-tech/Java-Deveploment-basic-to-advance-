/* 
Write a program to calculate percentage of a given student in cbse board exam. 
his marks from  5 subject must be taken as input from the keyboard( Marks are out of 100)
*/
import java.util.Scanner;

public class PercentageCalculation{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter detail to calculate your marks");
        
        System.out.println("Enter your name :-");
        String name = scanner.nextLine();
        
        System.out.println("Enter How many subject you have?");
        int n = scanner.nextInt();
        scanner.nextLine(); // to consume new line
        
        String[] subjects = new String[n];
        int[] marks = new int[n]; 
        int total = 0;

        for (int i=0;i<n;i++){
            System.out.println("Enter Subject "+(i+1)+"name");
            subjects[i] = scanner.nextLine();

            System.out.println("Enter Marks for "+subjects[i]+":");
            marks[i] = scanner.nextInt();
            scanner.nextLine();

            total +=marks[i]; // total =total+marks[i];
            
        }
        float per = (total/(n*100.0f))*100;

        System.out.println("\n============Result============");

        System.out.println("Name :-"+name);

        System.out.println("Total Marks :-"+total+"/"+n);

        System.out.println("Percentage :-"+per+"%");

        System.out.println("Subject-Wise Marks :");

           for(int i = 0; i<n;i++){

           System.out.println(subjects[i]+":"+marks[i]);

           }

    
        scanner.close();
    }
}