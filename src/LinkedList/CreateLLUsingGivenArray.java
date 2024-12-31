package LinkedList;

public class CreateLLUsingGivenArray {


    static class Node{

        private int data;
        Node next;

        Node(int data){
            this.data=data;
        }

        public static Node insertAtEnd(Node root , int item ){
            Node temp=new Node(item);
            if(root==null){
                return temp;
            }
            Node last=root;
            while(last.next!=null){
                last=last.next;
            }
            last.next=temp;
            return root;
        }

        public  static Node arrayToList(int arr[]){

            Node root=null;
            for(int i=0;i<arr.length;i++){
                root=insertAtEnd(root,arr[i]);
            }
            return root;
        }
        public static void display(Node root) {
            while (root != null) {
                System.out.print(root.data + " ");
                root = root.next;
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={3,4,5,6};
        Node root=Node.arrayToList(arr);
        Node.display(root);
    }
}

