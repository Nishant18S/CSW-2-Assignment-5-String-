import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String a = obj.nextLine();
        System.out.println("Enter 2nd String:");
        String b = obj.nextLine();
        String c = a.toUpperCase();
        String d = a.toLowerCase();
        System.out.println(a + " in Lower Case: " + d);
        System.out.println(a + " in Upper Case: " + c);
        String e = b.toUpperCase();
        String f = b.toLowerCase();
        System.out.println(b + " in Lower Case: " + f);
        System.out.println(b + " in Upper Case: " + e);

        // Comparing strings
        if (c.equals(d)) {
            System.out.println("Both the Strings are Equal.");
        } else {
            System.out.println("The Strings are Not Equal.");
        }

        if (e.equals(f)) {
            System.out.println("Both the Strings are Equal .");
        } else {
            System.out.println("The Strings are Not Equal after case conversion.");
        }

        obj.close();
    }
}
