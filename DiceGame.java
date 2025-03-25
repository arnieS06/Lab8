public class DiceGame extends TableTopGame {
    private int numDice = 0;
    private int numDieSides = 6;

//    public DiceGame() {
//        super();
//    }

    public DiceGame(String n, Rule[] rs, int nd, int nds) {
        super(n, rs);
        this.numDice = nd;
        this.numDieSides = nds;
    }

    public String toString() {
        return ("DiceGame: " + getName());
    }

    public int getNumDice() {
        return this.numDice;
    }

    public void setNumDice(int nd) {
        this.numDice = nd;
    }

    public int getNumDieSides() {
        return this.numDieSides;
    }

    public void setNumDieSides(int nds) {
        this.numDieSides = nds;
    }
}
