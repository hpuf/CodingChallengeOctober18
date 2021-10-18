package main.java.com.revature.Java;
/**
 * The Atbash cipher is an encryption method in which each letter of a word is
 *  replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
 *
 * Create a function that takes a string and applies the Atbash cipher to it.
 *
 * Examples
 * atbash("apple") --> "zkkov"
 *
 * atbash("Hello world!") --> "Svool dliow!"
 *
 * atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
 *
 * Notes:
 * Capitalisation should be retained.
 * Non-alphabetic characters should not be altered.
 *
 * */
public class AtbashDriver {


    static String atbash(String original){
        if(original==null || original.trim().equals(""))
            return original;

        String reverseAlphaLower = "zyxwvutsrqponmlkjihgfedcba";
        String reverseAlphaUpper = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        char[] charArray = original.toCharArray();
        StringBuilder encrypted = new StringBuilder();

        for (char c : charArray){
            if(c >= 65 && c <= 90){
                encrypted.append(reverseAlphaUpper.charAt(c - 65));
            }else if(c >= 97 && c <= 122){
                encrypted.append(reverseAlphaLower.charAt(c - 97));
            }else{
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        System.out.println(atbash("apple"));
        System.out.println(atbash("Hello world!"));
        System.out.println(atbash("Christmas is the 25th of December"));
    }
}
