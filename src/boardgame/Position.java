package boardgame;

public class Position {

    //encapsulando
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //por conta do encapsulamento o acesso se da pelo get set.
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    //tbm vou criar um toString para imprimir a posicao na tela;
    @Override
    public String toString(){
        return row + ", " + column;
    }
}
