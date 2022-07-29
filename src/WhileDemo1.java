import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.print("정수 한개 : ");
		int su = sc.nextInt();
		System.out.print(su+"는"+((su%2==0)?" 짝수입니다.\n":" 홀수입니다\n"));
		System.out.print("Again? (y/n) : ");
		String ag = sc.next();
		if(ag.equals("n")||ag.equals("N")) {break;}
		// y n 만 치게하고 나머지는 못치게 해보자 
		
			
	}
	
}
}