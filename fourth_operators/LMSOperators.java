package fourth_operators;
public class LMSOperators {
    public static void main(String[] args) {

        // variables
        int studentID = 101;
        String studentName = "Madhu";
        byte age = 20;
        byte quizScore = 70;
        byte assignmentScore = 80;
        byte examScore = 90;
        double attendance = 80;

        // calculation -->Arthimetic Operators
        double totalScore = quizScore + assignmentScore + examScore;
        double averageSCore = totalScore/3;

        // Determine student passed --> Relational Operator or comparsion (75 or above)
        boolean isStudentpassed = averageSCore >= 75;

        // Update Attendance --> Inrement Operator
        attendance++;

        // Evaluate student qualified --> Logical Operator
        // requires high attendance (80 and above) and a passing grade
        boolean studentqualifiedAward = attendance>=80 && isStudentpassed;

        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student age: "+ age);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageSCore);
        System.out.println("Updated Attendance: "+attendance);

        System.out.println("Student passed: "+isStudentpassed);
        System.out.println("Student Awarded: "+studentqualifiedAward);

    }

}
