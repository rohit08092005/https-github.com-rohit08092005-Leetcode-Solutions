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
    public boolean isPalindrome(ListNode head) {

        ArrayList list = new ArrayList <>();
        ListNode curr =head ;
        int index=0;
        while(curr != null){
            list.add(curr.val);
            curr =curr.next;
            index++;

        }
        int left = 0;
        int right =index -1;
        while(left < right){
            if(list.get(left) != list.get(right)){
                return false ;
            }
            left++;
            right--;
        }
        return true ;
    }
}