package clientinterviewpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonIntegerInTwoArray {
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5,6};
		Integer[] arr2 = {4,5,6,7,8,9};
		Set<Integer> set = new HashSet<Integer>();
		Arrays.stream(arr1).map(i->set.add(i)).collect(Collectors.toSet());
		//Set<Integer> set1 = new HashSet<Integer>();
		Stream.of(arr2).filter(i->!set.add(i)).forEach(i->System.out.println(i+"      "));
		
	}

}
