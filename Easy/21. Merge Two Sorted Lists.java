class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode temp = list3;

        while (list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;

                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;

                temp = temp.next;                
            }
            
        }

        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;

            temp  = temp.next;
        }

        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;

            temp  = temp.next;
        }

        return list3.next;
    }
}