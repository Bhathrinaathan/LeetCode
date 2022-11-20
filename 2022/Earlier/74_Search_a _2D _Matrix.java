// This file doesn't contain Main function. It carries only the required logical part :)
// Runtime: 1 ms
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            
    int matrixSize=matrix.length,C=matrix[0].length;
    for (int i=0;i<matrixSize;i++)
    {
        if (matrix[i][0]<=target && target<=matrix[i][C - 1])
        {
            for (int j=0;j<C;j++)
            {
                if (matrix[i][j]==target)
                    return true;
            }
        }
    }
    return false;
    }
}
