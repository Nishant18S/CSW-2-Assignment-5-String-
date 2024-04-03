public class Q1 {
    public static void main(String[] args) {
        // Using string literals
        String str1 = "Hello";
        String str2 = "Hello";

        // Using new keyword
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // Demonstrate memory usage
        System.out.println("Memory Usage:");
        System.out.println("str1 and str2 memory addresses: " + System.identityHashCode(str1) + " " + System.identityHashCode(str2));
        System.out.println("str3 and str4 memory addresses: " + System.identityHashCode(str3) + " " + System.identityHashCode(str4));

        // Demonstrate string comparison behavior
        System.out.println("\nString Comparison:");
        System.out.println("str1 == str2: " + (str1 == str2)); // should be true, as they are the same literal
        System.out.println("str1 == str3: " + (str1 == str3)); // should be false, as one is a literal and one is a new object
        System.out.println("str3 == str4: " + (str3 == str4)); // should be false, as both are new objects with different references

        // Using equals method for content comparison
        System.out.println("\nContent Comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // should be true, as content is the same
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // should be true, as content is the same
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // should be true, as content is the same
    }
}
