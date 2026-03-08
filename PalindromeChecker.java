import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // UC1

        System.out.println("==== Palindrome Checker App ====");
        System.out.println("Welcome User");
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        // UC2
        String word = "madam";
        String rev = "";
        for(int i = word.length()-1; i>=0; i--){
        rev += word.charAt(i);
    }
        if(word.equals(rev)){
        System.out.println("Palindrome");}
        else{
        System.out.println("Not Palindrome");
        } 
        stringPalindrome(); //calling the method for UC3
    }
        // UC3

    public static void stringPalindrome() {
            String s = "racecar";
            int i = 0;
            int j = s.length() - 1;
            boolean isPalindrome = true;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            i++;
            j--;
            }
            System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        
    }
}