import java.util.Scanner;

public class D4_1748_���̾��1 {

	public void question() {
		// �� �̾� ���� 1 �з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 1 ��	128 MB	8575	4616	3883	55.361%
		
		// ����
		// 1���� N������ ���� �̾ ���� ������ ���� ���ο� �ϳ��� ���� ���� �� �ִ�.
		// 1234567891011121314151617181920212223...
		// �̷��� ������� ���ο� ���� �� �ڸ� ���ϱ�? �� ���� �ڸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
        
		// �Է�
		// ù° �ٿ� N(1��N��100,000,000)�� �־�����.
        
		// ���
		// ù° �ٿ� ���ο� ���� �ڸ����� ����Ѵ�.
        
		// ���� �Է� 1 
		// 120
		// ���� ��� 1 
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
