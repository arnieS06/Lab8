public class Player {
    private double riskTaking = 0.0;
    private double complexityLiking = 0.0;
    private double workoutLiking = 0.0;
    private double competitiveness = 0.0;
    private Game[] specialLikes;
    private Game[] specialDislikes;

    public Player(double rt, double cl, double wl, double c) {
        this.riskTaking = rt;
        this.complexityLiking = cl;
        this.workoutLiking = wl;
        this.competitiveness = c;
    }

    public Player(double rt, double cl, double wl, double c, Game[] sl, Game[] sd) {
        this.riskTaking = rt;
        this.complexityLiking = cl;
        this.workoutLiking = wl;
        this.competitiveness = c;

        specialLikes = sl;
        specialDislikes = sd;
    }

    public double getriskTaking() {
        return this.riskTaking;
    }

    public double getcomplexityLiking() {
        return this.complexityLiking;
    }

    public double getworkoutLiking() {
        return this.workoutLiking;
    }

    public double getcompetitiveness() {
        return this.competitiveness;
    }

    public Game[] getspecialLikes() {
        return this.specialLikes;
    }

    public Game[] getspecialDislikes() {
        return this.specialDislikes;
    }

    public void setspecialLikes(Game[] sl) {
        this.specialLikes = sl;
    }

    public void setspecialDislikes(Game[] sd) {
        this.specialDislikes = sd;
    }

}
