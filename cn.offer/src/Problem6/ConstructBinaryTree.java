package Problem6;

import javax.management.RuntimeErrorException;

public class ConstructBinaryTree {
	public static void main(String[] args) {
		ConstructBinaryTree test = new ConstructBinaryTree();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		BinaryTreeNode node = test.ConstructBinaryTree(pre, in);
		test.printTree(node);
	}
	
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
		public BinaryTreeNode(int value) {
			this.value = value;
		}
	}
	
	public static BinaryTreeNode ConstructBinaryTree(int[] preOrder, int[] inOrder){
		if(preOrder==null||inOrder == null||preOrder.length!=inOrder.length){
			return null;
		}
		return Construct(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
		
	}

	private static BinaryTreeNode Construct(int[] preOrder, int ps, int pe,
			int[] inOrder, int is, int ie) {
		if(ps>pe)
			return null;
		int value = preOrder[ps];
		int index = is;
		while(index<=ie&&inOrder[index] != value){
			index++;
		}
		if(index > ie){
			throw new RuntimeException(" ‰»Î”–¥ÌŒÛ");
		}
		BinaryTreeNode node = new BinaryTreeNode(value);
		
	    node.left = Construct(preOrder, ps+1, ps+index-is, inOrder, is, index-1);
	    node.right = Construct(preOrder, pe+index-is+1, pe, inOrder, index+1, ie);
		return node;
	}
	
	private void printTree(BinaryTreeNode node){
		if(node!=null){
			printTree(node.left);
			System.out.println(node.value + " ");
			printTree(node.right);
		}
	}
}
