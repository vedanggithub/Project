package code.Practice;

public class Sorted {
public static void main(String[] args) {
	int a[]= {0,1,2,3,4,5,7,8,9};
	System.out.println(miss(a));
}

public static int miss(int[] a) {
	int missing = 0;
	for(int i=0;i<a.length;i++) {
		if (a[i]==i) {
			return a[i];
		}
		missing=i;
	}
	return missing;

	
}
}
