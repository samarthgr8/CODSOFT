
import java.util.*;

public class task_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSub = sc.nextInt();

        int[] marks = new int[numSub];
        int totalMarks = 0;

        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks obtained in Subject " + (i + 1) + " out of 100 : ");
            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input! Please enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
            }

            totalMarks += marks[i];
        }

        // Calculate average
        double averagePercent = (double) totalMarks / numSub;

        String grade;
        if (averagePercent >= 90) {
            grade = "A+";
        } else if (averagePercent >= 80) {
            grade = "A";
        } else if (averagePercent >= 70) {
            grade = "B";
        } else if (averagePercent >= 60) {
            grade = "C";
        } else if (averagePercent >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Displaying
        System.out.println("\nResult Summary:");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSub * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercent);
        System.out.println("Grade: " + grade);
    }
}
