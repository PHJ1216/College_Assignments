
public class java22_03_01 {

	public static void main(String[] args) {
		//산술 연산자
		// +(더하기) -(빼기) *(곱하기) /(나누기-몫)
		// %(나누기-나머지) ++(증가 연산자) --(감소 연산자)
		int number1=10;
		int number2=10;
		System.out.println("더하기 : "+(number1+number2)); //더하기 20
		System.out.println("빼기 : "+(number1-number2)); //빼기 0
		System.out.println("몫 : "+(number1/number2)); //몫 1
		System.out.println("나머지 : "+(number1%number2)); //나머지 0
		
		number1++;
		number2--;
		System.out.println("1증가 : "+number1);
		System.out.println("1감소 : "+number2);
	}

}
