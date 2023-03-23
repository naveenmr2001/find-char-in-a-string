import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to Search: ");

        String stringToSearch = scanner.nextLine();

        System.out.println("Enter the Char to Search: ");

        char charToSearch = scanner.next().charAt(0);

        boolean flagToSearch = true;

        for(int iterator = 0 ; iterator<stringToSearch.length() ; iterator++ ){

            if(stringToSearch.charAt(iterator) == charToSearch){

                System.out.println("Yes the char is present in the string");

                flagToSearch = false;

                break;

            }

        }

        if(flagToSearch){
            System.out.println("No the char is not present in the string");
        }

    }
}