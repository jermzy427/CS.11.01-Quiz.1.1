import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jeremy Chan
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age;
    String firstName;
    String favFood;

    System.out.println("Please enter your age:");
    age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Please enter your first name:");
    firstName = scanner.nextLine();

    System.out.println("Please enter your favorite food:");
    favFood = scanner.nextLine();

    System.out.println("First Name: "+ firstName+"\n\nAge: "+ age + "\n\nFavorite Food: "+favFood);



    }

}
