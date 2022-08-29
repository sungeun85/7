
public class Sol6 {
    //for 재구조화
	public static void main(String[] args) {
		for (int i=2; (i<=9); i++) { 
		for (int j=1; (j<=9); j++) { 
				System.out.println(i+"*"+j+"="+(i*j));
		   }
		}  //end of while(i<=9)
		
	//do while	
       int i = 2;
        do{
        	int j = 1;
        	do{
        		System.out.println(i + "*" + j + "=" + i*j);
        		j++;
        	}while(j <= 9);
        	i++;
        }while(i <= 9);
       }
}