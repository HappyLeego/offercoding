package Problem7;

import java.util.Stack;

public class ConStructQueue {
    /*
     * ����������������ջʵ��һ�����С����е��������£���ʵ��������������appendTail��deleteHead,
     * �ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ���
     */

    /**
     * @param args
     */
    Stack<String> stack1 = new Stack<String>();
    Stack<String> stack2 = new Stack<String>();

    // ʵ��appendTail����
    public void appendTail(String s) {
        stack1.push(s);
    }

    // ʵ��deleteHead����
    public String deleteHead() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new Exception("����Ϊ�գ����ܽ���ɾ������");
        }
        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        ConStructQueue test = new ConStructQueue();
        // ��յĶ��������Ԫ�ء�ɾ��Ԫ��
        test.appendTail("1");
        System.out.println(test.deleteHead());
        // ��ǿյĶ������ɾ��Ԫ��
        test.appendTail("2");
        test.appendTail("3");
        System.out.println(test.deleteHead());

    }

}