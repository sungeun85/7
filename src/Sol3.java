
public class Sol3 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*10)+1;
		score*=100;
		
		// if������ �籸��ȭ
		if(score == 100){
			System.out.println("����� ������ 100�̰�, ��ǰ�� �������Դϴ�.");
		}else if(score == 200){
			System.out.println("����� ������ 200�̰�, ��ǰ�� TV�Դϴ�.");
		}else if(score == 300){
			System.out.println("����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�.");
		}else if(score == 400){
			System.out.println("����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�.");
		}else{
			System.out.println("�˼������� ����� ������ �ش��ǰ�� �����ϴ�.");
		}
		
		// ���׿����ڷ� �籸��ȭ
		System.out.println((score==400) ? "����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�." :
			(score==300) ? "����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�." :
			(score==200) ? "����� ������ 200�̰�, ��ǰ�� TV�Դϴ�." :
			(score==100) ? "����� ������ 100�̰�, ��ǰ�� �������Դϴ�." :
				"�˼������� ����� ������ �ش��ǰ�� �����ϴ�.");
	}
}