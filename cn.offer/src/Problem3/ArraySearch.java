package Problem3;

public class ArraySearch {
	
	public static boolean find(int arr[][],int keyValue){
		int column = arr.length-1;
		int row = 0;
		while(column>=0 && row<arr.length){
			if(arr[row][column] == keyValue){
				return true;
			}
			if(arr[row][column] > keyValue){
				column--;
			}
			else{
				row++;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		array[0][0] = 1;
		array[0][1]=2;
	    array[0][2]=8;
	    array[0][3]=9;
	    array[1][0]=2;
	    array[1][1]=4;
	    array[1][2]=9;
	    array[1][3]=12;
	    array[2][0]=4;
	    array[2][1]=7;
	    array[2][2]=10;
	    array[2][3]=13;
	    array[3][0]=6;
	    array[3][1]=8;
	    array[3][2]=11;
	    array[3][3]=15;
	    System.out.println(find(array,7));
	    System.out.println(find(array,5));
	}
}

