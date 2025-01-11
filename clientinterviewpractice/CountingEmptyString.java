package clientinterviewpractice;

import java.util.Arrays;
import java.util.List;

public class CountingEmptyString {
	public static void main(String[] args) {
		//Trim method
		String str = "        Anup Kumar          ";
		String str2 = str.trim();
		System.out.println(str2);
		List<String> list = Arrays.asList("Anup","Pikun","Jena","Suraj","","","Sahoo","","","");
		long count = list.stream().filter(i->i.isEmpty()).count();
		System.out.println(count);
	}

}
