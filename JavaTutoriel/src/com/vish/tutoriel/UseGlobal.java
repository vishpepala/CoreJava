package com.vish.tutoriel;

public class UseGlobal {

	public String myMethod(){
		MyVariables aVariable = new MyVariables();
		System.out.println(aVariable.name);
		
		return aVariable.name;
	}
	
	
	public void setAttr(String attr){
		System.out.println("Hello: " + attr);
	}
	
    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

	
	public static void main(String arg[]){
		        int twoDm[][]= new int[7][5];
		        int i,j,k=1;

		        for(i=0;i<7;i++) {
		            for(j=0;j<5;j++) {
		                twoDm[i][j]=k;
		                k++;
		            }
		        }

		        for(int[] row : twoDm) {
		            printRow(row);
		        }

	}
}
