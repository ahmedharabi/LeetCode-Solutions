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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode beg=head;
        int i=1;
        //finding the first node
        while(i<k && beg!=null){
            beg=beg.next;
            i++;
        }
        //finding the second node
        ListNode end=head;
        ListNode top=beg;
        while(top.next!=null){
            top=top.next;
            end=end.next;
        }

        //switching vals;
        int aux=beg.val;
        beg.val=end.val;
        end.val=aux;
        return head;

    }
}