import java.util.Scanner;

public class D3_2577_�����ǰ��� {

	public void question() {
		// ������ ���� ������ó�з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 1 ��	128 MB	56049	34411	29176	61.790%
		
		// ����
		// �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� A = 150, B = 266, C = 427 �̶�� 
		// A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		// ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
        
		// �Է�
		// ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
        
		// ���
		// ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
        
		// ���� �Է� 1 
		// 150
		// 266
		// 427
		
		// ���� ��� 1 
		// 3
		// 1
		// 0
		// 2
		// 0
		// 0
		// 0
		// 2
		// 0
		// 0
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] result = new int[10];
		//result = [0, 1, 0, 0, 0, 0, 0, 0];
		String[] resultArr = (A * B * C + "").split("");

		for(int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
			result[Integer.parseInt(resultArr[i])]++;
			//result[1]++;
			//result[7]++;
		}
		System.out.println("===========");
		// result[charAt[i] - '0']++

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
	}

}
