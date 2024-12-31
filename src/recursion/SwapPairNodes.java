package recursion;


public class SwapPairNodes {

    public static void main(String[] args) {

        MyNode x=new MyNode(4);
        x.next=new MyNode(41);
        x.next.next=new MyNode(23);
        x.next.next.next=new MyNode(1);
        pairSwap(x);
        display(x);


    }

    public static void display(MyNode head){

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void pairSwap(MyNode head){

        if(head!=null  && head.next!=null){

            int temp=head.val;
            head.val=head.next.val;
            head.next.val=temp;

            pairSwap(head.next.next);
        }
    }
}

class MyNode{
    int val;
    MyNode next;
    MyNode(int val){
        this.val=val;
    }
}

