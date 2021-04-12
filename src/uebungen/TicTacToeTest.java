package uebungen;
import uebungen.TicTacToe.State;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.print();
        ttt.makeMove(1, 2, State.RED);
        ttt.print();
        ttt.makeMove(-4711, 12345, State.EMPTY);
    }
}

