
import javax.swing.JOptionPane;


public class Array {
	public static void main(String[] args) {
		/*
		String num1;
		int intNum1;
		num1 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum1 = Integer.parseInt(num1);
		String num2;
		int intNum2;
		num2 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum2 = Integer.parseInt(num2);
		String num3;
		int intNum3;
		num3 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum3 = Integer.parseInt(num3);
		String num4;
		int intNum4;
		num4 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum4 = Integer.parseInt(num4);
		String num5;
		int intNum5;
		num5 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum5 = Integer.parseInt(num5);
		String num6;
		int intNum6;
		num6 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum6 = Integer.parseInt(num6);
		String num7;
		int intNum7;
		num7 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum7 = Integer.parseInt(num7);
		String num8;
		int intNum8;
		num8 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum8 = Integer.parseInt(num8);
		String num9;
		int intNum9;
		num9 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum9 = Integer.parseInt(num9);
		String num10;
		int intNum10;
		num10 = JOptionPane.showInputDialog(null, "Enter a number.");
		intNum10 = Integer.parseInt(num10);
		int [] unsortedListReg = {intNum1, intNum2, intNum3, intNum4, intNum5, intNum6, intNum7, intNum8, intNum9, intNum10};
		*/
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