package code.Practice;

public class Missnum {
	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5,7,8,9};
		//int max=9;
		System.out.println(miss(a));
	}
	public static int miss(int a[]) {
		int max=0;
		for(int j=0;j<a.length;j++) {
			if (max<a[j]) {
				max=a[j];
			}
			
		}System.out.println(max);
		int currsum=0;
		int total=(max*(max+1))/2;
		for(int i=0;i<a.length;i++) {
			currsum += a[i];
		}
		
		
		return total-currsum;
		
	}
}
