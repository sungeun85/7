
public class TestStudent {

	public static void main(String[] args) {
       Student st = new Student();
  
       st.setName(args[0]);
       st.setAge(Integer.parseInt(args[1]));
       System.out.println(args[0] + "�� �����߽��ϴ�.");
       System.out.println(args[0] + "���� ���̴�" + args[1] + "�� �Դϴ�.");
       System.out.println(st.getName() + "�� ȯ���մϴ�.");
       System.out.println(st.getName() + "���� ���̰�" + st.getAge() + "�� �̱���.");
	}
}
