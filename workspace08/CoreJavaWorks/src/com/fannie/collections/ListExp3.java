package com.fannie.collections;
import java.util.Stack;

public class ListExp3 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		
		stack.push("java");
		stack.push("tastes");
		stack.push("good");

		System.out.println(stack);
		
		stack.push("i");
		stack.push("really");
		stack.push("like");
		stack.push("it");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		stack.remove(3);
		System.out.println(stack);
		
		stack.remove(0);
		System.out.println(stack);
		
		stack.push("java");
		System.out.println(stack);
		
		System.out.println(stack.size());
		System.out.println(stack.capacity());
		
		
	}
}
