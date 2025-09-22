/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=new ListNode(0,head);
        ListNode prev=head;
        ListNode curr=head.next;
        head=head.next;
        while(prev!=null && curr!=null){
            System.out.println("hello");
            prev.next=curr.next;
            curr.next=prev;
            dummy.next=curr;
            dummy=prev;

            prev=prev.next;
            if(prev!=null)curr=prev.next;
            
        }
        return head;
    }
}