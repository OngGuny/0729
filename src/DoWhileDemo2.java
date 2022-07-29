
public class DoWhileDemo2 {
public static void main(String[] args) {
	// 1부터 6까지의 랜덤값2개를 추출하되 서로 다른 2개를 출력하는 프로그램  for 나 while 이나 dowhile 해봐라 
	int r1,r2,r3,r4,r5,r6;
	do {
		r1 = (int)(Math.random()*45+1);
		r2 = (int)(Math.random()*45+1);
		//if(r1==r2)break;
		r3 = (int)(Math.random()*45+1);
		r4 = (int)(Math.random()*45+1);
		//if(r3==r4)break;
		r5 = (int)(Math.random()*45+1);
		r6 = (int)(Math.random()*45+1);
		//if(r5==r6)break;
//	System.out.printf("r1=%d, ", r1);	
//	System.out.printf("r2=%d\n", r2);	
//		
		
	}while (
			r1==r2|| r2==r3 ||r3==r4|| r4==r5|| r5==r6||
			r1==r3|| r2==r4 ||r3==r5|| r4==r6||
			r1==r4|| r2==r5 ||r3==r6||
			r1==r5|| r2==r6 ||
			r1==r6 					);
	
	
	System.out.printf("r1=%d\n", r1);	
	System.out.printf("r2=%d\n", r2);	
	System.out.printf("r3=%d\n", r3);	
	System.out.printf("r4=%d\n", r4);	
	System.out.printf("r5=%d\n", r5);	
	System.out.printf("r6=%d\n", r6);	
		// 출력을 반복하게 해버리니까 무한루프 걸리는거. 걍 밖으로 빼면 되는거였음; 변수는 밖에서 지정하고 안에서는 변수가 어떻다만 지정  
	System.out.printf("Your Lucky Number is : %d,%d,%d,%d,%d,%d\n",r1,r2,r3,r4,r5,r6);
}

}
