public class Q2 {
    public static void main(String[] args) {
        // Demonstrate immutability of String
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        String modifiedString = originalString.concat(" World"); // Creates a new String
        System.out.println("Modified String: " + modifiedString);
        System.out.println("Original String after modification: " + originalString); // Original String remains unchanged

        // Demonstrate usage of CharSequence methods
        CharSequence charSequence = "Hello World";

        // charAt
        System.out.println("\nUsing charAt method:");
        for (int i = 0; i < charSequence.length(); i++) {
            System.out.print(charSequence.charAt(i) + " ");
        }

        // subSequence
        System.out.println("\n\nUsing subSequence method:");
        CharSequence subSequence = charSequence.subSequence(6, 11);
        System.out.println("Subsequence: " + subSequence);

        // length
        System.out.println("\nLength of CharSequence: " + charSequence.length());

        // toString
        System.out.println("\nUsing toString method:");
        String charSequenceString = charSequence.toString();
        System.out.println("CharSequence as String: " + charSequenceString);

        // Immutable behavior of String
        System.out.println("\nDemonstrating immutability of String:");
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));
    }
}
