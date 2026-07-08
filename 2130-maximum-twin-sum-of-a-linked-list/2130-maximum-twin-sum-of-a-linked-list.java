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
    public int pairSum(ListNode head) {
        ArrayList <Integer> list = new ArrayList <>();
        ListNode curr =head ;
        int index =0;
        while(curr != null){
            list.add(curr.val);
            curr =curr.next ;
            index++;
        }

        int left =0;
        int right = index -1;
        int sum =0;
        while(left < right){
            int L =list.get(left);
            int R =list.get(right);
            int currsum = L + R;
             sum = Math.max(sum,currsum);
             left++;
             right--;

        }
        return sum ;
    }
}