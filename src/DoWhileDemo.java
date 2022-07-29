
public class DoWhileDemo {
public static void main(String[] args) {
	//1~10까지 출력해보기  for, while, dowhile 써서  
	for(int i=1;i<11;i++) {
		System.out.print(i+"\t");}
	System.out.println();
	System.out.println();
	
	int j = 1;
	while(j<11) {
		System.out.print(j+"\t");
		j++;
	}
	
	System.out.println();
	System.out.println();
	int k =1;
	do {//시작
		System.out.print(k+"\t");
		k++;
	}while(k<11);//끝. while 을 dowhile로 바꾸려면 조건을 밖으로 끄집어 내고 do를 앞에 붙여줌 
		//근데 왜바꿈? 

}
}
