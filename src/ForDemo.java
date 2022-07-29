import java.util.Scanner;

// 1부터 100까지의 합 
public class ForDemo {
	public static void main(String[] args) {
//	int sum =0;
//	for(int a = 1 ;a<=100;a++) {
//		sum+=a;
//	}
//	System.out.println("sum = "+sum);
		Scanner scn = new Scanner(System.in);// 이거먼저 쓰고 ctrl shift o  입력하면 알아서 가져옴 
		System.out.println("몇 factorial : ");
		int fac = scn.nextInt();
		int result = 1;
		for(int f = fac ; f>=1;f--) {
		result *=f;
		}
		System.out.printf("%d!=%d\n",fac,result);
	
		
	
	}//
}//
