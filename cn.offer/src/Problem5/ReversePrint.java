package Problem5;

import java.util.Stack;

class LinkNode{
	LinkNode next;
	int nodevalue;
}

public class ReversePrint {
	public void PrintReverse(LinkNode firstnode){
		Stack<LinkNode> stack = new Stack<LinkNode>();
		while(firstnode!=null){
			stack.push(firstnode);
			firstnode = firstnode.next;
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop().nodevalue +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ReversePrint r = new ReversePrint();
		LinkNode node1 = new LinkNode();
		LinkNode node2 = new LinkNode();
		LinkNode node3 = new LinkNode();
		node1.nodevalue = 1;
		node2.nodevalue = 2;
		node3.nodevalue = 3;
		node1.next = node2;
		node2.next = node3;
		r.PrintReverse(node1);
	}

}
