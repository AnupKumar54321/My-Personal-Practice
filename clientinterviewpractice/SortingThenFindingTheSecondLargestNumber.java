package clientinterviewpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingThenFindingTheSecondLargestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,34,2,3,9);
		Set<Integer> set = new HashSet<Integer>();
		int num = list.stream().filter(i->set.add(i)).sorted(Collections.reverseOrder()).toList().get(1);
		System.out.println(num);
	}

}
