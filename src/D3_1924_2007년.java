import java.util.Scanner;

public class D3_1924_2007�� {

	public void question() {
		// 2007�� �з�
		
		// �ð� ����	�޸� ����	����	����	���� ���	���� ����
		// 2 ��	128 MB	67745	29824	25526	45.524%
		
		// ����
		// ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
        
		// �Է�
		// ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
        
		// ���
		// ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
        
		// ���� �Է� 1 
		// 1 1
		// ���� ��� 1 
		// MON
		
		// ���� �Է� 2 
		// 3 14
		// ���� ��� 2 
		// WED
		
		// ���� �Է� 3 
		// 9 2
		// ���� ��� 3 
		// SUN
		
		// ���� �Է� 4 
		// 12 25
		// ���� ��� 4 
		// TUE
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		int monthDays = 0;
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// ��	ȭ 	�� 	�� 	�� 	�� 	��
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
