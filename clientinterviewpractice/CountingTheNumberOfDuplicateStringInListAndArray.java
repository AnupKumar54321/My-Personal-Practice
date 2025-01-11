package clientinterviewpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountingTheNumberOfDuplicateStringInListAndArray {
	public static void main(String[] args) {
		String[] str = {"Anup","pinku","","","","Pratik","Jena","Bishal","",""};
		long count = Stream.of(str).filter(i->i.isEmpty()).count();
		System.out.println(count);
		
		List<String> list = Arrays.asList("Anup","pinku","","","","Pratik","Jena","Bishal","","","","");
		long count1 = list.stream().filter(i->i.isEmpty()).count();
		System.out.println(count1);
	}

}
