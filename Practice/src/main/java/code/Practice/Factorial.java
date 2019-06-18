package code.Practice;

public class Factorial {
public static int fact(int n) {
	
	return(n*fact(n-1));
}
public static void main(String[] args) {
	int num=4;
	int fac=fact(num);
	System.out.println(fac);
}
}
