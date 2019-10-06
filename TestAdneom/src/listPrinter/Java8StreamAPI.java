package listPrinter;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Java8StreamAPI {
	
	final List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	final int size = 2;
	final AtomicInteger counter = new AtomicInteger();

	final Collection<List<Integer>> result = numbers.stream()
	    .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
	    .values();
	
	public Java8StreamAPI() {
		// TODO Auto-generated constructor stub
		System.out.println(result);
	}
	public String goodBy() {
		final String smile = "(-_-)";
		return smile;
	}

}
