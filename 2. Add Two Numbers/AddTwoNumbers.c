// This file doesn't contain Main function. It carries only the required logical part :)
#include<stdio.h>
#include<stdlib.h>
struct ListNode *head = NULL;
struct ListNode* CreateNode(int val)
{
    struct ListNode *newNode=malloc(sizeof(struct ListNode));
    newNode->next=NULL;
    newNode->val=val;
    return newNode;
}
int Num=0;

void findNumber(struct ListNode* l)
{
    if (l->next!=NULL)
        findNumber(l->next);
    Num=Num*10 + l->val;
}

void formList(int N)
{
    struct ListNode *sum=NULL,*temp;
    while (N>0)
    {
        sum=CreateNode(N%10);
        if (head==NULL)
        {
            sum->next=NULL;
            head=sum;
        }
        else
        {
            temp=head;
            while(temp->next!=NULL)
                    temp=temp->next;
            sum->next=temp->next;
            temp->next=sum;
        }
        N/=10;
    }
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{    
    struct ListNode *new=NULL;
    findNumber(l1);
    int num1=Num;Num=0;
    findNumber(l2);num1+=Num;
    formList(num1);
    struct ListNode* temp=head;
    return head;
}
