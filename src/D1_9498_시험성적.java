import java.util.Scanner;

public class D1_9498_���輺�� {
    
	public void question() {
		// ���� ���� �����з�
	    
	    // �ð� ����	�޸� ����	����	����	���� ���	���� ����
	    // 1 ��	128 MB	92696	53156	47512	58.999%
	    
	    // ����
	    // ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	    // �Է�
	    // ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

	    // ���
	    // ���� ������ ����Ѵ�.

	    // ���� �Է� 1 
	    // 100
	    
	    // ���� ��� 1 
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
