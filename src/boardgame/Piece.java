package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    //como uma peca recem criada tem posicao nula, eu so preciso criar o construtor do Board.
    public Piece(Board board) {
        this.board = board;
        position = null;//opcional pq o java entende como nulo
    }

    protected Board getBoard() {
        return board;
    }
}
