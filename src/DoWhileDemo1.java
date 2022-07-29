import java.util.Scanner;
// whiledemo1을 dowhile로 바꿔보자 
public class DoWhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ag; //이렇게 그냥 빼주고 
		do{
			
		System.out.print("정수 한개 : ");
		int su = sc.nextInt();
		System.out.print(su+"는"+((su%2==0)?" 짝수입니다.\n":" 홀수입니다\n"));
		System.out.print("Again? (y/n) : ");
		ag = sc.next();// 변수만 쓴다. 
		
			
	}while(ag.equals("y")||ag.equals("Y"));	//얘는 y를 눌러야반복한다. 아까는 거짓일 때 빠져나오는거라면.
		 														//y누를시 반복문으로 만들었따면 변수를 밖으로 빼줘야한다. 
		System.out.println("Thanks.");
}
}
/* 반복횟수 알수있으면 for  
 * 모르겠으면 while 근데 이런건 무한반복의 위험성 
 * 조건을 밖으로 뺄때 ,반복하게끔 dowhile을 사용..?
 * 
 */