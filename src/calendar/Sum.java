package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력 : 키보드로 두 수의 입력을 받는다.
		System.out.println("두 수를 입력해주세요.");
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.next();
		s2 = scanner.next();
		int a = Integer.parseInt(s1); //형 변환 작업(문자열 -> 정수형)
		int b = Integer.parseInt(s2);
		System.out.println(a+", "+b);
		
		//출력 : 화면에 두 수의 합을 출력한다.
		//System.out.println("두 수의 합은 "+ (a+b) +"입니다.");
		System.out.printf("두 수의 합은 %d입니다.", a+b);
		scanner.close();
	}
}
