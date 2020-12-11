package class02_03;

import java.util.Stack;

public class Code05_GetMinStack_follow {
    public static class GetMinStack{
        Stack<Integer>stackData = new Stack<Integer>();
        Stack<Integer>stackMin = new Stack<Integer>();

        public void push(Integer e){
            if(stackMin.empty()){
                stackMin.push(e);
            } else {
                if(getMin() > e){
                    stackMin.push(e);
                } else {
                    stackMin.push(getMin());
                }
            }

            stackData.push(e);
        }

        public Integer pop(){
            if(stackData.empty()){
                throw new RuntimeException("Your stack is empty.");
            }
            stackMin.pop();
            return stackData.pop();
        }

        public Integer getMin() {
            if(stackMin.empty()){
                throw new RuntimeException("Your stack is empty.");
            }
            return stackMin.peek();
        }

        public void  print(){
            System.out.println(stackMin.toString());
            System.out.println(stackData.toString());
        }
    }

    public static void main(String[] args) {
        GetMinStack gms = new GetMinStack();
        gms.push(10);
        System.out.println(gms.getMin());
        gms.push(5);
        System.out.println(gms.getMin());
        gms.push(18);
        System.out.println(gms.getMin());
        gms.push(13);
        System.out.println(gms.getMin());

        gms.push(4);
        System.out.println(gms.getMin());

        gms.push(8);
        System.out.println(gms.getMin());
        gms.print();

    }
}
