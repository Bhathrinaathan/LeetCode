// This file doesn't contain Main function. It carries only the required logical part :)
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
    int carry=0,sum=0,flag=0;
    if (l1->val==0 && l2->val==0)
        return l1;
    while(l1!=NULL && l2!=NULL)
    {
        sum=l1->val + l2->val + carry;
        carry=(sum>=10)?1:0;
        l1=l1->next;
        l2=l2->next;
        InsertNode(sum%10);
    }
    if (l1==NULL && l2!=NULL){
        ex=l2;flag=1;}
    else if(l2==NULL && l1!=NULL){
        ex=l1;flag=1;}
    if (flag==1)
    {
        while(ex!=NULL)
        {
            sum=ex->val + carry;
            carry=(sum>=10)?1:0;
            InsertNode(sum%10);
            ex=ex->next;
        }
    }
    if (carry>0)
        InsertNode(carry);
    return head;
}
