package study.day0227;

public class Ex4Printf {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		// "\n"은 엔터임 "\t" 는 탭임
		System.out.printf("\t"+a + "\n" + b + "\n");
		System.out.printf("\"red\"tblue\"torange\"");
		System.out.printf("\n"+"\'java\',\'spring\'");
		
		System.out.printf("\n"+"C:\\bit701\\photo\\phoot.jpg");
		
		//printf 는 변수값을 변환기호를 사용해 출력 가능
		//1글자:%c(char), 문자열%s(string), 정수%d(double), 실수%f(float)
		
		int java=78;
		int spring = 87;
		String name = "susu";
		double height = 167.8;
		char blood = 'b'; 
		
		System.out.println("println 으로출 력");
		System.out.println("자바즘수 = " + java);
		System.out.println("수푸링즘수 = " + spring);
		System.out.println("이름 = " + name);
		System.out.println("신장 = " + height);
		System.out.println("혈액형 = " + blood);
		
		System.out.println("\n** printf 로 출력");
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("자바점수 : %d\n",java);
		System.out.printf("스프링 점수 : %d\n",spring);
		//전체 자리수 다섯, 소숫점 1의 자릿수까지.
		System.out.printf("신장 : %5.1f\n",height);
		System.out.printf("혈액형 : %c\n", blood);
		
		int c = 65;
		System.out.printf("c 의 십진수 값은 %d, 문자는 %c\n", c ,c);
		
		
	}

}
