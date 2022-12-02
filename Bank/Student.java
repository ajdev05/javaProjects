import java.util.Scanner;

public class Student {
    // declare instance data
    // ---------------------------------------------
    private String name;
    private double test1;
    private double test2;
    // constructor
    // ---------------------------------------------
    public Student(String studentName) {
        name = studentName;
        // add body of constructor
    }


    // inputGrades: prompt for and read in student's grades for test1 and test2.
    // Use name in prompts, e.g., "Enter's Joe's score for test1".

    public void inputGrades() {
        // add body of inputGrades
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter's " + name + "'s score for test1 : ");
        test1 = scan.nextDouble();
        System.out.print("Enter's " + name + "'s score for test2 : ");
        test2 = scan.nextDouble();
    }


    public double getAverage() {

        return (test1 + test2) / 2;
    }

    public String getName() {

        return name;
    }
    public String toString() {
        return "name:\t" + name + "\tTest 1:\t" + test1 + "\tTest 2:\t" + test2;
    }
}