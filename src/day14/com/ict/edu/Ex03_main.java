package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 먼저 부모클래스는 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
//		Ex03_Super su = new Ex03_Super();
		
		System.out.println("메인에서 생성자 호출: " + sub);
		
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr); // 부모클래스 변수도 자식클래스 객체 생성했으므로 사용 가능
		
		// 외부에서는 private 호출 안됨
//		System.out.println(sub.cat);
//		System.out.println(sub.dog);
		
		// static (접근제한자가 우선순위가 높다.)
		System.out.println(Ex03_Super.playStation);
		System.out.println(Ex03_Sub.computer);
	}
}