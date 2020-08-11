import java.util.Scanner;

public class D4_2563_������ {

	public void question() {
		// ������ ��ó�з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 1 ��	128 MB	7027	4927	4306	72.236%
		
		// ����
		// ����, ������ ũ�Ⱑ ���� 100�� ���簢�� ����� ��� ��ȭ���� �ִ�. �� ��ȭ�� ���� ����, ������ ũ�Ⱑ ���� 10�� ���簢�� ����� ������ �����̸� �������� ���� ��ȭ���� ���� �����ϵ��� ���δ�. �̷��� ������� �����̸� �� �� �Ǵ� ���� �� ���� �� �����̰� ���� ���� ������ ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� ��� ��ȭ�� ���� �� ���� ������ �����̸� �׸��� ���� ������� �ٿ��ٸ� ������ ������ ���̴� 260�� �ȴ�.
        
		// �Է�
		// ù° �ٿ� �������� ���� �־�����. �̾� ��° �ٺ��� �� �ٿ� �ϳ��� �����̸� ���� ��ġ�� �־�����. �����̸� ���� ��ġ�� �� ���� �ڿ����� �־����µ� ù ��° �ڿ����� �������� ���� ���� ��ȭ���� ���� �� ������ �Ÿ��̰�, �� ��° �ڿ����� �������� �Ʒ��� ���� ��ȭ���� �Ʒ��� �� ������ �Ÿ��̴�. �������� ���� 100 �����̸�, �����̰� ��ȭ�� ������ ������ ���� ����
        
		// ���
		// ù° �ٿ� �����̰� ���� ���� ������ ���̸� ����Ѵ�.
        
		// ���� �Է� 1 
		// 3
		// 3 7
		// 15 7
		// 5 2
		
		// ���� ��� 1 
		// 260
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] input = {3, 7, 15, 7, 5, 2};
		int[] input = new int[sc.nextInt() * 2];
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		boolean[][] resultArr = new boolean[100][100];
		int result = 0;

		for(int i = 0; i < input.length; i = i + 2) {
			int x = input[i] - 1;
			int y = input[i + 1] - 1;
			for(int j = y; j < y + 10; j++) {
				for(int k = x; k < x + 10; k++) {
					resultArr[j][k] = true;
				}
			}
		}
		
		resultArr[101][101] = true;

		for(boolean[] bb : resultArr) {
			for(boolean b : bb) {
				if(b) {
					result++;
				}
			}
		}
		
//		for(int i = resultArr.length - 1; i >= 0; i--) {
//			for(boolean b : resultArr[i]) {
//				System.out.print(b + " ");
//			}
//			System.out.println("");
//		}
		
		System.out.println(result);
		
		sc.close();
	}

}
