package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

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
    }
}
