package Problem8;

public class Quick1 {
	 
	 private static int mark = 0;
	 
	 /**
	  * ������������
	  * 
	  * @param array
	  * @param a
	  * @param b
	  */
	 private static void swap(int[] array, int a, int b) {
	  if (a != b) {
	   int temp = array[a];
	   array[a] = array[b];
	   array[b] = temp;
	   // �ҵ����ϵģ��Ե�
	   System.out.println("�Ե�" + array[a] + "��" + array[b] + ",�õ�");
	   for (int i : array) {
	    System.out.print(i + " ");
	   }
	   System.out.println();
	  }
	 }
	 
	 /**
	  * ��һ�ַָ�
	  * 
	  * @param array
	  * @param low
	  * @param high
	  * @return
	  */
	 private static int partition(int array[], int low, int high) {
	  int base = array[low];
	  mark++;
	  System.out.println("���ڽ��е�" + mark + "�ַָ�������" + low + "-" + high);
	  while (low < high) {
	   while (low < high && array[high] >= base) {
	    high--;
	    System.out.println("���������ұ�" + base + "С�ģ�ָ��䶯��" + low + "-" + high);
	   }
	   swap(array, low, high);
	   while (low < high && array[low] <= base) {
	    low++;
	    System.out.println("���������ұ�" + base + "��ģ�ָ��䶯��" + low + "-" + high);
	   }
	   swap(array, low, high);
	  }
	  return low;
	 }
	 
	 /**
	  * ��������п������򣬵ݹ����
	  * 
	  * @param array
	  * @param low
	  * @param heigh
	  * @return
	  */
	 private static int[] quickSort(int[] array, int low, int heigh) {
	  if (low < heigh) {
	   int division = partition(array, low, heigh);
	   quickSort(array, low, division - 1);
	   quickSort(array, division + 1, heigh);
	  }
	  return array;
	 }
	 
	 /**
	  * ������
	  * 
	  * @param array
	  * @return
	  */
	 public static int[] sort(int[] array) {
	  return quickSort(array, 0, array.length - 1);
	 }
	 
	 public static void main(String[] args) {
	  int[] array = { 3, 5, 2, 6, 2 };
	  int[] sorted = sort(array);
	  System.out.println("���ս��");
	  for (int i : sorted) {
	   System.out.print(i + " ");
	  }
	 }
	 
	}

