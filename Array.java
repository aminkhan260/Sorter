
import javax.swing.JOptionPane;


public class Array {
	public static void main(String[] args) {
		
	}

	public static int[] unsortedList(int[]unsortedListReg) {
		return unsortedListReg;

	}

	public static int SelectionSort(int[]unsortedList) {
		int index=0;

		for(index = 0; index<unsortedList.length -1; index++){
		int indexOfNextSmallest = getIndexOfSmallest(index, unsortedList);
		interchange(index, indexOfNextSmallest, unsortedList);	
		}
		return index;
	}
	public static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for(int index = startIndex + 1; index< a.length; index++) {
			if(a[index] < min) {
				min = a[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;

	}
	private static void interchange(int i,int j,int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
}
