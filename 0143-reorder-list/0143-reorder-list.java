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
        ArrayList <Integer> list = new ArrayList <>();
        ListNode curr = head ;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next ;
        }
        ArrayList <Integer> list2 = new ArrayList <>();
        int i =0;
        int j= list.size() -1;

        while( i <= j){
            if(i==j){
                list2.add(list.get(i));
                break;
            }
            else{
            list2.add(list.get(i));
            i++;
            list2.add(list.get(j));
            j--;
            }
        }

        curr = head ;
        int index =0;
        while(curr != null){
            curr.val = list2.get(index);
            index ++ ;
            curr = curr.next ;
        }


    }
}