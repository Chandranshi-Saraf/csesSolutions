import java.io.*;
import java.util.*;
public class ChessBoardAndQueens{
    static int count=0;
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    int board[][]=new int[8][8];
    for(int i=0;i<8;i++)
    {
        String row=br.readLine();
        for(int j=0;j<8;j++){
            if(row.charAt(j)=='*')
                board[i][j]=2;
            else
                board[i][j]=0;
        }
    }
    allSolutions(board,0);
    System.out.println(count);
}
public static boolean isSafe(int board[][], int row, int col) 
{ 
    if(board[row][col] == 2)
        return false;
    int i, j; 
    for (i=0;i<col;i++) 
        if (board[row][i] == 1) 
            return false; 
    for (i=row,j=col;i>=0 && j>=0;i--,j--) 
        if (board[i][j] == 1) 
            return false; 
    for (i=row,j=col;j>=0 && i<8;i++,j--) 
        if (board[i][j] == 1) 
            return false; 
 
    return true; 
} 
public static void allSolutions(int board[][], int col) 
{ 
    if (col==8) 
    { 
        count++;
        return; 
    } 
    for (int i = 0; i < 8; i++) 
    { 
        if ( isSafe(board, i, col) ) 
        { 
            board[i][col] = 1; 
            allSolutions(board, col + 1); 
            board[i][col] = 0;
        } 
    }  
} 
 
}
