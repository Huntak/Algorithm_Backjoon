import java.util.Scanner;

public class D2_5585_�Ž����� {
	
	public void question() {
		// �Ž����� ��ó�ٱ���з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 1 ��	128 MB	13896	8427	7387	60.644%
		
		// ����
		// Ÿ�δ� ���� JOI��ȭ������ ������ ���. JOI��ȭ������ �ܵ����� 500��, 100��, 50��, 10��, 5��, 1���� ����� �ְ�, ������ �Ž����� ������ ���� ���� �ܵ��� �ش�. Ÿ�ΰ� JOI��ȭ������ ������ ��� ī���Ϳ��� 1000�� ���� ���� ���� ��, ���� �ܵ��� ���Ե� �ܵ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� �Էµ� ��1�� ��쿡�� �Ʒ� �׸����� ó�� 4���� ����ؾ� �Ѵ�.
         
		// �Է�
		// �Է��� ���ٷ� �̷�����ְ�, Ÿ�ΰ� ������ ��(1 �̻� 1000�̸��� ����) 1���� �������ִ�.
         
		// ���
		// ������ ��� ������ 1�����θ� �Ǿ� �ִ�. �ܵ��� ���Ե� �ż��� ����Ͻÿ�.
         
		// ���� �Է� 1 
		// 380
		// ���� ��� 1 
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
