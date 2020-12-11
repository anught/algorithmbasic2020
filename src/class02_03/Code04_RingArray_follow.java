package class02_03;

import java.security.PublicKey;


public class Code04_RingArray_follow {
    //数组实现队列
    public static class RingArray{
        private int total = 10;//队列总长度
        private int size = 0;//当前元素个数
        private int[] array = new int[total];
        private int head,tail=0;

        private int nextIndex(int idx){
            return idx >= total - 1 ? 0 : idx + 1;
        }

        public void push(int add) throws Exception{
            if(size < total){
                array[head] = add;
                head = nextIndex(head);
                size ++;
            } else {
                throw new Exception("full");
            }
        }

        public int pop() throws Exception {
            if(size == 0){
                throw new Exception("empty");
            }
            int curTail = tail;
            tail = nextIndex(tail);
            size -- ;
            return array[curTail];
        }
    }


    public static void main(String[] args) {
//        RingArray myqueue = new RingArray();
//        try {
//            myqueue.pop();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            myqueue.push(10);
//            myqueue.push(20);
//            myqueue.push(30);
//            myqueue.push(40);
//            myqueue.push(50);
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            myqueue.push(60);
//            myqueue.push(70);
//            myqueue.push(80);
//            System.out.println(myqueue.size + " " + myqueue.pop());
//
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//            System.out.println(myqueue.size + " " + myqueue.pop());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        MyStack ms = new MyStack(3);
        try {
            ms.push(6);
            ms.push(5);
            ms.push(4);
            ms.push(00);
            System.out.println(ms.pop());
            System.out.println(ms.pop());
            System.out.println(ms.pop());
            ms.push(54);
            ms.push(44);
            System.out.println(ms.pop());
            ms.push(94);
            System.out.println(ms.pop());
            System.out.println(ms.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    //数组实现栈
    public static class MyStack{
        int limit;
        int head = -1;
        int [] stack;
        public MyStack(int limit){
            this.limit = limit;
            stack = new int[limit];
        }

        public void push(int add) throws Exception {
            if(head + 1 <= limit){
                head ++;
                stack[head] = add;
            } else {
                throw new Exception("stack full");
            }
        }

        public int  pop() throws Exception {
            if(head < 0){
                throw new Exception("stack empty");
            } else {
                int ans = stack[head];
                head--;
                return ans;
            }
        }

    }

}
