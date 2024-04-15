package TEST1;

public class Person {
	private String name;
	private int age;
	
	public Person() {}; // 기본생성자,없는경우생성
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	void personPrint(){
		System.out.println("이름:"+this.name);
		System.out.println("나이:"+this.age);
		System.out.println("\n");
	}
}
