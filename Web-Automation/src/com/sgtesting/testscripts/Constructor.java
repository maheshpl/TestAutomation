package com.sgtesting.testscripts;

public class Constructor {
	
	Constructor(int a,int b)
	{
		int res=0;
		res=a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		 Constructor ob=new  Constructor(10,20);

	}

}
