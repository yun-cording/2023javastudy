package day04.com.ict.edu;

public class Ex02_oper {
public static void main(String[] args) {
	// 자료형 변수이름 = 조건 ? 참일경우 : 거짓일경우 ;  기본 틀
	//String str = (false) ? "강아지" : "고양이" ;
	//중첩 삼항 연산자 : 삼항 연산자가 중첩되는 것
	// 형식) 자료형 변수이름 = (조건식1) ? ((조건식2)?이 참일때:조건식2가 거짓일때) : 조건식1이 거짓일때;
	// 형식) 자료형 변수이름 = (조건식1) ? 조건식1이 참일때 : ((조건식2)?이 참일때:조건식2가 거짓일때);

	//int k1이 90 이상이면 "A학점" , 80 이상이면 "B학점" , 나머지는 "F학점"
	int k1 = 91 ;
	String str = k1>=90 ? "A학점" : k1>=80 ? "B학점" : "F학점" ;
	System.out.println(str);
	
	//char k2 가 대문자인지 , 소문자인지 , 기타문자인지 판별하자
	
	char c1 = '1';
	String str2 = c1>='A' && c1<='Z' ? "대문자입니다" : c1>='a' && c1<='z' ?"소문자입니다.":"기타문자입니다";
	System.out.println(str2);
	
	//int k3이 1또는 3이면 남자 , 2 또는 4이면 여자
	//1또는 2이면 1900년대생 , 3또는 4이면 2000년대생 , 나머지는 외국인
	
	int k = 4;
	String str5 = k == 1 || k == 3 ? k == 1 ? "1900년대생 남자입니다"
			:"2000년대생 남자입니다." : k == 2 ? "1900년대생 여자입니다" 
			: k== 4 ? "2000년대생 여자입니다" : "외국인입니다." ;
	System.out.println(str5);
	//=============================================================
	int k2 = 5 ;
	str = (k2 ==1 || k2 == 3) ? (k2==1) ? "1900년대에 태어난 남자" : "2000년대 태어난 남자"
		:(k2==2 || k2==4) ? (k2==2)? "1900년대 태어난 여자" : "2000년대 태어난 여자" :"외국인" ;
	System.out.println(str);
	
		
}
}