public class CardGame extends TableTopGame {
    private int numCards = 52;

    public CardGame(String n, Rule[] rs, int nc) {
        super(n, rs);
        this.numCards = nc;
    }

    public String toString() {
        return ("CardGame: " + getName());
    }

    public int getNumCards() {
        return this.numCards;
    }

    public void setNumCards(int nc) {
        this.numCards = nc;
    }

}
