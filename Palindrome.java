
/**
 * Implement a function to check if an input is a palindrome. 
 *
 * @author Lalla Sankara
 * @version 10/29/2019
 */
import java.util.Stack;
import java.util.Scanner;
public class Palindrome.java;
{
    public static void main (String [] args)
    {
     //Write what you want user to type into scanner   
     System.out.print("Enter String");
     
     //Implepment scanner
     Scanner in = new Scanner(System.in);
     String inputString = in.nextLine();
     
     //create new stack 
     Stack stack = new Stack(); 
    
     //checks the string and push all characters of string to stack
     for (int i=0;i<inputString.length();  i++) {
         stack.push(inputString.charAt(i));
        }
        
     //declaring the reverse input string
     String reverseString = "";
     
     //the resverse input string the checks palindrome backwards 
      while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }
    }
    public static boolean palindrome(String inputString, String reverseString)
     {
         //boolean method that sees if inputString is equal to reverseString
         // and is a paldindrome
         //returns back true or false if it is or it is not a palindrome. 
         
         if (inputString.equals(reverseString))
         {
             return true;
            }
            else
            return false;
         
     }
     
}
