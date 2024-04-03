import java.util.Scanner;

public class Q10 {
    static String Lower(String st) {
        return st.toLowerCase();
    }

    static String Upper(String st) {
        return st.toUpperCase();
    }

    static int searchChar(String st) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the character to search:");
        char c = obj.next().charAt(0);
        int firstIndex = st.indexOf(c);
        System.out.println("First occurrence of char " + c + " is found at index : " + firstIndex);
        return firstIndex;
    }

    static char index(String st) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Index:");
        int i = obj.nextInt();
        char result = st.charAt(i);
        System.out.println("The Character found: " + result);
        return result;
    }

    static String concatenate(String st) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a new String to Concatenate:");
        // Consume the newline character after taking input
        String ne = obj.nextLine();
        st = st.concat(ne);
        return st;
    }

    static void display(String st) {
        System.out.println("String: " + st);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = obj.nextLine();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lower Case");
            System.out.println("2. Upper Case");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for character at index");
            System.out.println("5. Concatenate");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    str = Lower(str);
                    break;
                case 2:
                    str = Upper(str);
                    break;
                case 3:
                    searchChar(str);
                    break;
                case 4:
                    index(str);
                    break;
                case 5:
                    str = concatenate(str);
                    break;
                case 6:
                    display(str);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }
    }
}
