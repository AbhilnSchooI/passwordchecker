import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);
    }

    //this method loops until a valid int is received, returns int value.
    public static int getInt(Scanner scan, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    //this method loops until a valid ranged int is received, returns int value
    public static int getRangedInt(Scanner scan, int min, int max, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x <= max && x >= min) {
                    done = true;
                } else {
                    System.out.println("Invalid range. Please try again");
                }
            }
            scan.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    //this method loops until a double is entered.
    public static double getDouble(Scanner scan, String prompt) {
        boolean done = false;
        double x = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                done = true;
            } else {
                System.out.println("You have entered an invalid Double. Please try again");
            }
            scan.nextLine();
        } while (!done);

        return x;
    }

    public static double getRangedDouble(Scanner scan, double min, double max, String prompt) {
        boolean done = false;
        double x = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                if (x <= max && x >= min) {
                    done = true;
                } else {
                    System.out.println("Invalid range. Please try again");
                }
            }
            scan.nextLine(); //clear buffer
        } while (!done);
        return x;
    }


    //this returns a boolean if you want to continue which is true and false if not.
    public static boolean YNConfirm(Scanner scan, String prompt) {
        boolean done = false;
        boolean con = false;
        String check;
        System.out.println(prompt);

        do {
            check = scan.nextLine();
            if (check.equalsIgnoreCase("Y")) {
                con = true;
                done = true;
            } else if (check.equalsIgnoreCase("N")) {
                con = false;
                done = true;
            } else {
                System.out.println("You have entered an invalid input. Please try again");
            }
        } while (!done);
        return con;
    }


    public static String getRegExString(Scanner scan, String prompt, String regEx) {
        String input;
        boolean valid = false;


        do {
            System.out.println(prompt);
            input = scan.nextLine();
            if (input.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Invalid input.");
            }
        } while (!valid);

        return input;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
            }
            scan.nextLine();
        } while (!done);
        return x;
    }

    public static String getNonZeroLenString(Scanner scan, String prompt){
        boolean done = false;
        String str = "";
        System.out.println(prompt);

        do {
            if(scan.hasNextLine()){
                str = scan.nextLine();
                if(str.length() > 0){
                    done = true;
                }else{
                    System.out.println("Invalid input");
                }
            }
        } while (!done);
        return str;
    }

    public static void prettyHeader(String msg) {
        String x = " ";
        int y = msg.length();
        int z = (60-y)/2 -2 ;
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 60; i++) {
            if (z == i) {
                System.out.print(msg);
            } else if (i < 3 || i > 56) {
                System.out.print("*");
            } else if (i < 56 - (msg.length()-2)) {
                System.out.print(x);
            }
        }
        System.out.println();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
    }

}
