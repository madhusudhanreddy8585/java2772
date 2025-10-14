package second_variables;
public class LMSVariables {
    public static void main(String[] args) {
        // student -> ID, Name, Email, password, Gender, Mobile Numder etc
        // define datatypes
        short studentID = 101;
        String studentName = "Madhu";
        String studentEmail = "madhusudhanreddy8585@gmail.com";
        String studentPassword = "chinna@123";
        char studentGender_1 = 'M';
        boolean isstudentMale = true;
        long studentMobileNumber = 628191;

        // string concatenation means joining multiple strings
        System.out.println("studentID:" +studentID);
        System.out.println("student Name:" +studentName +studentEmail);
        System.out.println("student Gender:" +studentGender_1);
        System.out.println("student Gender Male:" +isstudentMale);
        System.out.println("stdent Mobile Number:" +studentMobileNumber);
    }
}
