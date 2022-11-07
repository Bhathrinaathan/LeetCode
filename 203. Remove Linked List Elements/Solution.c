struct ListNode* removeElements(struct ListNode* head, int val){
        if (head==NULL)
            return head;
        head->next=removeElements(head->next,val);
        if (head->val==val)
            head=head->next;
        return head;
}
