//Runtime: 13 ms
//Memory Usage: 6.2 MB
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode *head=node,*temp;
    node=node->next;
    head->val=node->val;
    head->next=node->next;
}
