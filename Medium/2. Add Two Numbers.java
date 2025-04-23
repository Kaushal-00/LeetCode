class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            carry = 0;

            if(l1 != null) {
                sum = sum + l1.val + carry;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum = sum + l2.val + carry;
                l2 = l2.next;
            }

            if(sum < 10) {
                temp.next = new ListNode(sum);
                temp = temp.next;
            } else {
                temp.next = new ListNode(sum % 10);
                carry = sum / 10;
                temp = temp.next;
            }
        }

        return result.next;
    }
}