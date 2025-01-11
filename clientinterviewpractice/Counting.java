package clientinterviewpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,98,78,1,2,3,4,5);
		Map<Integer,Long> map  = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		map.forEach((k,v)->{
			System.out.println(k+"--------"+v);
		});
	}

}
