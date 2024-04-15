import java.util.Scanner;
public class practice003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    if(num < 0)
	    	System.out.println("음수");
	    else if(num == 0)
	    	System.out.println("  0  ");
	    else
	    	System.out.println("양수");
	 /*------------------------------------------------------*/ 
	    
	    for(int i=1;i<=100;i++) {
	    	if(i % 2 == 0) System.out.println(i+"\n");
	    }
	 /*------------------------------------------------------*/ 
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
		  sum = sum + i;
		}
		System.out.println("합:"+sum);
	}
}
