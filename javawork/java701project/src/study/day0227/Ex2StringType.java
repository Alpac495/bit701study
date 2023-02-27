package study.day0227;

public class Ex2StringType {

	public static void main(String[] args) {
		String s1 =new String("hello");//이걸왜씀 ㄹㅇㅋㅋ
		String s2 = "ninja jitsu";
		String s4 = "    ninja    ";
		
		System.out.println(s1);
		System.out.println(s2);
		
		//char 과는 다르게 아스키 코드 전환 그딴거 없다
		String s3 = s1 + 100;
		System.out.println(s3);
		//괄호로 묶지 않으면 string으로 뱉어버림
		System.out.println("34+89=" + 34 + 89);
		System.out.println("34+89=" + (34 + 89));
		
		//length 는 공백을 포함한다.
		System.out.println("s1.length() = " + s1.length());
		System.out.println("s2.length() = " + s2.length());
		System.out.println("s4.length() = " + s4.length());
		//trim 은 공백을 제거함(중간공백은 못 뺀다)
		System.out.println("s4.trim().length() = " + s4.trim().length());
		
		//charAt(인덱스) 해당 인덱스 값을 반환 
		//indexOf(문자) : 해당 문자의 인덱스 값을 반환
		System.out.println(s2.charAt(0));
		//존재하지 않는 글자라면 -1 출력
		//존재하는 글자라도, 중복 시에는 가장 앞에있는 하나의 값만 반환
		System.out.println(s2.indexOf('n'));
		
		//마지막으로 존재하는 요소의 인덱스 값 리턴
		System.out.println(s2.lastIndexOf('n'));
		String s5 = "Have a good day";
		//변수가 문자열로 시작하면 true 반환 startwith
		//변수가 문자열로 끝나면 true 반환 endwith
		System.out.println(s5.startsWith("Have"));
		System.out.println(s5.endsWith("day"));
		
		//substring(인덱스 번호) 까지를 제외한 모든 해당 요소를 출력
		System.out.println(s5.substring(5));
		//substring(인덱스 번호, 인덱스 번호) 까지만 출력
		System.out.println(s5.substring(0, 5));
		
		//전부 소문자, 전부 대문자로 변환
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		//일부 문자, 단어를 변경 후 출력
		System.out.println(s5.replace('a', '4'));
		System.out.println(s5.replace("good", "bad"));
		
		//문자열 비교 : equals(), compareTo()
		System.out.println(s5.equals("Have"));
		System.out.println(s5.compareTo("Have"));
		
		String n1 = "apple";
		String n2 = "Apple";
		String n3 = "Orange";
		//string 은 equels 쓰지 암
		System.out.println(n1.equals(n1));
		//대소문자 무시하고 비교(되게 신기함)
		System.out.println(n1.equalsIgnoreCase(n2));
		
		//compareTo는 두 문자열의 아스키코드 값의 차를 반환함
		//맨 앞에 있는 글자의 아스키 값만 인듯?
		System.out.println(n1.compareTo(n3));
		System.out.println(n1.compareTo("apple"));
		
		System.out.println("computer".compareTo("command"));
		
		//split(',') ,로 분리해 배열타입으로 변환
		String colors = "red, black, blue, nonja, ninja";
		String []mycolor=colors.split(",");
		System.out.println("전부 " + mycolor.length + "명의 닌자들이다.");
		
		for (String sh : mycolor) {
			System.out.println(sh);
		}
		
		
		
	}

}
