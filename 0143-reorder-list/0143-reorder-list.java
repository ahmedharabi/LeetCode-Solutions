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
    public void reorderList(ListNode head) {
        Deque<ListNode>dq=new LinkedList<>();
        ListNode temp=head;
        while(temp!=null){
            dq.addLast(temp);
            temp=temp.next;
        }
        ListNode head2=new ListNode(0,null);
        temp=head2;
        while(dq.size()>0){
            temp.next=dq.getFirst();
            temp=temp.next;
            temp.next=dq.getLast();
            temp=temp.next;
            dq.pollFirst();
            dq.pollLast();
            
        }temp.next=null;
        head=head2.next;;
    }
}