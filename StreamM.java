package streamJ8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamM {
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(2, 3, 5, 6, 10, 25, 7, 12, 12, 43);

		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(56);
		list2.add(8);
		
		System.out.println(list2);

		List<Integer> list3 = Arrays.asList(2,3,45,6,7,6);
		
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i:list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(listEven);
		
		//using stream
		Stream<Integer> stream = list1.stream();
		
//		List<Integer> list5 = stream.filter(e->e%2==0).collect(Collectors.toList());
		
		List<Integer> list5 = stream.filter(e->e>10).collect(Collectors.toList());

		
		System.out.println(list5);
		
		Stream<Object> emptyStream = Stream.empty();
		
		String onj[] = {"rishee","awug","wiufic","chjvc"};
		
		Stream<String> str = Stream.of(onj);
		
		//using lambda in forEach
		
		str.forEach(e->{
			System.out.println(e);
		});
			
		//using builder
		
		Stream<Object> str1 = Stream.builder().build();
		
		//putting obj[] array directly into stream in one line
		//IntStream in used for this
		
		IntStream stream1 = Arrays.stream(new int[]{3,5,2,65,7,1,8});
		
		stream1.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------");
		List<Integer> list11 = new ArrayList<>();
		list11.add(12);
		list11.add(56);
		list11.add(8);
		
		Stream<Integer> stre = list11.stream();
		stre.forEach(e->{
			System.out.println(e);
		});
		
	}

}
