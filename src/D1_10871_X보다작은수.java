import java.util.Scanner;

public class D1_10871_X���������� {
	
	public void question() {
		// X���� ���� �� �����з�
	    
	    // �ð� ����	�޸� ����	����	����	���� ���	���� ����
	    // 1 ��	256 MB	76936	42847	36881	56.765%
	    
	    // ����
	    // ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	    // �Է�
	    // ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
	    // ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

	    // ���
	    // X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.

	    // ���� �Է� 1 
	    // 10 5
	    // 1 10 4 9 2 3 8 5 7 6
	    
	    // ���� ��� 1 
	    // 1 4 2 3
	}
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            
            if(num < X){
                if(!result.equals("")){
                    result += " ";
                }
                result += num;
            }
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
