/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

   struct ListNode* reverseList(struct ListNode* head) {
   struct ListNode*dummy=malloc(sizeof(struct ListNode));
   dummy->next=NULL;
   while(head!=NULL){
    struct ListNode*next=head->next;
    head->next=dummy->next;
    dummy->next=head;
   head=next;
   }
   
   
   struct ListNode* result = dummy->next;
    free(dummy);
    return(result);
   }
