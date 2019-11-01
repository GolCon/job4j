package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;

        for (int row = 0; row < board.length; ++row) {
            int count = 0;
            int cnt = 0;
            for (int cell = 0; cell < board.length; ++cell) {
                char sign = board[row][cell];

                System.out.print(sign + " ");

                if (board[row][cell] == 'X') {
                    count++;
                }
                if (board[cell][row] == 'X') {
                    cnt++;
                }
                // for (int i = 0; i < board.length; ++i) {
                //   if (board[row][i] == 'X') {
                //     count++;
                //}

                //for (int in = 0; in < board.length; ++in) {
                //  if (board[in][cell] == 'X') {
                //    count++;
                //}
                //}


            }
            if (count >= board.length || cnt >= board.length) {
                result = true;

            }
            System.out.println();
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win1 = isWin(hasWinVertical);
        System.out.println("A board has winer : " + win1);
        System.out.println();

        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean win2 = isWin(hasWinHor);
        System.out.println("A board has winer : " + win2);
        System.out.println();

        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);

    }
}

