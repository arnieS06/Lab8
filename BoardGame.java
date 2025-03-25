public class BoardGame extends TableTopGame {
    private double boardWidth;
    private double boardLength;

    public BoardGame(String n, Rule[] rs, double bw, double bl) {
        super(n, rs);
        this.boardWidth = bw;
        this.boardLength = bl;
    }

    public String toString() {
        return ("BoardGame: " + getName());
    }

    public double getBoardWidth() {
        return this.boardWidth;
    }

    public void setBoardWidth(double bw) {
        this.boardWidth = bw;
    }

    public double getBoardLength() {
        return this.boardLength;
    }

    public void setBoardLength(double bl) {
        this.boardWidth = bl;
    }
}
