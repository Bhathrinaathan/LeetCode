// This file doesn't contain Main function. It carries only the required logical part :)
// Runtime: 6 ms , Memory Usage: 6.2 MB
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode *l1,*l2,*min;
    l1=list1;
    if (l1!=NULL)
    {
        while (l1!=NULL && l1->next!=NULL)
            l1=l1->next;
        l1->next=list2;
        l1=list1;
    }
    while (l1!=NULL)
    {
        min=l1;
        l2=l1;
        while(l2!=NULL)
        {
            if (min->val > l2->val)
                min=l2;
            l2=l2->next;
        }
        int temp=min->val;
        min->val=l1->val;
        l1->val=temp;
        l1=l1->next;
    }
    l1=list1;
    while(l1!=NULL)
    {
        printf("%d ",l1->val);
        l1=l1->next;
    }
    return (list1==NULL)?list2:list1;
}
