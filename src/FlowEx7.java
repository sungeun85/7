
public class FlowEx7 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()*4 + 'A');
		int score = 0;
		
		//if������ �籸��ȭ
		if(ch == 'A'){
			score = 90;
		}else if(ch == 'B'){
			score = 80;
		}else if(ch == 'C'){
			score = 70;
		}else if(ch == 'D'){
			score = 60;
		}
		System.out.println("����� ������ " + score + "�� �̻� �Դϴ�.");
		
		//���׿����ڷ� �籸��ȭ
		score = (ch == 'A') ? 90 : (ch == 'B') ? 80 : (ch == 'C') ? 70 : 60;
		System.out.println("����� ������ " + score + "�� �̻� �Դϴ�.");

	}

}
