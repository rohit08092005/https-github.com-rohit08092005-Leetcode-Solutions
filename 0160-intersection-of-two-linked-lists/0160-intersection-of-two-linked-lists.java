/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
    int lengthA = 0;
    int lengthB = 0;
    ListNode currA =headA ;
    ListNode currB =headB ;

    while(currA != null){
        lengthA ++ ;
        currA = currA.next ;
    }

    while(currB != null){
        lengthB ++ ;
        currB = currB.next ;
    }
    currA = headA;
    currB = headB ;

    while(lengthA > lengthB){
        currA = currA.next ;
        lengthA -- ;
    }

    while(lengthA < lengthB ){
        currB = currB.next ;
        lengthB -- ;
    }

    while( currA != null && currB != null ){
        if(currA == currB){
            return currA ;
        }
        currA = currA.next;
        currB =currB.next ;

    }

return null ;

    }

}
