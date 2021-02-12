package com.kh.method;

public class MethodEx4 {	
	public void start()
	{
		int arr[] = new int[] {10,20,30,40}; //레퍼런스는 가리키는 것 //주소가 담겨있음
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
		
		testMethod(arr); // 객체의 주소를 저장하고 있는 것을 주었다
		
		/* arr[0] = testMethod(arr[0]); 
		 * int a;
		 * 999; 이코드가  a=999;는 아니지   */
		
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
	}
	
	/*public void testMethod(int data)
	{
		data =999;
	} //call by value 값을 넘겨줌 공간을 넘겨준 것이 아님 //연산시 값을 가져올 뿐 //복사해서 넘겨줌
		역할이 다끝나도 원본에는 영향을 주지 않음
	 */	
	/*public int testMethod(int data)
	{
		data =999;
		return data; return ; 그냥 종료 if문 안에 있을수도 있음
		//호출위에 값이 돌아옴  바꾸려면 리턴을 하고 대입
	}*/
	public void testMethod(int[] data)
	{
		
		/*for(int i=0;i<data.length;i++)
		{
			data[i] = (111)*(i+1);
		}*/
		data[0] =111; // 주소는 원본에 영향을 준다 //리턴은 필요는 없음
		data[1] =222;
		data[2] =333;
		data[3] =444;
		//data[] = {99,100,200,300}; 한번에 쓸수는 없고 인덱스 번호를 넣어주거나 for문을 사용을 하거나
		//return data; 
		//호출위에 값이 돌아옴  바꾸려면 리턴을 하고 대입
	}
	
}
	
	
