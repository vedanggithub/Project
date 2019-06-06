package Coding.Practice;

/*
 * class Fibonacci{ static int a=0,b=1,temp=0; static void fib(int count){
 * if(count>0){ temp = a + b; a =b; b = temp;
 * 
 * System.out.print(" "+temp);
 * 
 * fib(count-1); } //return count; } public static void main(String args[]){ int
 * count=10; System.out.print(a+" "+b); fib(count-2);//n-2 because 2 numbers are
 * already printed } }
 */
class Fibonacci 
{ 
    static int fib(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            b = a; 
            a = c; 
            System.out.print(" "+b);
        } 
      //  System.out.println(a+" "+b);
        return b; 
    } 
  
    public static void main (String args[]) 
    { 
        int n = 6; 

        fib(n); 
    } 
} 