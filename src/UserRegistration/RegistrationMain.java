package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationMain {

    public Boolean CheckFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String firstName = sc.nextLine();

        Boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(firstName).matches();
        if(result) {
            System.out.println("Valid First Name");
        }
        else {
            System.out.println("Invalid First Name");
        }
        return result;
    }

    public Boolean CheckLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last Name :");
        String lastName = sc.nextLine();

        Boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(lastName).matches();
        if(result) {
            System.out.println("Valid Last Name");
        }
        else {
            System.out.println("Invalid Last Name");
        }
        return result;
    }

    public Boolean Email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email :");
        String email = sc.nextLine();

        Boolean result  = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(email).matches();
        if(result) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
        return result;
    }

    public Boolean PhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Phone Number :");
        String phoneNumber = sc.nextLine();

        Boolean result  = Pattern.compile("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$").matcher(phoneNumber).matches();
        if(result) {
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number");
        }
        return result;
    }

    public Boolean Password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password :");
        String password = sc.nextLine();

        Boolean result  = Pattern.compile("^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$").matcher(password).matches();
        if(result) {
            System.out.println("Valid Password ");
        }
        else {
            System.out.println("Invalid Password");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");

        RegistrationMain registrationMain = new RegistrationMain();

        registrationMain.CheckFirstName();
        registrationMain.CheckLastName();
        registrationMain.Email();
        registrationMain.PhoneNumber();
        registrationMain.Password();

    }
}
