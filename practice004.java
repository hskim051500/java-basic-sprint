import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.UnionMember;
public class practice004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = new int[10];
		for(int i=0;i<10;i++) {
			arrays[i] = i+1;
		}
		for(int i=0;i<10;i++) {
			System.out.println(arrays[i]);
		}
		/*------------------------------------------------------*/
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum =0;
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		int avg = sum / 5;
		System.out.println(avg);
		
		/*------------------------------------------------------*/
		//Sort 종류 중에서 사용하면됨.
		int[] arr1 = new int[] {8,7,9,1,5,3,4,6,11,10};
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0;i<8;i++){
			if(arr1[i+1] >= max) {
				max =arr1[i+1];
				if(arr[i+2]>=arr[i+1]) {
					max = arr[i+2];
					if(arr[i+1]>arr[i])min = arr[i];
					else min = arr[i+1];
				}
;			}
			else {
				if(arr[i+2] >= arr[i]) {
					max = arr[i+2];
					min = arr[i+1]; 
				}
			}
			System.out.println("\n최대:"+max +"\n최소:"+"\n\n");
		}
		
		
	}

}
