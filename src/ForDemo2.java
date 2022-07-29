// 최종목표 while 을 공부 


//for 예제 
/*x= 1부터 2씩 증가
 * y= 100부터 3씩 감소
 * x,y와 교차할 때의 값. 
 * 
 */
public class ForDemo2 {
public static void main(String[] args) {
	int x,y;
//	 x = 1; 
//	 y = 100; for 쓸꺼면 그냥 선언만 하고 지정안해줘도된다. 
//	 for (x=1,y=100;x<=100;x+=2, y-=3) { //조건 2개씩 넣어줘도된다. 
//		 if (x>y) break;//break는 반복을 멈춘다. 즉 for를 벗어난다는것 .
//	 }
//	 System.out.printf("x=%d , y=%d\n",x,y );
//	
// 1부터 10까지 출력하기 
//	int i = 1; 	초기화
//	for( ;i<11;) {// 초기화를 for 밖에서 해도 된다. 조건 
//		 System.out.print(i+"\t");
//		 i++; // 증감값도 밖으로 빼도 된다. 순서가 맞기 때문에. 초기화 - 조건 - 증감 , 증감 
//	 }
	
	//while문을 배워보자 조건 무조건 바깥에 해놔야함 
//	int w = 1; //초기값을 밖에쓰고
//	while(w<11) { //조건문은 괄호안에 
//		System.out.print(w+"\t");
//	 w++;	//증감은 중괄호 닫기 전에 
//	}
//		// 그럼 for와 while 은 무슨차이?? (if 와switch는 무슨차이?  )
		// while 은 해야할 일이 있다. 얼마나 반복할지 모를때 필요. 
	
	
	//while 로 구구단 만들어보기  for을 90도 로 꺽은게 while 이다. 
//	int da = 2;
//	while(da<10) {
//		int ad = 1; // 초기화를 직전에 해야한다. while안의 while의 초기화값은 바깥쪽의 while 안에 넣어야한다. 나는 둘다밖으로 뺴놔서 안됬던거 
//		while (ad<10) {System.out.printf("%d x %d = %d\t",ad,da,ad*da);
//			ad++;}
//			System.out.println();
//			da++;
//	}		// 와일 2개쓸떄는 초기화값 조건 증감값 틀먼저 만들고 시작하는게 편함 
//	// 대문자 소문자 5개씩 while로 나타내보기 
	int a =65; // while2개로 만들어보기 if 써서 만드는건 수업소스에 있다. 
	while(a<=90) {
		System.out.printf("%c\t" ,a);
		
		int b = 1;
		while(b%5==0) {System.out.printf("\n");
		b++;
		}
			a++;
	}
}
}
