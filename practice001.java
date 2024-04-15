import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		double b = 1.0; 
		char c = 'x';
		boolean d = true;
		String e = "apple";
		
		
		/*------------------------------------------------------*/
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
		case "/" : System.out.println(a1 / a2); break;
		default : break;
		}
		/*------------------------------------------------------*/
		
		Scanner sc1 = new Scanner(System.in);
		String name;
		int age;
		name = sc1.nextLine();
		age = sc1.nextInt();
		System.out.println("이름:"+ name + "\n나이:" + age);
		
	}

}
