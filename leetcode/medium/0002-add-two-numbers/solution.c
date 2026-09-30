/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* temp1=l1;
    struct ListNode*temp2=l2;

    struct ListNode*result=NULL;
    struct ListNode*tail=NULL;
    int carry=0;
    
    while(temp1 != NULL || temp2 != NULL || carry != 0){
        int x=0;
    int y=0;
    if(temp1!=NULL)
         x=temp1->val;
        
    
    if(temp2!=NULL)
        y=temp2->val;
    
    
    
        int sum= x + y+carry;
        carry=sum/10;
        sum=sum%10;
        
    
    
    struct ListNode*newNode=malloc(sizeof(struct ListNode));
newNode->val=sum;
newNode->next=NULL;

if (result == NULL) {
            result = newNode;
            tail = newNode;
}
else{
    tail->next=newNode;
    tail=newNode;
}

if(temp1!=NULL){
    temp1=temp1->next;
}
if(temp2!=NULL){
    temp2=temp2->next;
}
}


return result;
}