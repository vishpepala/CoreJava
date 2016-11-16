package com.vish.batch2.inheritance;

public class Consumer {

	public static void main(String[] args) {
		Base base = new BaseImpl();
		//base.abc();
		int a = 10;
		base.display();
		
		for(int i =1; i<10 ; i++){
			System.out.print(i);
			if(i%3 == 0){
				System.out.println();
			}
		}
	}
}
