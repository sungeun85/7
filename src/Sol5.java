
public class Sol5 {

	public static void main(String[] args) {
		int score = 1;
		score *= 100;
		
		// if������ �籸��ȭ
		if(score == 100){
			System.out.println("����� ������ 100�̰�, ��ǰ�� �������Դϴ�.");
		}
		if(score == 200 || score == 100){
			System.out.println("����� ������ 200�̰�, ��ǰ�� TV�Դϴ�.");
		}
		if(score == 300 || score == 200 || score == 100){
			System.out.println("����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�.");
		}
		if(score == 400 || score == 300 || score == 200 || score == 100){
			System.out.println("����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�.");
			System.out.println("�˼������� ����� ������ �ش��ǰ�� �����ϴ�.");
		}
		
		// ���׿����ڷ� �籸��ȭ
		System.out.println();
		String msg = "";
		
		msg += (score == 100) ? "����� ������ 100�̰�, ��ǰ�� �������Դϴ�. \n" : "";
		msg += (score == 200 || score == 100) ? "����� ������ 200�̰�, ��ǰ�� TV�Դϴ�.\n" : "";
		msg += (score == 300 || score == 200 || score == 100) ? "����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�.\n" : "";
		msg += (score == 400 || score == 300 || score == 200 || score == 100) ? "����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�. \n�˼������� ����� ������ �ش��ǰ�� �����ϴ�." : "";
		System.out.println(msg);
	}
}
