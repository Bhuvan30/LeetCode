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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode mp=head;
        ListNode rp=head;
        ListNode d=new ListNode(-1);
        int count=1;
        while(count<=n){
            rp=rp.next;
            count++;
        }
        while(rp!=null){
            rp=rp.next;
            d=mp;
            mp=mp.next;
        }
        d.next=mp.next;
        if(d.val==-1)return d.next;
        return head;
    }
}