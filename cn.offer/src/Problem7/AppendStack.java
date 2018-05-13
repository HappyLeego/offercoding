package Problem7;

import java.util.Stack;

public class AppendStack {
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	public void appendStack(String s){
		stack1.push(s);
	}
	
	public String DeleteHead() throws Exception {
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){   //需要使用while循环将栈1中的元素全部都弹出到栈2
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("队列为空，不能进行操作...");
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) throws Exception {
		AppendStack test = new AppendStack();
		test.appendStack("a");
	    System.out.println(test.DeleteHead());
	
		test.appendStack("b");
		test.appendStack("c");

	    System.out.println(test.DeleteHead());
		
	}
}
