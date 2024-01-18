class backtracking{
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            Printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void Printarr(int arr[]){
        for( int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i =row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1,j=col-1;i>0&&j>0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i =row-1,j=col-1;i>0&& j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }  return true;
    }
    public static void nQueen(char board[][],int row) {
        //base 
        if(row==board.length){
            printboard(board);
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board, row+1);//function call
                board[row][j]='x';//backtracking call
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("-----------chess board ----------");
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j]);
            }System.out.println();
        }
    }
    static int count =0;
    public static int gridways(int i ,int j,int n,int m){
        //base case 
        if(i==n-1&&j==m-1){
            return 1;
        }
        else if(i>=n||j>=m||i<0||j<0){
            return 0;
        }
        int w1= gridways(i+1, j, n, m);
        int w2=gridways(i, j+1, n, m);
        int w3=gridways(i-1, j, n, m);
        int w4 =gridways(i, j-1, n, m);
        return w1+w2+w3+w4;
    }
    public static boolean check(int maze[][],int x,int y,int sol[][]){
        int n = maze.length;
        if(x<0||x>=n||y<0||y>=n){
            return false;
        }
        if(maze[x][y]==0||sol[x][y]==1){
            return false;
        }
        return true;
    }
    public static void solve(int x,int y,int maze[][],int sol[][]){
        int n =maze.length;
        if(x==n-1&&y==n-1){
            for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(sol[i][j]+" ");
                }System.out.println();
            }
            System.out.println();
          
        }
        if(check(maze, x, y-1, sol)){
            sol[x][y-1]=1;
            solve(x, y-1, maze,sol); 
            sol[x][y-1]=0;
        }
         if(check(maze, x, y+1, sol)){
            sol[x][y+1]=1;
            solve(x, y+1, maze,sol);
            sol[x][y+1]=0;
        }
        if(check(maze, x+1, y, sol)){
            sol[x+1][y]=1;
            solve(x+1, y, maze,sol);
            sol[x+1][y]=0;
        }
        if(check(maze, x-1, y, sol)){
            sol[x-1][y]=1;
            solve(x-1, y, maze,sol);
            sol[x-1][y]=0;
        }
   
    }
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int n=4;
        int sol[][]= new int[n][n];
        for( int i =0;i<4;i++){
            for(int j=0; j<4;j++){
                sol[i][j]=0;
            }
        }
        sol[0][0]=1;
        solve(0,0,maze,sol);

    }
}