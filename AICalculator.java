import java.util.Random;
import java.util.Scanner;
public class AICalculator {
   public static void main(String[] args) {
    int choice = 0;
    int i = 3;
    int num1 = 0;
    int num2 = 0;
    getMenuOption(choice, i, num1, num2);
}

public static int getMenuOption(int choice, int i, int num1, int num2) {
    Scanner input = new Scanner(System.in);
    boolean cont = true;
    while (cont = true) {
        System.out.println("Menu:");
        System.out.println("1. Add two numbers ");
        System.out.println("2. Subtract two numbers ");
        System.out.println("3. Multiply tow Numbers ");
        System.out.println("4. Divide two numbers ");
        System.out.println("5. Generate a Random Number");
        System.out.println("6. Exit the Program");
        System.out.println("");
        System.out.print("What is your choice? : ");
        choice = input.nextInt();
        if (choice == 1) {
            add(num1, num2);
        } // end of if statement
        if (choice == 2) {
            subtract(num1, num2);
        } // end of if statement
        if (choice == 3) {
            multiply(num1, num2);
        } // end of if statement
        if (choice == 4) {
            divide(num1, num2);
        } // end of if statement
        if (choice == 5) {
            random(num1, num2);
        } // end of if statement
        if (choice == 6) {
            System.exit(0);
        } // end of if statement
        if (choice <= 0 || choice >= 7) {
            System.out.println("Incorrect choice please try again!");
            i--;
            int tries = i;
            System.out.println(tries + " tries left before restart");
            if (tries <= 0) {
                System.out.println("Sorry, you must restart this program.");
                System.exit(0);
            } // end of of tries statement

        } // end of if choice statement
        if (choice == 1 || choice <= 6) {
            i = 3;
        } // end of if choice statement
    }
    return 0;
}

public static double getOperand(String prompt) { // Used for giving inputs
                                                    // and returns value to
                                                    // method/
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);

    int value = input.nextInt();

    return value;
}

public static int getOperand1(String prompt, int size) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many values in array?");
    size = input.nextInt();
    int arraySize[] = new int[size];
    System.out.println("You have made " + size + " values with arrays.");
    return size;
}

public static double add(double operand1, double operand2) { // adds the two
                                                                // inputs
                                                                // given to
                                                                // program
    Scanner input = new Scanner(System.in);
    double answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter second number: ");
    
    answer = operand1 + operand2;
    
    System.out.println("Your answer is: " + answer);

    return 0;
}

public static double[] subtract(double operand1, double operand2) { // subtracts
                                                                    // the
                                                                    // two
                                                                    // inputs
                                                                    // given
                                                                    // to
                                                                    // program
    Scanner input = new Scanner(System.in);
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 - operand2);
    System.out.println("Your answer is: " + answer);
    return null;
}

public static double[] multiply(double operand1, double operand2) { // multiplys
                                                                    // the
                                                                    // two
                                                                    // inputs
                                                                    // given
                                                                    // to
                                                                    // program
    Scanner input = new Scanner(System.in);
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 * operand2);
    System.out.println("Your answer is: " + answer);
    return null;
}

public static double divide(double operand1, double operand2) { // Gets a
                                                                // dividend
                                                                // from two
                                                                // sets of
                                                                // numbers
    Scanner input = new Scanner(System.in);
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 / operand2);
    if (operand2 <= 0) {
        return (Double) null;
    } else
        System.out.println("Your answer is: " + answer);
    return Double.NaN;
}

public static double[] random(double lowerLimit, double upperLimit) { // Gets
                                                                        // a
                                                                        // random
                                                                        // Num
    Scanner input = new Scanner(System.in);
    double upperLimit1 = getOperand("Please enter the Maximum Number : ");
    double lowerLimit1 = getOperand("Please enter the Minimum Number : ");
    Random rand = new Random();
    double ranNum = rand.nextInt() + lowerLimit1;
    System.out.println("Your random number is: " + ranNum);
    return null;
}
    
    }
