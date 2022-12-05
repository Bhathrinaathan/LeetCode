//This problem can be solved by saving them onto a arrayList and we can get the middle using index value
class SolutionOne{
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head);
            head=head.next;
        }
        int mid=arr.size()/2;
        return arr.get(mid);
    }
}
//The another approach is to take a single step and a double step in traversal
class SolutionTwo {
    public ListNode middleNode(ListNode head) {
        ListNode single=head;
        ListNode doub=head;
        while(doub!=null && doub.next!=null)
        {
            single=single.next;
            doub=doub.next.next;
        }
        return single;
    }
}
