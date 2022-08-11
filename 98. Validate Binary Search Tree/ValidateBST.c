//Runtime: 11 ms , Memory Usage: 9 MB
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int values[100000],idx=0,flag=0;
bool traverseInorder(struct TreeNode* root)
{
    if (root!=NULL)
    {
        traverseInorder(root->left);
        values[idx]=root->val;
        if (idx>0 && values[idx]<=values[idx-1])
        {    
            flag=1;return;
        }
         idx++;
        traverseInorder(root->right);
    }
}
bool isValidBST(struct TreeNode* root)
{
    idx=0;
    flag=0;
    traverseInorder(root);
    if (flag==0)        
        return true;
    else    
        return false;
}
