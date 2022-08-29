
public class FlowEx7 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()*4 + 'A');
		int score = 0;
		
		//if문으로 재구조화
		if(ch == 'A'){
			score = 90;
		}else if(ch == 'B'){
			score = 80;
		}else if(ch == 'C'){
			score = 70;
		}else if(ch == 'D'){
			score = 60;
		}
		System.out.println("당신의 점수는 " + score + "점 이상 입니다.");
		
		//삼항연산자로 재구조화
		score = (ch == 'A') ? 90 : (ch == 'B') ? 80 : (ch == 'C') ? 70 : 60;
		System.out.println("당신의 점수는 " + score + "점 이상 입니다.");

	}

}
