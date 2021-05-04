package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private final static String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private final static String PHONE_NUMBER_PATTERN = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
    private final static String PASSWORD_PATTERN = "^[A-Za-z0-9-]{8,}$";

    @FunctionalInterface
    public interface ValidateDetails {
        public boolean validateDetails(String detail);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first name :");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name :");
        String lastName = sc.nextLine();
        String pattern ="^[A-Z][A-Za-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m1 = p.matcher(firstName);
        Matcher m2 = p.matcher(lastName);
        if(m1.matches() && m2.matches())
        {
            System.out.println("The full name of the user is: "+firstName+" "+lastName);
        }
        else
        {
            if(firstName.length() <= 2)
            {
                System.out.println("The first name should have minimum 3 characters");
            }
            else if(lastName.length() <= 2)
            {
                System.out.println("The last name should have minimum 3 characters");
            }
            else
            {
                System.out.println("Enter a valid input");
            }
        }

        // Email Id Validation Using Lambda Expression
        System.out.println("Enter Your Email ID for User Registration :");
        String emailId = sc.nextLine();
        ValidateDetails emailIdObj = (emailIdPassed) -> {
            if (emailIdPassed.matches(EMAIL_PATTERN))
                return true;
            else
                return false;
        };
        if (emailIdObj.validateDetails(emailId))
            System.out.println("Entered email id is : " + emailId);
        else
            System.out.println("The pattern of Email Id is incorrect. Please try again!");

        // Phone Number Validation Using Lambda Expression
        System.out.println("Enter Your Phone Number for User Registration :");
        String phoneNo = sc.nextLine();
        ValidateDetails phoneNoObj = (phoneNoPassed) -> {
            if (phoneNoPassed.matches(PHONE_NUMBER_PATTERN))
                return true;
            else
                return false;
        };
        if (phoneNoObj.validateDetails(phoneNo))
            System.out.println("Your Phone Number provided is : " + phoneNo);
        else
            System.out.println("The pattern of Phone Number is incorrect. Please try again!");

        // Password Validation Using Lambda Expression
        System.out.println("Enter Your Password for User Registration :");
        String password = sc.nextLine();
        ValidateDetails passwordObj = (passwordPassed) -> {
            if (passwordPassed.matches(PASSWORD_PATTERN))
                return true;
            else
                return false;
        };
        if (passwordObj.validateDetails(password))
            System.out.println("Your Password is following the correct format required: " + password);
        else
            System.out.println("The pattern of Password is incorrect. Please try again!");

    }
}
