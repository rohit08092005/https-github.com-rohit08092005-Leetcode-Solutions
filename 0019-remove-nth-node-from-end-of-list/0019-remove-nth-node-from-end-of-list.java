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
        
        ArrayList <ListNode> list = new ArrayList <>();
        ListNode curr = head ;

        while(curr != null){
            list.add(curr);
            curr =curr.next ;

        }
        int deleteIndex =list.size() - n;

        //deleting head
        if(deleteIndex == 0){
            return head.next ;
        }

        ListNode prev = list.get(deleteIndex -1);
        prev.next = prev.next.next ;

        return head ;
    }
}