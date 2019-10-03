package com.nishank.java8.lambdas.Filter;

import java.util.ArrayList;
import java.util.List;

public class Filtering<T> {

	public static <T>List<T> filter(List<T> input, Filter<T> filter){
		List<T> result = new ArrayList<T>();
		for(T t : input) {
			if(filter.filter(t))
				result.add(t);
		}
		return result;
	}
}
