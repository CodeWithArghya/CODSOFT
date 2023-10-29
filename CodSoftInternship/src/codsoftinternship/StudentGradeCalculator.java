import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int totalMarks = 0;
        int totalSubjects = 0;

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();

            
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                i--; 
            } else {
                totalMarks += marks;
                totalSubjects++;
            }
        }

        
        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;

       
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        
        scanner.close();
    }
}

