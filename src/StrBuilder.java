/*
String builder
 */

public class StrBuilder {
    public static void main(String[] args) {
//        System.out.println("Tell me about yourself: ");
//        String name = new String("Alexoria, ");
//        String old = "not so much old, ";
//        String java = new String("in love with Java.");
//        String all = name+old+java;
//        System.out.println(all);

        /*
        sout wiil be:
        Tell me about yourself:
        Alexoria, not so much old, in love with Java.

        But, everytime we add string "name" to string "old" we create new string.
        It's all because type String is unchanged, so everytime we doing concatenation
        We create absolutely new String, because we cannot change exist String,
        So that's bad for our program, because if we create loop with concatenation String's -
        Our program will eat a lot of RAM, and will run really slowly.
         */

        StringBuilder sb = new StringBuilder(); // null
        System.out.println("Tell me about yourself: ");
        sb.append("Alexoria, ").append("not so much old, ").append("in love with Java.");
        System.out.println(sb); // toString because type is StringBuilder #UPDATE: It's not necessary anymore

        /*
        This time I created StringBuilder.
        When I created it - I put nothing in it, it means there will be null as default value.
        StringBuilder = new StringBuilder(); - StringBulder = null
        StringBuilder = new StringBuilder("Hi mommy"); - StringBulder = "Hi mommy"
        append  - it's same concatenation as "name + old + java"
        But this time we create StringBuilder type, not String, so we can add any strings.
        More of this, we can do it this much, as we want to do, and our program still good.
         */
    }
}
