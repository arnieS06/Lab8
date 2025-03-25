public class Sport extends Game {
    private boolean olympic = false;
    double riskLevel;

    public Sport() {
        super("n");
    }

    public Sport(String n, Rule[] rs, boolean o, double rl) {
        super(n, rs);
        this.olympic = o;
        this.riskLevel = rl;
    }

    public String toString() {
        return ("Sport:" + getName());
    }

    public boolean getOlympic() {
        return this.olympic;
    }

    public void setOlympic(boolean o) {
        this.olympic = o;
    }

    public double getRiskLevel() {
        return this.riskLevel;
    }

    public void setRiskLevel(double rl) {
        this.riskLevel = rl;
    }
}
