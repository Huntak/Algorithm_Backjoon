import java.util.Scanner;

public class D1_9498_시험성적 {
    
	public void question() {
		// 시험 성적 성공분류
	    
	    // 시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
	    // 1 초	128 MB	92696	53156	47512	58.999%
	    
	    // 문제
	    // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

	    // 입력
	    // 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

	    // 출력
	    // 시험 성적을 출력한다.

	    // 예제 입력 1 
	    // 100
	    
	    // 예제 출력 1 
	    // A
	}
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        char result;
        
        score = scan.nextInt();
        if(score > 100 || score < 0){
            return;
        }
        
        if(score > 89 && score <= 100){
            result = 'A';
        } else if(score > 79){
            result = 'B';
        } else if(score > 69){
            result = 'C';
        } else if(score > 59){
            result = 'D';
        } else {
            result = 'F';
        }
        
        System.out.println(result);
        
        scan.close();
    }
}
