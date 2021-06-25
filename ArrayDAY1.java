//Sort Colors 0,1 and 2
class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        int temp;
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:{
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}

//Repeat and Missing number


//Duplicates in the array

    public int findDuplicate(int[] nums) {
        int slow=nums[0],fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        
        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    
 //Maximum subarray sum Kadane Algo
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum=0;
            int max=nums[0];
            for(int i=0;i<nums.length;i++)
                {  
                sum+=nums[i];
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<0)
                {
                    sum=0;
                }
            }
            return max;
            
        }
    }
    
//Merge intervals
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> res=new ArrayList<>();
            if(intervals.length==0 || intervals==null)
                return res.toArray(new int[0][]);
            Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
            int start=intervals[0][0];
            int end=intervals[0][1];
            
            for(int i[]:intervals)
            {
                if(i[0]<=end)
                {
                    end=Math.max(end,i[1]);
                }
                
                else{
                    res.add(new int[]{start,end});
                    start=i[0];
                    end=i[1];
                }
            }
            res.add(new int[]{start,end});
            return res.toArray(new int[0][]);
        }
    }
