package stack;

class Stack{

    StackNode root;

    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        else
        {
            return  false;
        }
    }
    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.el;
        }
    }

    public void push(int el){

        StackNode newNode=new StackNode(el);
        if(root==null){
            root=newNode;
        }else{
            StackNode temp=root;
            root=newNode;
            root.next=temp;
        }
        System.out.println(el+"pushed to stack");
    }
    public int pop()
    {
        int popped=Integer.MIN_VALUE;
        if(root==null){
            System.out.println("Stack is empty");
        }else{
            popped=root.el;
            root=root.next;
        }
        return popped;
    }
    int minElem(){
        return 0;
    }
    static class StackNode {
         int el;
         StackNode next;

         StackNode(int data){
             this.el=data;
         }
    }
}


public class StackOps {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(20);
        st.push(1);
        st.push(34);

        System.out.println(st.pop()+"popped from stack");

        System.out.println("Top : "+st.peek());
    }
}
