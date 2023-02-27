package study.day0227;

public class Ex3DataType {

	public static void main(String[] args) {
		// 실수형 자료형(float(4), double(8)
		//float 타입은 너무 작은 숫자는 저장하지 못함
		//저장시키고ㅓ 싶으면 숫자 뒤에 f가 필요함
		float f1 = 1.2f;
		double d1 = 1.5;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415926535897932384626433832795f;
		double d2 = 3.1415926535897932384626433832795;

		//float 는 반올림 쌔려버리면서 일곱번째에서 출력
		//double은 15번째 자리까지 반올림 없이 출력
		System.out.println(f2);
		System.out.println(d2);
		
		
		boolean t = true;
		boolean f = f1==f2;
		
		System.out.println(t);
		System.out.println(f);
	}

}
