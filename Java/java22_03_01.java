
public class java22_03_01 {

	public static void main(String[] args) {
		//��� ������
		// +(���ϱ�) -(����) *(���ϱ�) /(������-��)
		// %(������-������) ++(���� ������) --(���� ������)
		int number1=10;
		int number2=10;
		System.out.println("���ϱ� : "+(number1+number2)); //���ϱ� 20
		System.out.println("���� : "+(number1-number2)); //���� 0
		System.out.println("�� : "+(number1/number2)); //�� 1
		System.out.println("������ : "+(number1%number2)); //������ 0
		
		number1++;
		number2--;
		System.out.println("1���� : "+number1);
		System.out.println("1���� : "+number2);
	}

}
