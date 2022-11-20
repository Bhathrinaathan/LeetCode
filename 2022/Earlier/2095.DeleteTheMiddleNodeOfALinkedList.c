/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteMiddle(struct ListNode* head){
    struct ListNode *temp=head,*t;
    int count=0;
    while(temp!=NULL){
        temp=temp->next;
        count++;
    }
    int mid=count/2,index=0;
    temp=head;
    if (count==1)
        return NULL;
    while(index<mid)
    {
        t=temp;
        temp=temp->next;
        index++;
    }
    t->next=temp->next;
    return head;
}
