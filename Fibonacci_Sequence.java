import java.io.*; 
import java.lang.*; 
import java.util.*; 
class EvenFibonacci 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("Enter the range value"); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int a = 0, b = 1, c; 
        int sum = 0; 
        while(a <= n) 
        { 
            if(a % 2 == 0) 
            { 
                sum = sum + a; 
            } 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        System.out.println("Sum of even Fibonacci terms: " + sum); 
    } 
}
