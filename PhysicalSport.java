public class PhysicalSport extends Sport {
    private boolean aerobic;

//    public PhysicalSport() {
//        super();
//    }

    public PhysicalSport(String n, Rule[] rs, boolean o, double rl, boolean a) {
        super(n, rs, o, rl);
        this.aerobic = a;
    }

    public String toString() {
        return ("PhysicalSport: " + getName());
    }

    public boolean getAerobic() {
        return this.aerobic;
    }

    public void setAerobic(boolean a) {
        this.aerobic = a;
    }
}
