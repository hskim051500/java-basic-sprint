package TEST1;
import TEST1.Book;
import TEST1.Person;

public class practice005 {
	public static void main(String[] args) {
	Person p1 = new Person("홍길동",20);
	Person p2 = new Person("김김김",21);
	p1.personPrint();
	p2.personPrint();
	Book b1 = new Book("소나무","저스틴",2000);
	b1.bookPrint();
	}
	
}

