
public class Example {
	public static void main(String[] args) {
		int score = 82;
		String grade = null;
		
		System.out.println("당신의 점수는 " + score + "입니다.");
		
		grade = (score >= 90) ? ((score >= 98) ? "A+" : (score < 94) ? "A-" : "A") : (score >= 80) ? ((score >= 88) ? "B+" : (score < 84) ? "B-" : "B" ) : "C";
		
		System.out.println("당신의 학점은 " + grade + "입니다.");

	}
}
