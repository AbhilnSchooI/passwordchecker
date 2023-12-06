import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;
        boolean specialChar = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean num = false;
        boolean keepgo = false;

        String password = "";
        String current = "";
        int count = 0;

        do {

            System.out.println("Please enter your password:");
            password = scan.nextLine();

            //checks length
            if (password.length() < 12) {
                System.out.println("Your password should be atleast 12 characters long");
            } else {
                count++;
            }

            //checks for uppercase
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i + 1);
                if (current.matches("[A-Z]")) {
                    upperCase = true;
                }
            }

            if (!upperCase) {
                System.out.println("Your password should have atleast oneupper case character");
            } else {
                count++;
            }

            //checks for lowercase
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i + 1);
                if (current.matches("[a-z]")) {
                    lowerCase = true;
                }
            }

            if (!lowerCase) {
                System.out.println("Your password should have atleast one lowercase character");
            } else {
                count++;
            }

            //checks for number
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i + 1);
                if (current.matches("[0-9]")) {
                    num = true;
                }
            }

            if (!num) {
                System.out.println("Your password should have atleast one number");
            } else {
                count++;
            }

            //checks special char

            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i + 1);
                if (current.matches("[!#$%]")) {
                    specialChar = true;
                }
            }

            if (!specialChar) {
                System.out.println("Your password should have atleast one special character [!@#$%^&*()]");
            } else {
                count++;
            }

            System.out.println("Your password passed " + count + "/5 tests.");

            if(count <= 2){
                System.out.println("Your password's strength is weak");
            } else if(count == 3) {
                System.out.println("Your password's strength is medium");
            }else if(count >= 4){
                System.out.println("Your password's strength is strong");
            }

            keepgo = InputHelper.YNConfirm(scan,"Would you like to check for another password? [Y/N]");
            if(keepgo == false){
                done = true;
            }

        }while (!done) ;
    }
}