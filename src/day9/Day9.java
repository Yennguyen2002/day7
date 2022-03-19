package day9;
import java.util.Arrays;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15,12,3,2,4,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // sap xep arrr
		int index = Arrays.binarySearch(arr, 3); // tim kiem index =(chi muc) cua 1 so
		System.out.println(index);
		Arrays.fill(arr, 25); // gan cung mot gia tri cho tat ca phan tu trong mang
		System.out.println(Arrays.toString(arr));
		
		int [][]arr3 = new int[2][];
		arr3[0] =new int [4];
		arr3[0][0] = 3;
		arr3[0][1] = 5;
		arr3[0][2] = 9;
		arr3[0][3] = 9;
		arr3[1] = new int[3];
		arr3[1][0] = 6;
		arr3[1][1] = 46;
		arr3[1][2] = 1;
		
		for(int i=0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3[i].length; j++)
			{
				System.out.println(arr3[i][j]+ " ");
			}
				
		}
		
		System.out.println("------");
		int [][]arr4 = {{3,5,6,7},{6,7,8}};
		for(int i =0; i < arr4.length; i++)
		{
			for(int j = 0; j < arr4[i].length;j++)
			{
				System.out.println(arr4[i][j]+ " ");
			}
			System.out.println("------");
		}

	}

}
