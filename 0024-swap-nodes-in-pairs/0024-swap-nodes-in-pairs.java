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
       ListNode curr =head ;
       ArrayList <Integer> list =new ArrayList <>();
       while(curr != null){
        list.add(curr.val);
        curr = curr.next;
       }
       
       for(int i=0;i<list.size()-1;i+=2){
        int temp = list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,temp);
       }
       curr=head;
       int index=0;

       while(curr != null){
        curr.val = list.get(index);
       index++;
        curr =curr.next ;
       }



       return head ;    

       
    }
}