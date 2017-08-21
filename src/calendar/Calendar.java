package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getMaxDayOfMonth(int num) {
		return maxDays[num - 1];
	}
	
	public static void main(String[] args) {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("\n반복 횟수를 입력하세요. : ");
		Scanner scanner = new Scanner(System. in);
		int repeat = scanner.nextInt();
		System.out.println("달을 입력하세요.");
		for(int i=0; i < repeat; i++) {
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, getMaxDayOfMonth(month));
		}
		System.out.println("안녕~");
		scanner.close();
	}
}
