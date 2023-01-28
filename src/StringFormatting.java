/*
String formatting
 */

public class StringFormatting {
    public static void main(String[] args) {
        System.out.println("New line string");
        System.out.print("This line string\n"); // \n added to show next string from new line
        System.out.printf("Numbers %10d\n", 1234567890); // Formatting string
        System.out.printf("Numbers %10d\n", 123456789);
        System.out.printf("Numbers %10d\n", 12345678);
        System.out.printf("Numbers %10d\n", 1234567);
        System.out.printf("Numbers %10d\n", 123456);
        System.out.printf("Numbers %10d\n", 12345);
        System.out.printf("Numbers %10d\n", 1234);
        System.out.printf("Numbers %10d\n", 123);
        System.out.printf("Numbers %10d\n", 12);
        System.out.printf("Numbers %10d\n", 1);
        System.out.printf("Numbers %10d\n", 1);
        System.out.printf("Numbers %10d\n", 12);
        System.out.printf("Numbers %10d\n", 123);
        System.out.printf("Numbers %10d\n", 1234);
        System.out.printf("Numbers %10d\n", 12345);
        System.out.printf("Numbers %10d\n", 123456);
        System.out.printf("Numbers %10d\n", 1234567);
        System.out.printf("Numbers %10d\n", 12345678);
        System.out.printf("Numbers %10d\n", 123456789);
        System.out.printf("Numbers %10d\n\n", 1234567890);

        System.out.println("OR\n");

        System.out.printf("Strings %-7s\n", "ABCDEFG");
        System.out.printf("Strings %-7s\n", "ABCDEF");
        System.out.printf("Strings %-7s\n", "ABCDE");
        System.out.printf("Strings %-7s\n", "ABCD");
        System.out.printf("Strings %-7s\n", "ABC");
        System.out.printf("Strings %-7s\n", "AB");
        System.out.printf("Strings %-7s\n", "A");

        /*
        To be honest, this thing is super useless.
         */
    }
}
