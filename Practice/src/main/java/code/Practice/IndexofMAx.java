package code.Practice;

public class IndexofMAx {
public static int Index(int[] a){
	int max=0,ind=0,index = 0;
	for (int b:a) {
		if(max<b) {
		max=b;
		index=ind;
	}
		ind++;
	}
	
	return index;
	
}
public static void main(String[] args) {
	int a[]= {3,5,6,7,25,9,13};
	System.out.println(Index(a));
}
}
