package pack1;

public class SingleDimentionalArray {
	
	//Two Types:
	//1. Single Dimensional Array
	//2. Multi Dimensional Array

	public static void main(String[] args) {
		//Declare and Instantiate
		//datatype arr_name[]=new datatype[size];
		//datatype []arr_name=new datatype[size];
		int arr[]=new int[5];
		arr[0]=5;//Initialize
		arr[1]=3;
		arr[2]=4;
		arr[3]=7;
		arr[4]=45;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//Declare,Initialize,Instantiate
		int arr_val[]= {12,34,23,43,4};
		for(int i=0;i<=4;i++) {
			System.out.println(arr_val[i]);
		}
		
	}

}
