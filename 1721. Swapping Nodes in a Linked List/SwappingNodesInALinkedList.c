//This Code doesn't contain the skeleton code. Only consists of logically required code.   :)
//Runtime: 232 ms
//Memory Usage: 48.9 MB

struct ListNode* swapNodes(struct ListNode* head, int k)
{
    int count=1,index=0;
    struct ListNode* temp=head;
    while (temp!=NULL)
    {
        temp=temp->next;
        count++;
    }
    int arr[count];temp=head;
    while(temp!=NULL)
    {
        arr[index++]=temp->val;
        temp=temp->next;
    }
    int rev=count-k - 1;
    index=arr[k-1];
    arr[k-1]=arr[rev];
    arr[rev]=index;index=0;temp=head;
    while(temp!=NULL)
    {
        temp->val=arr[index++];
        temp=temp->next;
    }
    return head;
}
