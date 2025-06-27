class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(seen.contains(c+" row "+i) || 
                seen.contains(c+" col "+j) || 
                seen.contains(i/3+" row "+j/3+" col "+c)){
                    return false;
                }
                seen.add(c+" row "+i);
                seen.add(c+" col "+j);
                seen.add(i/3+" row "+j/3+" col "+c);
            }
        }
        return true;
    }
}