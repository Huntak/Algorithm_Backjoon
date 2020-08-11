import java.util.Scanner;

public class D3_1924_2007년 {

	public void question() {
		// 2007년 분류
		
		// 시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
		// 2 초	128 MB	67745	29824	25526	45.524%
		
		// 문제
		// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
        
		// 입력
		// 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
        
		// 출력
		// 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
        
		// 예제 입력 1 
		// 1 1
		// 예제 출력 1 
		// MON
		
		// 예제 입력 2 
		// 3 14
		// 예제 출력 2 
		// WED
		
		// 예제 입력 3 
		// 9 2
		// 예제 출력 3 
		// SUN
		
		// 예제 입력 4 
		// 12 25
		// 예제 출력 4 
		// TUE
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		int monthDays = 0;
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 월	화 	수 	목 	금 	토 	일
		// 1 	2 	3 	4 	5 	6 	7
		// 8 	9 	10	11	12	13	14
		// 15	16	17	18	19	20	21
		// 22	23	24	25	26	27	28
		// 29	30	31	1	2	3	4
		// 5	6	7	8	9	10	11
		// 12	13	14	15	16	17	18
		// 19	20	21	22	23	24	25
		// 26	27	28	1	2	3	4
		// 5	6	7	8	9	10	11
		// 12	13 	14	15	16	17	18

		//System.out.println(33 % 7);
		//System.out.println(60 % 7);
		
		monthDays += Integer.parseInt(input[1]);
		
		for(int i = 0; i < Integer.parseInt(input[0]) - 1; i++) {
			monthDays += days[i];
		}

		monthDays = monthDays % 7;
		
		if(monthDays == 1){
			System.out.println("MON");
		}else if(monthDays == 2){
			System.out.println("TUE");
		}else if(monthDays == 3){
			System.out.println("WED");
		}else if(monthDays == 4){
			System.out.println("THU");
		}else if(monthDays == 5){
			System.out.println("FRI");
		}else if(monthDays == 6){
			System.out.println("SAT");
		}else if(monthDays == 0){
			System.out.println("SUN");
		}
		
		sc.close();
	}

}
