package recursion;


/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.   Use recursion
 */
public class SumOfTwoLinkedLists {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return addTwoNumbersRecursive(l1,l2,0);
    }

    private static ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry) {

        //base case
        if(l1==null  && l2==null && carry==0){
            return null;
        }

        int val1=(l1!=null) ? l1.val:0;
        int val2=(l2!=null) ?l2.val:0;

        int sum=val1+val2+carry;
        carry=sum/10;
        int digit=sum%10;

        ListNode currentNode=new ListNode(digit);
        currentNode.next=addTwoNumbersRecursive((l1!=null)? l1.next:null,(l2!=null)?l2.next:null,carry);
        return currentNode;
    }

    public static void main(String[] args) {

        ListNode l1=new ListNode(2);
        l1.next=new ListNode(5);
        l1.next.next=new ListNode(8);

        ListNode l2=new ListNode(2);
        l2.next=new ListNode(5);
        l2.next.next=new ListNode(8);

        System.out.println("Numbers are : "+addTwoNumbers(l1,l2));
    }

}


class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
      this.val=x;
    }
}