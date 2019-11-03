package bruteForce;
/**
 * 
 * @author YGH
 * �ϰ� ������
 * �պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. 
 * �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
 * ��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. 
 * �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
 * ��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * ��ȩ ���� �ٿ� ���� �����̵��� Ű�� �־�����. 
 * �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, ������ ������ ���� ������ ��쿡�� �ƹ��ų� ����Ѵ�.
 * �ϰ� �������� Ű�� ������������ ����Ѵ�. 
 * �ϰ� �����̸� ã�� �� ���� ���� ����.
 */
import java.util.*;
public class No2309_BruteForce {
	static final int TOTAL = 9;
	static final int HEIGHT = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] candidate = new int[TOTAL];
		int sum = 0;
		for(int i = 0; i < TOTAL; i++) {
			candidate[i] = sc.nextInt();
			sum += candidate[i];
		}
		Arrays.sort(candidate);
		for(int i = 0; i< TOTAL - 1; i++) {
			for(int j = i + 1; j < TOTAL; j++) {
				if(sum - candidate[i] - candidate[j] == 100) {
					for(int k = 0; k < TOTAL; k++) {
						if(k!=i && k!=j) {
							System.out.println(candidate[k]);	
						}
					}
					System.exit(0);
				}
			}
		}
	}
}
