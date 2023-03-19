package org.example.HW8;

import java.util.ArrayList;

public class HW8 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        Solve(board,GetNextEmpty(board));
    }
    public static void Solve(char [][] board,byte [] currentCell){

        ArrayList<Character> square=GetSquare(board,currentCell);
        ArrayList<Character> row=GetRow(board,currentCell);
        ArrayList<Character> column=GetColumn(board,currentCell);
        for( char i='1';i<='9';i++){
            if(!(square.contains(i)||row.contains(i)||column.contains(i))){
                board[currentCell[0]][currentCell[1]]=i;
            }
            else continue;
            if (Solution(board)) {
                PrintBoard(board);
                return;
            }
            if (currentCell[0]==8 ){
                System.out.println("a");
            }
            if (GetNextEmpty(board)[0]!=-1) Solve(board,GetNextEmpty(board));
        }
        board[currentCell[0]][currentCell[1]]='.';
        return;
    }
    public static byte [] GetNextEmpty(char [][] board){
        byte x=-1,y=-1;
        for (byte i=0;i<board.length;i++){
            for (byte j=0;j<board[i].length;j++){
                if (board[i][j]=='.') return new byte[]{i,j};
            }
        }

        return new byte[]{x,y};
    }
    public static ArrayList<Character> GetSquare(char [][] board, byte [] position) {
        ArrayList <Character> square=new ArrayList<Character>() ;
        int squareSize=3;
        int iStart=squareSize*(position[0]/squareSize);
        int iEnd=iStart+squareSize;
        int jStart=squareSize*(position[1]/squareSize);;
        int jEnd=jStart+squareSize;
        for (int i=iStart;i<iEnd;i++){
            for (int j=jStart;j<jEnd;j++){
                square.add(board[i][j]);
            }
        }
        return square;
    }
    public static ArrayList<Character> GetRow(char [][] board,byte [] position) {
        ArrayList <Character> row=new ArrayList<Character>() ;
        for (int j=0;j<board[position[0]].length;j++){
            row.add(board[position[0]][j]);
        }
        return row;
    }

    public static ArrayList<Character> GetColumn(char [][] board,byte [] position) {
        ArrayList <Character> column=new ArrayList<Character>() ;
        for (int i=0;i<board.length;i++){
            column.add(board[i][position[1]]);
        }
        return column;
    }
    public static void PrintBoard(char[][] board){
        for (int j=0;j<board[0].length+22;j++) System.out.print('-');
        System.out.println();
        for (int i=0;i<board.length;i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + (char) board[i][j] + " ");
                if ((j + 1) % 3 == 0) System.out.print("|");
            }
            System.out.println();
            if ((i+1)%3==0) {
              for (int j=0;j<board[i].length+22;j++) System.out.print('-');
               System.out.println();
            }
           }
        }
    public static boolean Solution (char[][] board) {

        char[] pattern=new char[] {'1','2','3','4','5','6','7','8','9'};
        for (byte i=0;i<board.length;i++){
            for (byte j=0;j<board[i].length;j++){
                for (int k=0;k<pattern.length;k++){

                    ArrayList<Character> square=GetSquare(board,new byte[] {i,j});
                    ArrayList<Character> row=GetRow(board,new byte[] {i,j});
                    ArrayList<Character> column=GetColumn(board,new byte[] {i,j});
                    if (!(square.contains(pattern[k])&&row.contains(pattern[k])&&column.contains(pattern[k]))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    }


