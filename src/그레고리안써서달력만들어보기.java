import java.util.GregorianCalendar;
import java.util.Scanner;

//달력 만들기. 올것이왔따.
// 그 달의 1일이 무슨요일이냐. 그 달이 몇일까지냐 
//한줄에 7개씩 찍어서 보여주면된다. 
// 1번쨰 할일 그 달의 1일의 요일을 구한다. 
public class 그레고리안써서달력만들어보기 {
	static GregorianCalendar gc = new GregorianCalendar();

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Year : "); int y = sc.nextInt();
	System.out.print("Month : "); int m =sc.nextInt();
	
	int d = 1;
	int sum = 0;
	
	for(int i=1; i<y;i++ ) {
		if(gc.isLeapYear(i)) {
			sum+=366;	//i가 윤년이라면
		}else {
			sum+=365;	//i가 평년이라면 
		}
	}//여기서 먼저썻던 i는 사라졌다. 
	for(int i=0 ; i<(m-1) ; i++) {
		sum+=getLastDay(y,i); // 라스트데이를 리턴해줘서 28,29,30,31 중 하나를 돌려준다. 이걸 누적하는것. 
	}
	sum++;//월 마지막날 다음날. 
	switch(sum%7) {
	case 0: System.out.println("Sun"); break;
	case 1:System.out.println("Mon"); break;
	case 2:System.out.println("Tue"); break;
	case 3:System.out.println("Wen"); break;
	case 4:System.out.println("Thu"); break;
	case 5:System.out.println("Fri"); break;
	case 6:System.out.println("Sat"); break;
	}
	
}


// main과 별도로 월의 마지막날을 알려주는 메소드를 하나 만들어서 메인을 짧게좀유지하겠다. 
	// 메소드가 끝날 때 산출한 결과를 '반환' 해주는 명령이 있어야지 

static int getLastDay(int y , int m) { // 소문자 시작, 동사형, 메소드니까 중괄호 필요. 메소드(계산식)에 들어가는건 소괄호 안에   나오는 정보(결과)의 타입은 메소드 이름 앞에 변수이름은 위랑 같아도된다 main끝나면서 사라지는변수니까 
	//GregorianCalendar gc = new GregorianCalendar(); // 하나더 쓰지말고 그냥 스태틱변수로 만들자. 
	int lastDay = 0;
	boolean flag = gc.isLeapYear(y); //구지 불린 안하고 gc바로 넣어도된다. flag자리에 
	if (m == 1) { // 2월이라면
		if ( flag) { // if에는 그냥 불린 변수 넣으면된다. 참이면 앞에꺼 거짓이면 엘스뒤에꺼. 나온다 
			 lastDay=29;
		} else {
			lastDay=28;
		}
	} else if (m != 1) {// 2월이 아니라면
		if (m == 0 || m == 4 || m == 2 || m == 9 || m == 7 || m == 6 || m == 11) {
			lastDay=31;
		} else {
			lastDay=30;
		}
	}
	return lastDay;
}
// 그래고리안 달력 쓰면 0월부터 시작해서 오류가 생김 윤년계산기 수기로 타이핑하면 틀리진않는다. 그레고리안 쓰려면 m에 -1 해주면된다. 
}