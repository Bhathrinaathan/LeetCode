class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for (int row=0;row<9;row++)
        {
            for (int col=0;col<9;col++)
            {
                if (board[row][col]!='.')
                {
                    if (!set.add(board[row][col]+"row"+row) ||
                        !set.add(board[row][col]+"col"+col) ||
                        !set.add(board[row][col]+"board"+(row/3)+"."+(col/3))
                        ){
                            return false;
                        }
                }   
            }
        }
        set.clear();
        return true;
    }
}
