import java.util.Scanner;

public class D2_5585_거스름돈 {
	
	public void question() {
		// 거스름돈 출처다국어분류
		
		// 시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
		// 1 초	128 MB	13896	8427	7387	60.644%
		
		// 문제
		// 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
		// 예를 들어 입력된 예1의 경우에는 아래 그림에서 처럼 4개를 출력해야 한다.
         
		// 입력
		// 입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.
         
		// 출력
		// 제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.
         
		// 예제 입력 1 
		// 380
		// 예제 출력 1 
		// 4
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000 - sc.nextInt();
        int M = 0;
        int result = 0;
        
        while(N > 0) {
            M = N % 500;
            result = N / 500;
            M = M % 100;
            result += M / 100;
            M = M % 50;
            result += M / 50;
            M = M % 10;
            result += M / 10;
            M = M % 5;
            result += M / 5;
            M = M % 1;
            result += M / 1;
            
            if(M == 0){
                break;
            }
            
            if(N < 0){
                result = -1;
                break;
            }
            
            if(N >= 500){
                N -= 500;
                result += 1;
            }else if(N >= 100){
                N -= 100;
                result += 1;
            }else if(N % 50 == 0){
                N -= 50;
                result += 1;
            }else if(N % 10 == 0){
                N -= 10;
                result += 1;
            }else if(N % 5 == 0){
                N -= 5;
                result += 1;
            }else {
                N -= 1;
                result += 1;
            }
        }
        System.out.println(result);
        
        sc.close();
    }
}
