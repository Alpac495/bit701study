package study.day0227;

public class Ex1DataType {

	public static void main(String[] args) {
		System.out.println("응애노스");
		
		byte a = 127;
		//강제로 자료형보다 큰 값을 넣을 경우 값손실이 발생한다.
		//그래서 음수?
		byte b = (byte) 150 ;
		
		System.out.println(a);
		System.out.println(b);
		
		//char 은 '' 만 가능함, 한글 한 글자는 2byte 라 char이 담는게 가능함
		//string 이 ""
		char m1 = 'a';
		String ss = "s";
		//캐스트하면 아스키 코드가 나온다(오지네)
		//int + int = int
//		double + int = double
//		string + int = string
//		char + int = int 더 큰 쪽을 따라간다.
		//묵시적형변환이라고 함, 연산시에 자동으로 타입이 결정된다.
		System.out.println((int)m1);
		
		//이딴게 왜 되는거지
		// 묵시적 형변환이 char 을 아스키 코드로 전환해서 int 값을 빼준다.
		//정신나간듯
		System.out.println('A' + 32);
		
		//이게 에러나지 않는 이유도 같은 원인을 공유함.
		//66을 아스키 코드로 봄 (진짜미친듯)
		char m3 = 66;
		int m4 = 'A';
		System.out.println(m3);
		//이지랄로 해도 잘 나옴
		System.out.println((int)m4 + " " + (char)m3);
		
	}

}
