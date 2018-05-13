package Problem7;

import java.util.Stack;

public class ConStructQueue {
    /*
     * 问题描述：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead,
     * 分别完成在队列尾部插入结点和在队列头部删除结点的功能
     */

    /**
     * @param args
     */
    Stack<String> stack1 = new Stack<String>();
    Stack<String> stack2 = new Stack<String>();

    // 实现appendTail函数
    public void appendTail(String s) {
        stack1.push(s);
    }

    // 实现deleteHead函数
    public String deleteHead() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new Exception("队列为空，不能进行删除操作");
        }
        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        ConStructQueue test = new ConStructQueue();
        // 向空的队列中添加元素、删除元素
        test.appendTail("1");
        System.out.println(test.deleteHead());
        // 向非空的队列添加删除元素
        test.appendTail("2");
        test.appendTail("3");
        System.out.println(test.deleteHead());

    }

}