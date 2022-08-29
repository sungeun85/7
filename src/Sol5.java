
public class Sol5 {

	public static void main(String[] args) {
		int score = 1;
		score *= 100;
		
		// if문으로 재구조화
		if(score == 100){
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
		}
		if(score == 200 || score == 100){
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
		}
		if(score == 300 || score == 200 || score == 100){
			System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
		}
		if(score == 400 || score == 300 || score == 200 || score == 100){
			System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");
			System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
		}
		
		// 삼항연산자로 재구조화
		System.out.println();
		String msg = "";
		
		msg += (score == 100) ? "당신의 점수는 100이고, 상품은 자전거입니다. \n" : "";
		msg += (score == 200 || score == 100) ? "당신의 점수는 200이고, 상품은 TV입니다.\n" : "";
		msg += (score == 300 || score == 200 || score == 100) ? "당신의 점수는 300이고, 상품은 노트북입니다.\n" : "";
		msg += (score == 400 || score == 300 || score == 200 || score == 100) ? "당신의 점수는 400이고, 상품은 자동차입니다. \n죄송하지만 당신의 점수에 해당상품이 없습니다." : "";
		System.out.println(msg);
	}
}
