
public class Ex2 {

	public static void main(String[] args) {
		int score = 82;
		String grade =""; //�� ���ڸ� ������ ���̹Ƿ� ������ Ÿ���� String���� ��.
		System.out.println("����� ������ " + score + "�Դϴ�.");
		if(score>=90) { //score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade ="A";
			if (score>=98) { //90�� �̻� �߿����� 98�� �̻��� A+
				grade += "+"; //grade = grade + "+";�� ����.
			} else if (score < 94) {
				grade += "-";
			}
		} else if (score >=80) {//score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = "B";
			if ( score >= 88) {
				grade += "+";
			} else if ( score < 84) {
				grade += "-";
			}
		} else { // �������� C����(grade)
			grade = "C";
		}

		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}