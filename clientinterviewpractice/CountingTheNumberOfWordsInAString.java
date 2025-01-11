package clientinterviewpractice;

import java.util.stream.Stream;

public class CountingTheNumberOfWordsInAString {
	public static void main(String[] args) {
		String str = "Anup Kumar Sahoo";
		Long count = Stream.of(str.split(" ")).filter(i->i.charAt(i)==" " && str.charAt(i+1) != " ").count()+1;
	}

}
