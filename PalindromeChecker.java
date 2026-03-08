import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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
        String word = sc.nextLine();
        String rev = "";
        for(int i = word.length()-1; i>=0; i--){
        rev += word.charAt(i);
    }
        if(word.equals(rev)){
        System.out.println("Palindrome");}
        else{
        System.out.println("Not Palindrome");
        } 
        uc3_stringPalindrome(); //calling the method for UC3
        uc4_arrayPalindrome(); //calling the method for UC4
        uc5_stackPalindrome(); //calling the method for UC5
        uc6_stackQueuePalindrome(); //calling the method for UC6
    }
        // UC3

    public static void uc3_stringPalindrome() {
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

    // UC4
    public static void uc4_arrayPalindrome() {
        String s = "level";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
    // UC5
    public static void uc5_stackPalindrome() {
        Stack<Character> stack = new Stack<>();
        String s = "madam";
        for(char c : s.toCharArray())
            stack.push(c);
        String reversed = "";
        while(!stack.isEmpty())
            reversed += stack.pop();
        if(s.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    // UC6

    public static void uc6_stackQueuePalindrome() {
        String s = "radar";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for(char c : s.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!stack.isEmpty()) {
            if(stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}