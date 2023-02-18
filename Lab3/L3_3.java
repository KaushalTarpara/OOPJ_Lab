import java.util.Scanner;

public class L3_3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String input = sc.nextLine();

    // Initializing a string using a string literal
    String str1 = "Hello DDU";
    System.out.println("str1: " + str1);

    // Initializing a string using a character array
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str2 = new String(charArray);
    System.out.println("str2: " + str2);

    // Initializing a string using another string object
    String str3 = new String(str1);
    System.out.println("str3: " + str3);

    // Length of the string
    System.out.println("Length of the string: " + input.length());

    // Concatenating two strings
    System.out.println("concat() method " + str2.concat(str3));

    // Comparing two strings
    System.out.println("str1 and str3 are isequal(): " +  str1.equals(str3));

    // Comparing two strings ignoring case
    System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3));

    // Extracting a substring
     System.out.println("substring() method: " + input.substring(3, 7));

    // Replacing a character in a string
    System.out.println("replace() method: " + input.replace('o', '_'));

    // Converting a string to uppercase
    System.out.println("toUpperCase() method: " +  input.toUpperCase());

    // Converting a string to lowercase
    System.out.println("toLowerCase() method :" + input.toLowerCase());

    // Trimming whitespaces from a string
    System.out.println("Trim Method: " + ("   Hello World   ").trim());
  }
}
