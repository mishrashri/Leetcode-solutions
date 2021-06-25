//Set matrix to zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        int col=1,row=matrix.length,cols=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                col=0;
            }
            for(int j=1;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=matrix[0][j]=0;
                }   
            }
        }
        
        for(int i=row-1;i>=0;i--)
        {
            for(int j=cols-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
            if(col==0) matrix[i][0]=0;
        }
    }
}

//Pascal triangle

//Pascal Triangle Value= R-1cC-1

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =new ArrayList<List<Integer>>();
        List<Integer> row,pre=null;
        for(int i=0;i<numRows;i++)
        {
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                    row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
}

//Next Permutation

class Solution {
    public void nextPermutation(int[] a) {
        if(a==null ||a.length<=1) return;
        
        int i=a.length-2;
        
        while(i>=0 && a[i]>=a[i+1]) i--;
        
        if(i>=0)
        {
            int j=a.length-1;
            while(a[j]<=a[i])
                j--;
            swap(a,i,j);
        }
        reverse(a,i+1,a.length-1);
    }
    
    public void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
            swap(a,i++,j--);
        }
    }
}

//Count Inversion

/*
	Brute Force Approach
 class Test {
    static int arr[] = new int[] { 1, 20, 6, 4, 5 };
 
    static int getInvCount(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
 
        return inv_count;
    }
 
    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Number of inversions are "
                           + getInvCount(arr.length));
    }
}
 *///Optimal Approach
import java.util.Arrays;

public class GFG {
 
    // Function to count the number of inversions
    // during the merge process
    private static int mergeAndCount(int[] arr, int l,
                                     int m, int r)
    {
 
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
 
        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
 
        int i = 0, j = 0, k = l, swaps = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
 
    // Merge sort function
    private static int mergeSortAndCount(int[] arr, int l,
                                         int r)
    {
 
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;
 
        if (l < r) {
            int m = (l + r) / 2;
 
            // Total inversion count = left subarray count
            // + right subarray count + merge count
 
            // Left subarray count
            count += mergeSortAndCount(arr, l, m);
 
            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);
 
            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
 
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 20, 6, 4, 5 };
 
        System.out.println(
            mergeSortAndCount(arr, 0, arr.length - 1));
    }
}



//Stock buy and Sell
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}


