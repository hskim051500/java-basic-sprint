package TEST2;
import TEST2.StringUtil;

public class practice006 {

	
	public static void main(String[] args) {
		StringUtil su = new StringUtil(); //인스턴스메서드 호출위해서 객체생성
		System.out.println(su.reverse("ABCDEFGHIJKLMNOPQRSTUVXWYZ"));
		
		System.out.println(su.concat("ABC","DEF"));
		
		System.out.println(su.concat("GHI","JKL","MNO"));
		System.out.println(su.contains("abccccccc",'c'));
		//이것이 실제로 String라이브러리에서 제공하는 contains메서드는 아니고
		//직접만든 메서드
		
		System.out.println(su.contains("Hello","He"));
		//이것이 실제로 String라이브러리에서 제공하는 contains메서드는 아니고
		//직접만든 메서드
		
	}

}
