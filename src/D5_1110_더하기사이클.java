import java.util.Scanner;

public class D5_1110_���ϱ����Ŭ {

	public void question() {
		// ���ϱ� ����Ŭ �з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 2 ��	128 MB	81817	39003	33234	48.557%
		
		// ����
		// 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
		// 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		// ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
		// N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
        
		// �Է�
		// ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
        
		// ���
		// ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
        
		// ���� �Է� 1 
		// 26
		// ���� ��� 1 
		// 4
		
		// ���� �Է� 2 
		// 55
		// ���� ��� 2 
		// 3
		
		// ���� �Է� 3 
		// 1
		// ���� ��� 3 
		// 60
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		int lastNum = 0;
		int trans = num;
		
		do {
			lastNum = trans%10;
			trans = (lastNum * 10) + (trans/10 + lastNum) % 10;
			result++;
		} while(num != trans);
		
		System.out.println(result);
		
		sc.close();
	}
	
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int result = 0;
//		Character lastNum = 0;
//		int trans = num;
//		
//		do {
//			lastNum = Integer.toString(trans).charAt(1);
//			System.out.println(Character.getNumericValue(Integer.toString(num).charAt(0)));
//			System.out.println(Character.getNumericValue(lastNum));
//			System.out.println(Character.getNumericValue(Integer.toString(num).charAt(0)) + Character.getNumericValue(lastNum));
//			trans = lastNum + Integer.toString(Character.getNumericValue(Integer.toString(num).charAt(0)) + Character.getNumericValue(lastNum)).charAt(1);
//			result++;
//		} while(num != trans);
//		
//		System.out.println(result);
//		
//		sc.close();
//	}
}
