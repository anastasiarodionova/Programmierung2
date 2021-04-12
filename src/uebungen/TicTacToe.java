package uebungen;

public class TicTacToe {
    enum State {EMPTY, RED, BLACK}

    ;

    State[][] field;

    public TicTacToe() {
        field = new State[3][3];
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[i].length; j++)
                field[i][j] = State.EMPTY;
    }

    public void makeMove(int i, int j, State player) {
        if (field[i][j] == State.EMPTY && player != State.EMPTY)
            field[i][j] = player;
    }

    public void print() {
        for (int zeile = 0; zeile < this.field.length; zeile++) {
            for (int spalte = 0; spalte < this.field[zeile].length; spalte++) {
                if (this.field[zeile][spalte] == State.EMPTY) {
                    System.out.print(" -");
                } else if (this.field[zeile][spalte] == State.RED) {
                    System.out.print(" x");
                } else {
                    System.out.print(" o");
                }
            }
            System.out.println();    // nach jeder Zeile Zeilenumbruch
        }
        System.out.println();
    }

    public boolean gewonnen(State player) {
        if (player == State.EMPTY) return false;

        // alle 3 Zeilen pruefen
        for (int zeile = 0; zeile < this.field.length; zeile++) {
            if (this.field[zeile][0] == player &&
                    this.field[zeile][1] == player &&
                    this.field[zeile][2] == player) {
                return true;
            }
        }

        // alle 3 Spalten pruefen
        for (int spalte = 0; spalte < this.field[0].length; spalte++) {
            if (this.field[0][spalte] == player &&
                    this.field[1][spalte] == player &&
                    this.field[2][spalte] == player) {
                return true;
            }
        }

        //Diagonale von links oben nach rechts unten
        if (this.field[0][0] == player &&
                this.field[1][1] == player &&
                this.field[2][2] == player) {
            return true;
        }

        //Diagonale von links unten nach rechts oben
        if (this.field[2][0] == player &&
                this.field[1][1] == player &&
                this.field[0][2] == player) {
            return true;
        }

        return false;
    }

    public boolean gewonnen() {
        return (gewonnen(State.BLACK) || gewonnen(State.RED));
    }

    public boolean voll() {
        for (int zeile = 0; zeile < this.field.length; zeile++) {
            for (int spalte = 0; spalte < this.field[zeile].length; spalte++) {
                if (this.field[zeile][spalte] == State.EMPTY) return false;
            }
        }
        return true;
    }

    public boolean unentschieden() {
        return (this.voll() && !this.gewonnen());
    }
}
