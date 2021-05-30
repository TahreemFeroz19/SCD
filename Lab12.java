package labs;
import java.util.Scanner;
public class Lab12 {
public static void main(String args[]) {
	int[] num= {2,4,6,1,9,7,3,11,45,32};
	System.out.println("Enter index of the array");
	Scanner in=new Scanner(System.in);
	try {
	int index=in.nextInt();
	System.out.println("Number in the array is: "+num[index]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bounds");
	}
}
}
