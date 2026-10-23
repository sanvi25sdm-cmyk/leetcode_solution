class Solution {
    public ListNode reverseList(ListNode head) {
       
       int count = 0;
       ListNode temp = head;

       while(temp != null){
        temp = temp.next;
        count++;
       }
       int[] array = new int[count];

       temp = head;

       int i = count-1;

        while(temp != null){
            array[i] = temp.val;
            i--;
            temp = temp.next;

       }


       temp = head;
        i = 0;

       while(temp != null){
        temp.val = array[i];
        i++;
        temp = temp.next;

       }
       return head;
    }
}