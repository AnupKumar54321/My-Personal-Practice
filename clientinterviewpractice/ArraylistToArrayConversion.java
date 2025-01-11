package clientinterviewpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArrayConversion {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(98);
		Integer[] arr = list.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
	}

}
