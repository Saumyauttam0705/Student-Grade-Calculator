import java.util.Scanner;
public class studentGradeCalc {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("ENTER TOTAL NUMBER OF SUBJECTS TO CALCULATE THEIR MARKS:");
      int n = sc.nextInt();

      if(n <= 0){
        System.out.println("ENTER VALID NUMBER OF SUBJECTS:");
      }
      int totalMarks = 0;
      int marksPerSubject = 100;

      for(int i = 1; i <= n; i++){
        System.out.println("ENTER MARKS OBTAINED IN SUBJECT " + i + " OUT OF 100:");
       int marks = sc.nextInt();

       if(marks < 0 || marks > 100){
        System.out.println("MARKS SHOULD BE BETWEEN 0 TO 100...PLEASE ENTER CORRECT MARKS!! ");
        i--;
        }
        else{
            totalMarks += marks;
        }
      }

      double average = (double) totalMarks / (n * marksPerSubject) * 100;
      System.out.println("TOTAL MARKS OBTAINED ARE :" + totalMarks);
      System.out.println("AVERAGE PERCENTAGE IS: " + average);

      String grade;

      if(average >= 90){
        grade = "A+";
      }
      else if(average >= 80){
        grade = "A";
      }
      else if(average >= 70){
        grade = "B";
      }
      else if(average >= 60){
        grade = "C";
      }
      else if(average >= 50){
        grade = "D";
      }

      else{
        grade = "F";
      }

      System.out.println("GRADE OBTAINED IS: " + grade);
    }
}
