package com.nishank.java8.lambdas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HelloLambda {
	
 public static void main(String[] args) {
	 System.out.println("Hello Lambda expression");
	 List<Integer> inputList = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,0));
		
		/*
		 * List<Integer> outputList = Filtering.filter(inputList, new Filter<Integer>()
		 * {
		 * 
		 * public boolean filter(Integer t) { return t%2 ==1; }
		 * 
		 * });
		 */
		 
	 inputList.removeIf(n->n%2!=1);
	 System.out.println(inputList);
 }

}
