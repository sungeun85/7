
public class TestStudent {

	public static void main(String[] args) {
       Student st = new Student();
  
       st.setName(args[0]);
       st.setAge(Integer.parseInt(args[1]));
       System.out.println(args[0] + "님 입장했습니다.");
       System.out.println(args[0] + "님의 나이는" + args[1] + "세 입니다.");
       System.out.println(st.getName() + "님 환영합니다.");
       System.out.println(st.getName() + "님의 나이가" + st.getAge() + "세 이군요.");
	}
}
