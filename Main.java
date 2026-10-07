import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("====================================");
        System.out.println("           MARKMETRICS");
        System.out.println("     Student Performance Analyzer");
        System.out.println("====================================");

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();
        
        int[] marks = new  int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {

         System.out.print("Enter mark for subject " + (i + 1) + ": ");
          int mark = input.nextInt();

        while (mark < 0 || mark > 100) {
        System.out.println("Invalid mark! Please enter a mark between 0 and 100.");
        System.out.print("Enter mark for subject " + (i + 1) + ": ");
        mark = input.nextInt();
     }

         marks[i] = mark;
     }
        int total = 0;
        for (int mark : marks){
            total = total + mark;
        }

        System.out.println("Total Marks: " + total);
        double average = (double) total / numberOfSubjects;
        System.out.println("Average Marks: " + average);

        int highest = marks[0];
        for (int mark : marks){
         if (mark > highest){
            highest= mark;
            }
        }
        System.out.println("Highest Mark: " + highest);
        
        int lowest = marks[0];
        for (int mark : marks){
          if (mark < lowest) {
            lowest = mark; 
          }
        }
         System.out.println("Lowest Mark: " +lowest);

         System.out.println();
         System.out.println("====================================");
         System.out.println("             RESULTS"           );
         System.out.println("====================================");
         
         System.out.println("Total Marks   : " + total);
         System.out.println("Average Marks : " + average);
         System.out.println("Highest Mark  : " + highest);
         System.out.println("Lowest Mark   : " + lowest);

        
         System.out.println("====================================");
         System.out.println("       Analysis Completed!");
         System.out.println("====================================");
    }
    }
   