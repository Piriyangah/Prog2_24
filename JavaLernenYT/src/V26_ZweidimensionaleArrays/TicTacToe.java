package V26_ZweidimensionaleArrays;

import java.util.Scanner;
/*
 * Exercise: TicTacToe Spiel
 * - 2 Spiele mit X und O auf Tastertur spiele können
 * - gibt Spiegel aus der horizontal, vertikal oder diagonal eine dreier Reihe hat
 */

public class TicTacToe {
    public static void main(String[] args) {
        char Spieler1 = 'X';
        char Spieler2 = 'O';

        // Initialize the TicTacToe board with empty spaces
        char [][] tictactoe = new char[3][3];
        for (int i = 0; i < tictactoe.length; i++) {
            for (int i1 = 0; i1 < tictactoe.length; i1++) {
                tictactoe[i][i1] = ' ';
            }
        }

        //
        Scanner scan = new Scanner(System.in);
        char aktuelleSpieler = Spieler1;
        while (true) {
            System.out.println("Spieler " + aktuelleSpieler + ", bitte gib deine Koordinaten an: Zeile Spalte");

            // Print the board (this should be expanded to check for a win)
            for (int i = 0; i < tictactoe.length; i++) {
                for (int j = 0; j < tictactoe[i].length; j++) {
                    System.out.print(tictactoe[i][j]);
                    if (j < tictactoe[i].length - 1) System.out.print("|");
                }
                System.out.println();
                if (i < tictactoe.length - 1) System.out.println("-----");
            }

            int zeile = scan.nextInt();
            int spalte = scan.nextInt();
            // Check if input is within bounds and the cell is empty
            if (zeile >= 1 && zeile <= 3 && spalte >= 1 && spalte <= 3 && tictactoe[zeile - 1][spalte - 1] == ' ') {
                tictactoe[zeile - 1][spalte - 1] = aktuelleSpieler;
                // Switch player
                aktuelleSpieler = (aktuelleSpieler == Spieler1) ? Spieler2 : Spieler1;
            } else {
                System.out.println("Ungültige Eingabe oder Feld bereits belegt. Bitte versuche es erneut.");
            }
        }

    }
}

/* BESSER MIT GEWONNEN SATZ UND ÜBERPRÜFEN
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            char[][] tictactoe = new char[3][3];
            for (int i = 0; i < tictactoe.length; i++) {
                for (int j = 0; j < tictactoe[i].length; j++) {
                    tictactoe[i][j] = ' ';
                }
            }

            char aktuelleSpieler = 'X';
            boolean gameContinues = true;
            int moves = 0;

            while (gameContinues) {
                printBoard(tictactoe);
                System.out.println("Spieler " + aktuelleSpieler + ", bitte gib deine Koordinaten an: Zeile Spalte");
                int zeile = scan.nextInt();
                int spalte = scan.nextInt();

                if (zeile >= 1 && zeile <= 3 && spalte >= 1 && spalte <= 3 && tictactoe[zeile - 1][spalte - 1] == ' ') {
                    tictactoe[zeile - 1][spalte - 1] = aktuelleSpieler;
                    moves++;

                    if (checkWin(tictactoe, aktuelleSpieler)) {
                        printBoard(tictactoe);
                        System.out.println("Spieler " + aktuelleSpieler + " hat gewonnen!");
                        gameContinues = false;
                    } else if (moves == 9) {
                        printBoard(tictactoe);
                        System.out.println("Unentschieden!");
                        gameContinues = false;
                    } else {
                        aktuelleSpieler = (aktuelleSpieler == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Ungültige Eingabe oder Feld bereits belegt. Bitte versuche es erneut.");
                }
            }

            System.out.println("Möchten Sie noch einmal spielen? (ja/nein)");
            playAgain = scan.next().equalsIgnoreCase("ja");
        }

        scan.close();
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print("|");
            }
            System.out.println();
            if (i < board.length - 1) System.out.println("-----");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}

 */