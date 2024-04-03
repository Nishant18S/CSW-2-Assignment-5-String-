import java.util.Scanner;

public class Q4 {
	 private static void addSubstring(StringBuilder text, Scanner obj) {
	        System.out.println("Enter the substring to add:");
	        String substring = obj.nextLine();

	        System.out.println("Enter the position to add the substring:");
	        int position = obj.nextInt();

	        text.insert(position, substring);
	        display(text);
	    }

	    private static void removeRange(StringBuilder text, Scanner obj) {
	        System.out.println("Enter the starting index of the range to remove:");
	        int startIndex = obj.nextInt();
	        obj.nextLine(); // Consume newline
	        System.out.println("Enter the ending index of the range to remove:");
	        int endIndex = obj.nextInt();

	        text.delete(startIndex, endIndex);
	        display(text);
	    }

	    private static void modifyCharacter(StringBuilder text, Scanner obj) {
	        System.out.println("Enter the index of the character to modify:");
	        int index = obj.nextInt();
	        obj.nextLine(); // Consume newline
	        System.out.println("Enter the new character:");
	        char newChar = obj.next().charAt(0);

	        text.setCharAt(index, newChar);
	        display(text);
	    }

	    private static void concatenate(StringBuilder text, Scanner obj) {
	        System.out.println("Enter the string to concatenate:");
	        String concatString = obj.nextLine();

	        text.append(concatString);
	        display(text);
	    }

	    private static void display(StringBuilder text) {
	        System.out.println("Current String: " + text);
	    }
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();

        Scanner obj = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Add a substring at a specified position.");
            System.out.println("b. Remove a range of characters from the string.");
            System.out.println("c. Modify a character at a specified index.");
            System.out.println("d. Concatenate another string at the end.");
            System.out.println("e. Display the current string.");
            System.out.println("f. Exit");
            System.out.println("Enter your choice:");

            char choice = obj.next().charAt(0);
            obj.nextLine(); // Consume newline

            switch (choice) {
                case 'a':
                    addSubstring(text, obj);
                    break;
                case 'b':
                    removeRange(text, obj);
                    break;
                case 'c':
                    modifyCharacter(text, obj);
                    break;
                case 'd':
                    concatenate(text, obj);
                    break;
                case 'e':
                    display(text);
                    break;
                case 'f':
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

   
}
