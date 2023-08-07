class Solution {
    public boolean searchArray(int[] arr,int target)
    {
        int first=0,last=arr.length-1;
        while(first<=last)
        {
            int mid=(first+last)/2;
            if (arr[mid]==target)
                return true;
            else if (arr[mid]>target)
                last=mid-1;
            else
                first=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        int first=0,last=rowLen-1;
        
        while(first<=last)
        {
            int midRow=(first+last)/2;
            if(target>=matrix[midRow][0] &&target<=matrix[midRow][colLen-1]){
                return searchArray(matrix[midRow],target);
            }
            else if (target<matrix[midRow][0])
                last=midRow-1;
            else
                first=midRow+1;
        }
        return false;
    }
}
