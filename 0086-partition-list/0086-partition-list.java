
//  public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode s=new ListNode(0);
        ListNode h=new ListNode(0);
        ListNode sh=s,hh=h;
        while(head!=null){
            if(head.val<x){
                sh.next=head;
                sh=sh.next;
            }else{
                hh.next=head;
                hh=hh.next;
            }
            head=head.next;
        }
        hh.next=null;
        sh.next=h.next;
        return s.next;
    }
}