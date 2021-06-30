
public class HashingDAY4 {
	
	//Two Sums
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int [] result=new int[2];
	        HashMap<Integer,Integer> m=new HashMap<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(m.containsKey(target-nums[i]))
	            {
	                result[1]=i;
	                result[0]=m.get(target-nums[i]);
	                return result;
	            }
	            m.put(nums[i],i);
	        }
	        return result;
	    }
	}
	
	//4 sums
	class Solution {
	    public List<List<Integer>> fourSum(int[] num, int target) {
	        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
	        
	        if (num == null || num.length == 0)
	            return res;
	        
	        int n = num.length;
	    
	        Arrays.sort(num); 
	    
	        for (int i = 0; i < n; i++) {
	        
	            int target_3 = target - num[i];
	        
	            for (int j = i + 1; j < n; j++) {
	            
	                int target_2 = target_3 - num[j];
	            
	                int front = j + 1;
	                int back = n - 1;
	            
	                while(front < back) {
	                
	                    int two_sum = num[front] + num[back];
	                
	                    if (two_sum < target_2) front++;
	                
	                    else if (two_sum > target_2) back--;
	                
	                    else {
	                    
	                        List<Integer> quad = new ArrayList(); 
	                        quad.add(num[i]);
	                        quad.add(num[j]);
	                        quad.add(num[front]);
	                        quad.add(num[back]);
	                        res.add(quad);
	                    
	                        // Processing the duplicates of number 3
	                        while (front < back && num[front] == quad.get(2)) ++front;
	                    
	                        // Processing the duplicates of number 4
	                        while (front < back && num[back] == quad.get(3)) --back;
	                
	                    }
	                }
	                
	                // Processing the duplicates of number 2
	                while(j + 1 < n && num[j + 1] == num[j]) ++j;
	            }
	        
	            // Processing the duplicates of number 1
	            while (i + 1 < n && num[i + 1] == num[i]) ++i;
	        
	        }
	    
	        return res;
	    }
	}
	
	//Longest Subsequence
	//Naive method-
	class Solution {
	    public int longestConsecutive(int[] nums) {
	        if(nums.length==0||nums==null)
	        {
	            return 0;
	        }
	        Arrays.sort(nums);
	        int res=1,cur=1;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]==nums[i-1]+1)
	            {
	                cur++;
	            }
	            else if(nums[i]!=nums[i-1])
	            {
	                res=Math.max(res,cur);
	                cur=1;
	            }
	        }
	        return Math.max(res,cur);
	    }
	}
	
	//Optimal-

    if(nums.length==0||nums==null)
    {
         return 0;
    }
    HashSet<Integer> h=new HashSet<>();
    for(int x:nums)
    {
        h.add(x);//adding element to the hashset
    }
    int res=1;
    
    for(int x:nums)
    {
        if(!h.contains(x-1))
        {
            int cur=x;
            int curstreak=1;
            while(h.contains(cur+1))
            {
                cur+=1;
                curstreak+=1;
            }
            res=Math.max(res,curstreak);
        }
    }
    return res;   
    
    //Longest Substring
    class Solution {
        public int lengthOfLongestSubstring(String s) {
        int n = s.length(); 
    	int res = 0;
    	int prev[]=new int[256];
    	Arrays.fill(prev,-1);
    	int i=0;
    	for (int j = 0; j < n; j++){
    	    i=Math.max(i,prev[s.charAt(j)]+1);
    	    int maxEnd=j-i+1;
    	    res=Math.max(res,maxEnd);
    	    prev[s.charAt(j)]=j;
    	} 
    	return res; 
        }
    }

}
