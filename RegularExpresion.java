package classProblemByAmolMateSir.Day20PracticeProblem;


import java.util.regex.Pattern;

public class RegularExpresion {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        System.out.println("welcome to user registration");
//firstName validation
        boolean firstName = Pattern.matches("[A-Za-z]{0,8}", "Mayur");
        System.out.println(firstName);

//lastName validation
        boolean lastName = Pattern.matches("[A-Za-z]{0,8}", "Polojwar");
        System.out.println(lastName);


//Email-ID validation
        boolean emailID = Pattern.matches("^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$","abc.xyz@bl.co.in");
        System.out.println(emailID);

//mobile number validation
        boolean mobileNumber = Pattern.matches("^[+][91]{2}(\\s)[0-9]+","+91 7807811344");
        System.out.println(mobileNumber);

//password validation
        boolean password = Pattern.matches("^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+?$","Pasword@112");
        System.out.println(password);


       /* abc@yahoo.com,
 abc-100@yahoo.com,
 abc.100@yahoo.com
 abc111@abc.com,
 abc-100@abc.net,
 abc.100@abc.com.au
 abc@1.com,
 abc@gmail.com.com
abc+100@gmail.com*/
    }
}