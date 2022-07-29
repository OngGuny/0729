
public class ArrayDemo {
public static void main(String[] args) {
//	int a; //Declaration(선언) int타입 값변수 정수의 값 하나를지정하겠습니다. 
//	a=10;//Assignment
//	int b= 5;//Initialization  성격,크기,구조 똑같은 애들만 모은게 array
//	
//	int [] array; //Declaration []가 들어가서 주소 . 정수 들의 값의 주소를 저장하겠습니다.
//	array= new int[4];				//객체니? new 어떤타입이니? int 몇개들엇니? []
//
//	int [] array1 = {1,2,3,4};	// 윗 2줄을 한줄로 
//	//array앞에 타입 적어주는이유 : 어레이는 주소. 거기서부터 몇 바이트짜리 방이 몇개 있는지. int 는 4바이트 짜리 방이 [몇개] 있는지. char 은 2바이트짜리 방이 []몇개 있는지 
	// 클래스를 타입으로 줘도된다. 
	
	//배열을 만들고 값을 주고 초기화하는방법 
//1st way FM
//	int [] array ; //선언
//	array = new int[4]; //방이 4개야 
//	array [0]= 4;array [1]= 2;	//각방에 값 넣어줌 위에서는 변수자체에 할당한거고. a=10이라고 
//	array [2]= 9;	array [3]= 5;

	//2nd way  첫째 방법은 방이 많으면 힘들다 
	//1의 2번쨰와 3,4번쨰 줄을 합친다. 
//int []array ;
//	array = new int[] {4,2,9,5}; //방 개수 썻다가 오류날까봐 개수 안쓰고 그냥 안에 들어갈 값만 써줌 

	
	// 3rd way 2번째도 2줄이다 걍 한줄로
	// int [] array = {4,2,9,5}; // 이건되는데 
//	int [] array;
//	array = {4,2,9,5}; //이렇게는 안됨. 즉 위에는 방만들고 값을 자유롭게 지정 할 수 있는데 여기는 넣으면 못바꿈 
	
	//근데 이게 치명적 오류가 있다. 줄 하나에 선언과 할당을 동시에 하는게 초기화 
	// 이건 초기화가 안됨 

	
	// example
// way 1 
//	double [] array;
//	array = new double[3];
//	array[0]=67.9;
//	array[2]=43.7;
//	array[1]=56.2;

	
	// way 2
//	double [] array;
//	array = new double[] {67.9 , 43.7 , 56.2};
	
//way3	
//	double [] array = {67.9 , 43.7 , 56.2};
	
// 이번엔 char값을 넣어보자 
	
	//way 1 
//	char[] array;
//	array = new char[5];
//		array[0]='A'
//		array[1]='C'
//		array[2]='B'
//		array[3]='F'
//		array[4]='A'
		

	// way2 
//	char [] array;
//	array = new char[] {'A','C','B','F','A'};
//	
	
	//way 3
//	char[] array = {'A','C','B','F','A'};
	
	//예제 : 3명의 정규직 여부만 알아보자 

	//way1
	//	boolean [] array;
//	array = new boolean[3];
//	array[0]=true;
//	array[1]=false;
//	array[2]=false;
//	

	//way2
//	boolean [] array;
//	array = new boolean[] {true,false,false};
//	
	
	//way3 
	//boolean[] array= {true,false,false}; 
	

	//출력한번해보자 string 담주에 
	
	boolean[]array= {true,false,false};
	for(int i=0 ; i<3; i++) {
		System.out.println("array["+ i + "]"+array[i]);
	}
	
	
	
	
	// 8가지 변수타입 다해봤으니 이제 string 

	
	
	
	
	
	
	
	
	
//	//way1 
//	String[] array;
//	array = new String[4];
//	array[0]="한지민"; 
//	array[1]="박지민"; 
//	array[2]="헨리"; 
//	array[3]="미쳴잭슨"; 
	//주소는 4바이트로 일정하다 글자 수가 다 달라도 저 이름들이 저장되어있는곳의 주소를 가져오는 것 크기는 같다. 4바이트로 
	//객체 배열은 주소를 저장하니까. reference 타입 변수는. 주소를 저장 
}

}
