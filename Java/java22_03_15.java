import java.util.Scanner;
public class java22_03_15 {

	public static void main(String[] args) {
		// 학생 성적 및 평균 출력 프로그램

		Scanner scan = new Scanner(System.in);
		int student_grades = 0;
		int total_grades = 0;
		int count = 0;
		int average = 0;
		do {
			System.out.print("학생의 점수를 입력하십시오. : ");
			student_grades = scan.nextInt();

			if (student_grades == -1) { //만약 -1 입력 시 break로 탈출 
				System.out.println("입력할 점수 없음!");
				break;
			}
			if (student_grades >= 90) {
				System.out.println("등급 : A");
			} else if (student_grades >= 80) {
				System.out.println("등급 : B");
			} else if (student_grades >= 70) {
				System.out.println("등급 : C");
			} else if (student_grades >= 50) {
				System.out.println("등급 : D");
			} else {
				System.out.println("등급 : F");
			}
			total_grades += student_grades; // -1이 입력되기 전 까지 점수를 계속 더함
			count++; // 평균 출력을 위해 카운팅
		} while (student_grades != -1); // -1이 입력이 안 될동안 do-while문 실행
		scan.close(); //scan 닫아주기
		average = (total_grades / count);
		System.out.println("평균은 "+average+"점 입니다.");
	}
}
