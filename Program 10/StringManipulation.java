import java.util.Scanner;
class StringManipulation
{
public static void main(String[] args) 
{      // a. Create new strings using new
        String str1 = new String("Hello");
        String str2 = new String("World");

       // b. Getting string length
        int len1 = str1.length();
        System.out.println("Length of str1: " + len1);

        // c. String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated string: " + str3);

        // d. Character extraction
        char ch = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + ch);

        // e. String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2? " + isEqual);

        int compareResult = str1.compareTo(str2);
        System.out.println("str1 compared to str2: " + compareResult);

        // f. Searching substrings
        boolean contains = str3.contains("World");
        int index = str3.indexOf("lo");
        System.out.println("str3 contains 'World'? " + contains);
        System.out.println("Index of 'lo' in str3: " + index);

        // g. Modifying a string
        String modifiedStr = str3.replace("World", "Java");
        System.out.println("Modified string: " + modifiedStr);

        // h. Data conversion using valueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String value of integer 123: " + numStr);
    }
}


