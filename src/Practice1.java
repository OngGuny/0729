

/*A
 * AB
 * ABC...Z까지 탑쌓기 
 */
public class Practice1 {
public static void main(String[] args) {
	
//	for(int l =65;l<=90;l++) {  		//l은 65부터 시작한다. 65이다. 아래로 간다. 탈출한 로직이 여기로 온다. 그리고 l에 1 더해준다.  이제 66이다. 
//		for(int p =65;p<=l ;p++) {	//l이 65일 때, p는 65부터 시작한다. 65이다. l보다 같거나 작은가? 그렇다. p에1더해준다. 그리고 나타낸다. p에 대한 캐릭터값을 출력해라. 
//			System.out.printf("%c",p);	// p가 66이 되었다. l보다 같거나 작은가? 아니다. 그럼 for 탈출한다. 탈출해서 처음의 for로 간다. 
//		}
//		System.out.println(); 	
//		
//	}
	for(int l =1;l<=9;l++) {  		
		for(int p =1;p<=9 ;p++) {	
			System.out.printf("%s x %s=%d \t",l,p,l*p);	
		}
		System.out.println(); 
}
	System.out.println("-----------------------------------------------------------------------------------");//잘했다 그냥 순서가 바뀌었을뿐
	for(int l =1;l<=9;l++) {  		
		for(int p =1;p<=9 ;p++) {	
			System.out.printf("%s x %s=%d \t",p,l,l*p);	
		}
		System.out.println(); 
}

}

}// for 는 범위가 명확할 때 쓰는거. 정수처럼 명확한거. 
// 이다음에 배우는건 몇번 반복할지 모를 때 쓰는거 배운다. 

