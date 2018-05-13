package Problem8;

public class Quick {
	private static void swap(int[] array, int a, int b) {
		if(a!=b){
			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
	}

	
	private static int partition(int[] array, int low, int high) {
		int base = array[low];
		while(low<high){
			while(low<high && array[high]>=base){
				high--;
			}
			swap(array,low,high);
			while(low<high && array[low]<=base){
				low++;
			}
			swap(array,low,high);
		}
		return low;
	}

	


	private static int[] quickSort(int[] array, int low, int high) {
		if(low < high){
			int division = partition(array,low,high);
			quickSort(array, low, division-1);
			quickSort(array, division+1, high);
		}
		return array;
	}
	
	
	public static int[] sort(int[] array){
		return quickSort(array,0,array.length-1);
	}
	
	public static void main(String[] args) {
		int[] array = {3,5,1,6,4};
		int[] sorted = sort(array);
		for(int i:sorted){
			System.out.print(i+" "); //空格代表一个空格的字符串，而不是字符，所以不能用单引号
		}
	}
}
