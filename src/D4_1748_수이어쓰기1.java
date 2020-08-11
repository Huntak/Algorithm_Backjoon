import java.util.Scanner;

public class D4_1748_수이어쓰기1 {

	public void question() {
		// 수 이어 쓰기 1 분류
		
		// 시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
		// 1 초	128 MB	8575	4616	3883	55.361%
		
		// 문제
		// 1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.
		// 1234567891011121314151617181920212223...
		// 이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.
        
		// 입력
		// 첫째 줄에 N(1≤N≤100,000,000)이 주어진다.
        
		// 출력
		// 첫째 줄에 새로운 수의 자릿수를 출력한다.
        
		// 예제 입력 1 
		// 120
		// 예제 출력 1 
		// 252
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = 100000000;
		int num = sc.nextInt();
		int result = 0;
		int a = 1;
        int pow = 10;
        
        for(int i = 1; i <= num; i++) {
			if(i % pow < pow-1) {
				result += a;
			}else {
				result += a;
                pow *= 10;
				a++;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
