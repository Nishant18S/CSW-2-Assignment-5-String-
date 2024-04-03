
import java.util.Scanner;

public class Q3 {
    private static void appendText(StringBuffer text) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter text to append:");
        String newText = obj.nextLine();
        text.append(newText);
        printCurrentState(text);
    }

    private static void insertText(StringBuffer text) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter text to insert:");
        String newText = obj.nextLine();
        System.out.println("Enter index to insert at:");
        int index = obj.nextInt();
        text.insert(index, newText);
        printCurrentState(text);
    }

    private static void deleteText(StringBuffer text) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter starting index of text to delete:");
        int startIndex = obj.nextInt();
        System.out.println("Enter ending index of text to delete:");
        int endIndex = obj.nextInt();
        text.delete(startIndex, endIndex);
        printCurrentState(text);
    }

    private static void reverseText(StringBuffer text)
    {
        text.reverse();
        printCurrentState(text);
    }

    private static void replaceText(StringBuffer text) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter starting index of text to replace:");
        int startIndex = obj.nextInt();
        System.out.println("Enter ending index of text to replace:");
        int endIndex = obj.nextInt();
        obj.nextLine(); // Consume newline character
        System.out.println("Enter replacement text:");
        String replacementText = obj.nextLine();
        text.replace(startIndex, endIndex, replacementText);
        printCurrentState(text);
    }

    private static void printCurrentState(StringBuffer text)
    {
        System.out.println("Current Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());
    }

    public static void main(String[] args) {
        StringBuffer text = new StringBuffer();

        Scanner obj = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    appendText(text);
                    break;
                case 2:
                    insertText(text);
                    break;
                case 3:
                    deleteText(text);
                    break;
                case 4:
                    reverseText(text);
                    break;
                case 5:
                    replaceText(text);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }
}

