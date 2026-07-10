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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2 ;
        ArrayList <Integer> arr1 = new ArrayList <>();
        ArrayList <Integer> arr2 = new ArrayList <>();
        while(curr1 !=null){
            arr1.add(curr1.val);
            curr1=curr1.next;
        }
        while(curr2 != null){
            arr2.add(curr2.val);
                curr2 = curr2.next;
            }

        int i=0;
        int j=0;
        int idx =0;
        ArrayList <Integer> list = new ArrayList <>();
        while(i<arr1.size() && j<arr2.size()){

            if(arr1.get(i) <= arr2.get(j)){
                list.add(arr1.get(i));
                idx++;
                i++;
            }
            else{
                list.add(arr2.get(j));
                idx++;
                j++;
            }


        }
        while(i<arr1.size()){
            list.add(arr1.get(i));
            i++;
            idx++;
        }

        while( j<arr2.size()){
            list.add(arr2.get(j));
            j++;
            idx++;

        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy ;
        for(int k=0;k<list.size();k++){
            curr.next =new ListNode(list.get(k));
            curr = curr.next;
        }
return dummy.next ;
        }

    }
