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