import java.util.Scanner;

// 구구단 만들어보기 
public class ForDemo1 {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.print("몇 단? : ");
//	int dan = sc.nextInt();
//	for(int i=1; i<=dan;i++) {
//		System.out.printf("%d x %d = %d\n",dan,i,dan*i);	//여러개 찍어야 하니까 f가 편하다. 
//	}// 1~9까지 곱하는거랑 1~9까지 가는거 둘다 출력할수있어야함 ->> 2중 for 문 3중까진 할 수 있어야함 
	
	//별을 다섯번 찍어봐
	/*★
	 *★★
	 *★★★
	 *★★★★
	 *★★★★★ 
	 */
	for(int l =1;l<5;l++) {  // 5번 이란건 포 가운데 변수가 지정. 		
		for(int p =1;p<=l ;p++) {
			System.out.print("★\t");
		}
		System.out.println(); 	//그냥 줄바꾸기만 해주면된다; 줄바꾸고 옆으로 써 줄 필요없이.. 
		
	}
// 밑에는 반대로 	
// l이 처음에 1이다. 그 때, p는 1이고 l과 같거나 작다. 참이다. 그때 1더하면서 나타낸다. 

	for(int l =5;l>0;l--) {  // 5번 이란건 포 가운데 변수가 지정. 		
		for(int p =1;p<=l ;p++) {
			System.out.print("★\t");
		}
		System.out.println(); 	//그냥 줄바꾸기만 해주면된다; 줄바꾸고 옆으로 써 줄 필요없이.. 
		
	}
	for(int l =5;l>0;l--) {  		
		for(int p =1;p<=l ;p++) {
			System.out.print("★\t");
		}
		System.out.println(); 	
		
	}for(int l =5;l>0;l--) {   		
		for(int p =1;p<=l ;p++) {
			System.out.print("★\t");
		}
		System.out.println(); 	
		
	}
	
	
	
}
}
