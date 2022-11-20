char s[100000];
void preorderTraversal(struct TreeNode* root)
{
    if (root!=NULL)
    {
        char num[5];
        sprintf(num,"%d",root->val);
        strcat(s,num);
        if (root->left!=NULL){
            strcat(s,"(");
            preorderTraversal(root->left);
            strcat(s,")");
        }
        else if (root->right!=NULL)
            strcat(s,"()");
        if (root->right!=NULL)
            strcat(s,"(");
        preorderTraversal(root->right);
        if (root->right!=NULL)
            strcat(s,")");
    }
}
char * tree2str(struct TreeNode* root){
    s[0]='\0';
    preorderTraversal(root);
    return s;
}
