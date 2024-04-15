import java.util.Scanner;

public class practice002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1;
		int a2;
		String operator;
		a1 = sc.nextInt();
		sc.nextLine();
		operator = sc.nextLine();
		a2 = sc.nextInt();
		sc.nextLine();
		switch(operator) {
		case "+" : System.out.println(a1 + a2); break;
		case "-" : System.out.println(a1 - a2); break;
		case "*" : System.out.println(a1 * a2); break;
		case "/" : if(a2 == 0) System.out.println("0으로 나눌 수 없는 수");		           
		           else System.out.println(a1 / a2);
		           break;
		case "%" : System.out.println(a1 % a2); break;
		default : break;
		}
		/*------------------------------------------------------*/
		
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int max = n1;
		int min = n1;
		if(n2 >= max) {
			max = n2; 
			if(n3>=n2) {
				max = n3;
				if(n2>n1) min = n1;
				else min = n2;
			}
		}
		else{
		   if(n3 >= n1) {
			   max= n3;
			   min= n2;
			}
		}
		System.out.println("\n최대:"+max +"\n최소:"+min+"\n\n");
		/*------------------------------------------------------*/
		
		boolean t1 = true;
		boolean t2 = false;
		System.out.println(t1 && t2);
		System.out.println(t1 || t2);
		System.out.println(!t1);
		
		
	}

}
