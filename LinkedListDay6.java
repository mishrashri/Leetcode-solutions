//Intersection of LinkedList
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        int countA=0;
        while(currA!=null)
        {
            countA++;
            currA=currA.next;
        }
        ListNode currB=headB;
        int countB=0;
        while(currB!=null)
        {
            countB++;
            currB=currB.next;
        }
        ListNode t1=headA;
        ListNode t2=headB;   
        int ans=Math.abs(countA-countB);    
        if(countA>countB)
        {
            for(int i=0;i<ans;i++)
            {
                t1=t1.next;
            }
        }
        else{
            for(int i=0;i<ans;i++)
            {
                t2=t2.next;
            }
        }
        while(t1!=t2)
        {
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}

//Detect a cycle in LinkedList
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null)
        {
            return false;
        }
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
}

//Reverse nodes in k groups
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode cur=dummy,nex =dummy,pre=dummy;
        
        int count=0;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        while(count>=k)
        {
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<k;i++)
            {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            count-=k;
        }
        return dummy.next;
    }
}
//Check For palindrome LL
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=reverse(slow.next);
        
        slow=slow.next;
        
        while(slow!=null){
            if(head.val!=slow.val)
            {
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    
    ListNode reverse(ListNode head)
    {
        ListNode pre=null;
        ListNode next=null;
        
        while(head!=null)
        {
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}

//Find the starting point of the cycle
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow=head;
        ListNode fast=head;
        ListNode entry=head;
        if(head==null || head.next==null) return null;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}

//Rotate a linkedlist
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        if(head==null || head.next==null ||k==0)return head;
        int len=1;
        ListNode curlen=head;
        while(curlen.next!=null)
        {
            len++;
            curlen=curlen.next;
        }
        
        while(curr.next!=null)
        {
                curr=curr.next;
        }
        curr.next=head;
        k=len - k % len;
        while(k-- >0) curr=curr.next;
        
        head=curr.next;
        curr.next=null;
        return head;
    }
}