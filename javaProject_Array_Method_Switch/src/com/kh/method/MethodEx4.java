package com.kh.method;

public class MethodEx4 {	
	public void start()
	{
		int arr[] = new int[] {10,20,30,40}; //���۷����� ����Ű�� �� //�ּҰ� �������
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
		
		testMethod(arr); // ��ü�� �ּҸ� �����ϰ� �ִ� ���� �־���
		
		/* arr[0] = testMethod(arr[0]); 
		 * int a;
		 * 999; ���ڵ尡  a=999;�� �ƴ���   */
		
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
	}
	
	/*public void testMethod(int data)
	{
		data =999;
	} //call by value ���� �Ѱ��� ������ �Ѱ��� ���� �ƴ� //����� ���� ������ �� //�����ؼ� �Ѱ���
		������ �ٳ����� �������� ������ ���� ����
	 */	
	/*public int testMethod(int data)
	{
		data =999;
		return data; return ; �׳� ���� if�� �ȿ� �������� ����
		//ȣ������ ���� ���ƿ�  �ٲٷ��� ������ �ϰ� ����
	}*/
	public void testMethod(int[] data)
	{
		
		/*for(int i=0;i<data.length;i++)
		{
			data[i] = (111)*(i+1);
		}*/
		data[0] =111; // �ּҴ� ������ ������ �ش� //������ �ʿ�� ����
		data[1] =222;
		data[2] =333;
		data[3] =444;
		//data[] = {99,100,200,300}; �ѹ��� ������ ���� �ε��� ��ȣ�� �־��ְų� for���� ����� �ϰų�
		//return data; 
		//ȣ������ ���� ���ƿ�  �ٲٷ��� ������ �ϰ� ����
	}
	
}
	
	
