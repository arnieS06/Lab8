public class MotorizedSport extends Sport {
    private String medium = "land";

//    public MotorizedSport() {
//        super();
//    }

    public MotorizedSport(String n, Rule[] rs, boolean o, double rl, String m) {
        super(n, rs, o, rl);
        this.medium = m;
    }

    public String toString() {
        return ("MotorizedSport: " + getName());
    }

    public String getMedium() {
        return this.medium;
    }

    public void setMedium(String m) {
        this.medium = m;
    }
}
