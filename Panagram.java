class Pangram { 
    public static void main(String[] args) { 
        String str = "The quick brown fox jumps over the lazy dog"; 
        str = str.toLowerCase(); 
        boolean isPangram = true; 
        for (char ch = 'a'; ch <= 'z'; ch++) { 
            if (!str.contains(String.valueOf(ch))) { 
                isPangram = false; 
                break; 
            }
 } 
        if (isPangram) 
            System.out.println("The string is a Pangram"); 
        else 
            System.out.println("The string is not a Pangram"); 
    } 
} 


Output: 
The string is a Pangram
