// This file doesn't contain Main function. It carries only the required logical part :)
// Runtime: 12 ms, Memory Usage: 7.8 MB
#include<stdio.h>
#include<stdlib.h>
struct ListNode *head = NULL,*temp;

struct ListNode* CreateNode(int val)
{
    struct ListNode *newNode=malloc(sizeof(struct ListNode));
    newNode->next=NULL;
    newNode->val=val;
    return newNode;
}
void InsertNode(int val)
{
    if (head==NULL)
    {
        head=CreateNode(val);
        temp=head;
    }
    else
    { 
        temp->next=CreateNode(val);
        temp=temp->next;
    }
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{    
    struct ListNode *ex=NULL;
    head=NULL;
    temp=NULL;
    int carry=0,sum=0,v1,v2;
    while(l1!=NULL || l2!=NULL)
    {
        v1=(l1!=NULL)?l1->val:0;
        v2=(l2!=NULL)?l2->val:0;
        sum=v1 + v2 + carry;
        carry=(sum>=10)?1:0;
        sum=(sum>=10)?sum%10:sum;
        l1=(l1!=NULL)?l1->next:NULL;
        l2=(l2!=NULL)?l2->next:NULL;
        InsertNode(sum);
    }
    
    if (carry>0)
        InsertNode(1);
    return head;
}
