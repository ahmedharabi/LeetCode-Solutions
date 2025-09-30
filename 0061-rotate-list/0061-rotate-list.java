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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;

        int n=1;
        ListNode oldTail=head;
        while(oldTail.next!=null){
            oldTail=oldTail.next;
            n++;
        }
        k=k%n;
        if(k==0)return head;

        //looking for the new tail;
        ListNode newTail=head;
        for(int i=0;i<n-k-1;i++){
            newTail=newTail.next;
        }

        oldTail.next=head;
        head=newTail.next;
        newTail.next=null;
        return head;
    }
}