
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //note: carry = sum/10
        //size of new LinkedList = sum%10

        //solution
        return helper(l1, l2, 0);

    }
    public ListNode helper(ListNode l1, ListNode l2, int carry){
        //base case
        if(l1==null && l2==null && carry==0){
            if(carry==0) return null;
            else return new ListNode(1);
        }

        //find sum
        int sum = ((l1==null?0:l1.val)+(l2==null?0:l2.val))+carry;

        //new ListNode
        ListNode newNode = new ListNode(sum%10);
        //add to new LinkedList
        newNode.next = helper(l1==null?null:l1.next, l2==null?null:l2.next, sum/10);

        return newNode;
    }
}
