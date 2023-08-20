/** Q8. Write a Java program that prompts the user to enter a number between 1 and 7 (inclusive).
The program should then use a switch case statement to determine and display the corresponding day of the week based on the input number.
Ensure that the program handles both valid input (1 to 7) and invalid input (numbers outside the range). Provide appropriate messages for both cases.**/


import java.util.Scanner;
public class question8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no between 1 to 7: ");
        int n = sc.nextInt();

        String day = "";

        switch(n){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                    day = "Invalid Input";
                    System.out.println("Invalid Input, Kindly enter no between 1 to 7.");
        }

        System.out.println("The corresponding day of that week is: " + day);

    }



}
