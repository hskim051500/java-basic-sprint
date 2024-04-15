package TEST2;

import java.awt.RenderingHints.Key;

public class StringUtil {

	public String reverse(String a1){
		//1.문자열 입력받기
		char[] array = a1.toCharArray(); 
		int left=0, right=array.length-1;  
		//2.배열에 문자열을 toCharArray사용해서 저장하기
		for(int i=right;i>=left;i--) {
			char temp = array[left];  
            array[left++] = array[right];  
            array[right--] = temp;  
		}
		    return new String(array);
	}
	//-------------------------------------------------------
	public String concat(String b1,String b2) {
 		return  b1.concat(b2);
	}
	//-------------------------------------------------------
	public boolean contains(String c1, char c2) {
		 
		return c1.indexOf(c2) > -1;
	}
	//-------------------------------------------------------
	
	public String concat(String d1,String d2,String d3) {
		return d1.concat(d2.concat(d3));
	}
	//-------------------------------------------------------
	public boolean contains(String e1,String e2) {
		return  e1.contains(e2); //이건string라이브러리에 내장된 진짜 contatins메서드임
		                        //포함하면 true, 안포함하면 false를 반환함.
	}
}
