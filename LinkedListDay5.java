//reverse a linkedlist
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=cur;
            cur=head;
            head=next;
        }
        return cur;
    }
}

//find middle of the linkedlist
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

//merge two sorted linked list
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // ListNode res=new ListNode<Integer>();
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val>l2.val)
        {
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode res=l1;
        while(l1!=null && l2!=null)
        {
            ListNode tmp=null;
            while(l1!=null &&l1.val<=l2.val)
            {
                tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;
            
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        return res;
    }
}

//remove nth node from end of linkedlist
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode();
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        for(int i=1;i<=n;++i)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}

//Delete a given node when node is given
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}

//Add two numbers as given as linkedlist
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int c=0;
        while(l1!=null || l2!=null || c==1)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=c;
            
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
            return dummy.next;
    }
}