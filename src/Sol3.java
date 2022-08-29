
public class Sol3 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*10)+1;
		score*=100;
		
		// if문으로 재구조화
		if(score == 100){
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
		}else if(score == 200){
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
		}else if(score == 300){
			System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
		}else if(score == 400){
			System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");
		}else{
			System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
		}
		
		// 삼항연산자로 재구조화
		System.out.println((score==400) ? "당신의 점수는 400이고, 상품은 자동차입니다." :
			(score==300) ? "당신의 점수는 300이고, 상품은 노트북입니다." :
			(score==200) ? "당신의 점수는 200이고, 상품은 TV입니다." :
			(score==100) ? "당신의 점수는 100이고, 상품은 자전거입니다." :
				"죄송하지만 당신의 점수에 해당상품이 없습니다.");
	}
}