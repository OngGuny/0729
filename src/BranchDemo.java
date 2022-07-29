import java.util.Scanner;

public class BranchDemo {
public static void main(String[] args) {
//	for(int i =1;i<101;i++) {
//		if(i%7==0) System.out.print(i+"\t");	
//		//여기엔 사실 else continue 라는 코드가 숨어있다. 의미는 증감을 계속해라. 
//		else continue;
//	}
//	outer :
//	for(int i = 65;i<91;i++) {
//		int j = 65;
//		inner : 
//		while(j<=i) {
//			System.out.printf("%c",j);
//			if(j==70) break outer; //go to 를 못쓰기 때문에 벗어나고싶은지점에 '라벨' : 씀 . 근데 막 많이 쓰지않음 
//			j++; // 이걸 까먹기 쉽기때문에 
//			/*		int j = 65;
//					while(j<91) {
//			
//					j++;
//			 * 		} 이렇게 틀을 먼저 만들어 놓고 코딩한다. 
//			 */
//		} System.out.println();
//	}
//	// 패스워드 감시하는거 만든 목적은 언제 컨티뉴와 브래이크가 쓰이는가 
	String systemPassword = "ABCD";
	Scanner sc = new Scanner(System.in);
	System.out.print("Input your password : ");
	String userPassword = sc.nextLine();
	int i;
	for( i =0;i<4;i++) {
		if(systemPassword.charAt(i) == userPassword.charAt(i) continue;
	}
	
}
}
