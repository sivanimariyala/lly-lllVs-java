import java.util.Arrays; 
class Anagram { 
    public static void main(String[] args) { 
        String s1 = "CAT"; 
        String s2 = "ACT"; 
        char[] a1 = s1.toCharArray(); 
        char[] a2 = s2.toCharArray(); 
        Arrays.sort(a1); 
        Arrays.sort(a2); 
        if (Arrays.equals(a1, a2)) 
            System.out.println("Strings are Anagrams"); 
        else 
            System.out.println("Strings are not Anagrams"); 
    } 
} 
