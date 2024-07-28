import java.util.Scanner;


public class InputGrades {
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       Student[] students = new Student[10];
       int numCourses = 5;
       char[] validGrades = {'A', 'B', 'C', 'D', 'F'};


       // Input data for each student
       for (int i = 0; i < students.length; i++) {
           students[i] = new Student();


           System.out.println("Enter the student ID for student #" + (i + 1) + ":");
           int studID = keyboard.nextInt();
           students[i].setID(studID);
           keyboard.nextLine(); // Consume newline left by nextInt()


           // Input data for each course for the student
           for (int j = 0; j < numCourses; j++) {
               System.out.println("Enter course ID for course #" + (j + 1) + " for student #" + (i + 1) + ":");
               String courseID = keyboard.nextLine();


               System.out.println("Enter credit hours for course #" + (j + 1) + " for student #" + (i + 1) + ":");
               int credits = keyboard.nextInt();
               keyboard.nextLine(); // Consume newline left by nextInt()


               char grade;
               boolean validGrade;
               do {
                   validGrade = false;
                   System.out.println("Enter grade for course #" + (j + 1) + " for student #" + (i + 1) + ":");
                   grade = keyboard.nextLine().charAt(0);
                   for (char valid : validGrades) {
                       if (grade == valid) {
                           validGrade = true;
                           break;
                       }
                   }
                   if (!validGrade) {
                       System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
                   }
               } while (!validGrade);


               CollegeCourse course = new CollegeCourse();
               course.setID(courseID);
               course.setCredits(credits);
               course.setGrade(grade);


               students[i].setCourse(course, j);
           }
       }


       // Display student grades
       System.out.println("\nStudent Grades:");
       for (int i = 0; i < students.length; i++) {
           System.out.println("Student ID #" + students[i].getID());
           for (int j = 0; j < numCourses; j++) {
               CollegeCourse course = students[i].getCourse(j);
               System.out.println("Course ID: " + course.getID() + " Credits: " + course.getCredits() + " Grade: " + course.getGrade());
           }
       }


       keyboard.close();
   }
}
