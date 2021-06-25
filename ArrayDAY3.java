
public class ArrayDAY3 {

	//Rotate a matrix by 90degrees
	//Just 2 steps to solve this problem 
	//1.Transpose of the matrix
	//2.Reverse of every of row
	class Solution {
	    public void rotate(int[][] matrix) {
	        int n=matrix.length;
	        int temp=0;
	        for(int i=0;i<n;i++)
	        { for(int j=i;j<matrix[0].length;j++)
	             { temp=matrix[i][j];
	                matrix[i][j]=matrix[j][i];
	                matrix[j][i]=temp;//Swaping Done row into column and column into row
	             }
	        }
	        //Two pointer method to reverse every row
	        for(int i=0;i<n;i++)
	        { for(int j=0;j<n/2;j++)
	            { 
	                temp=matrix[i][j];
	                matrix[i][j]=matrix[i][n-1-j];
	                matrix[i][n-1-j]=temp;
	            }
	        }
	    }
	}

	//Print Spiral matrix
	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        int r=matrix.length,c=matrix[0].length;
	        List<Integer> res = new ArrayList<Integer>();
	        int top=0,left=0,right=c-1,bottom=r-1;
	        
	        while(top<=bottom && left<=right)
	        {
	            for(int i=left;i<=right;i++)
	            {
	                res.add(matrix[top][i]);
	            }
	            top++;
	            for(int i=top;i<=bottom;i++)
	            {
	                res.add(matrix[i][right]);
	            }
	            right--;
	            if(top<=bottom)
	            {
	                for(int i=right;i>=left;i--)
	                {
	                    res.add(matrix[bottom][i]);
	                }
	                bottom--;
	            }
	            if(left<=right){
	                for(int i=bottom;i>=top;i--)
	                {
	                    res.add(matrix[i][left]);
	                }
	                left++;
	            }
	       
	        }
	        return res;
	    }
	}

	//Search in 2D matrix
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int lo = 0;
	        if(matrix.length == 0) return false;
	        int n = matrix.length; 
	        int m = matrix[0].length; 
	        int hi = (n * m) - 1;
	        
	        while(lo <= hi) {
	            int mid = (lo + (hi - lo) / 2);
	            if(matrix[mid/m][mid % m] == target) {
	                return true;
	            }
	            if(matrix[mid/m][mid % m] < target) {
	                lo = mid + 1;
	            }
	            else {
	                hi = mid - 1;
	            }
	        }
	        return false;
	    }
	}

	//pow(x,n) Binary Exponentiation
	class Solution {
	    public double myPow(double x, int n) {
	        double ans=1.0;
	        long n1=n;
	        if(n1<0) n1=-1*n1;
	        while(n1>0)
	        {
	            if(n1%2==1)
	            {
	                ans=ans*x;
	                n1=n1-1;
	            }
	            else
	            {
	                x=x*x;
	                n1=n1/2;
	            }
	        }
	        if(n<0) ans=(double)(1.0)/(double)(ans);
	        return ans;
	        
	    }
	}

//Grid Unique paths
	//Recursive Solution

	//Rotate a matrix by 90degrees
	//Just 2 steps to solve this problem 
	//1.Transpose of the matrix
	//2.Reverse of every of row
	class Solution {
	    public void rotate(int[][] matrix) {
	        int n=matrix.length;
	        int temp=0;
	        for(int i=0;i<n;i++)
	        { for(int j=i;j<matrix[0].length;j++)
	             { temp=matrix[i][j];
	                matrix[i][j]=matrix[j][i];
	                matrix[j][i]=temp;//Swaping Done row into column and column into row
	             }
	        }
	        //Two pointer method to reverse every row
	        for(int i=0;i<n;i++)
	        { for(int j=0;j<n/2;j++)
	            { 
	                temp=matrix[i][j];
	                matrix[i][j]=matrix[i][n-1-j];
	                matrix[i][n-1-j]=temp;
	            }
	        }
	    }
	}

	//Print Spiral matrix
	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        int r=matrix.length,c=matrix[0].length;
	        List<Integer> res = new ArrayList<Integer>();
	        int top=0,left=0,right=c-1,bottom=r-1;
	        
	        while(top<=bottom && left<=right)
	        {
	            for(int i=left;i<=right;i++)
	            {
	                res.add(matrix[top][i]);
	            }
	            top++;
	            for(int i=top;i<=bottom;i++)
	            {
	                res.add(matrix[i][right]);
	            }
	            right--;
	            if(top<=bottom)
	            {
	                for(int i=right;i>=left;i--)
	                {
	                    res.add(matrix[bottom][i]);
	                }
	                bottom--;
	            }
	            if(left<=right){
	                for(int i=bottom;i>=top;i--)
	                {
	                    res.add(matrix[i][left]);
	                }
	                left++;
	            }
	       
	        }
	        return res;
	    }
	}

	//Search in 2D matrix
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int lo = 0;
	        if(matrix.length == 0) return false;
	        int n = matrix.length; 
	        int m = matrix[0].length; 
	        int hi = (n * m) - 1;
	        
	        while(lo <= hi) {
	            int mid = (lo + (hi - lo) / 2);
	            if(matrix[mid/m][mid % m] == target) {
	                return true;
	            }
	            if(matrix[mid/m][mid % m] < target) {
	                lo = mid + 1;
	            }
	            else {
	                hi = mid - 1;
	            }
	        }
	        return false;
	    }
	}

	//pow(x,n) Binary Exponentiation
	class Solution {
	    public double myPow(double x, int n) {
	        double ans=1.0;
	        long n1=n;
	        if(n1<0) n1=-1*n1;
	        while(n1>0)
	        {
	            if(n1%2==1)
	            {
	                ans=ans*x;
	                n1=n1-1;
	            }
	            else
	            {
	                x=x*x;
	                n1=n1/2;
	            }
	        }
	        if(n<0) ans=(double)(1.0)/(double)(ans);
	        return ans;
	        
	    }
	}

	//DP solution(O(mn))
	class Solution {
	    public int uniquePaths(int m, int n) {
	    int[][] map = new int[m][n];
	        for(int i = 0; i<m;i++){
	            map[i][0] = 1;
	        }
	        for(int j= 0;j<n;j++){
	            map[0][j]=1;
	        }
	        for(int i = 1;i<m;i++){
	            for(int j = 1;j<n;j++){
	                map[i][j] = map[i-1][j]+map[i][j-1];
	            }
	        }
	        return map[m-1][n-1];
	    }
	}
	
	//Most Optimal Combinations Using O(m-1)or O(n-1)
	class Solution {
	    public int uniquePaths(int m, int n) {
	    int N=m+n-2;
	        int r=m-1;
	        double res=1;
	        for(int i=1;i<=r;i++)
	            res=res*(N-r+i)/i;
	        return (int)res;
	    }
	}
	
//Reverse Pair
	public class Solution {
	    public int reversePairs(int[] nums) {
	        return mergeSort(nums, 0, nums.length-1);
	    }
	    private int mergeSort(int[] nums, int s, int e){
	        if(s>=e) return 0; 
	        int mid = s + (e-s)/2; 
	        int cnt = mergeSort(nums, s, mid) + mergeSort(nums, mid+1, e); 
	        for(int i = s, j = mid+1; i<=mid; i++){
	            while(j<=e && nums[i] > 2.0*nums[j]) j++; 
	            cnt += j-(mid+1); 
	        }
	        Arrays.sort(nums, s, e+1); 
	        return cnt; 
	    }
	}
	
}
