
public class Example {
	public static void main(String[] args) {
		int score = 82;
		String grade = null;
		
		System.out.println("����� ������ " + score + "�Դϴ�.");
		
		grade = (score >= 90) ? ((score >= 98) ? "A+" : (score < 94) ? "A-" : "A") : (score >= 80) ? ((score >= 88) ? "B+" : (score < 84) ? "B-" : "B" ) : "C";
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");

	}
}
