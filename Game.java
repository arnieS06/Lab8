public class Game {

    private String name = "none";
    Rule[] rules = new Rule[100];
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;

    public Game(String n) {
        this.name = n;
    }

    public Game(String n, Rule[] rs) {
        this.name = n;
        int count = 0;
        int availableSlots = 0;

        // this counts the avaliable spaces
        for (int i = 0; i < rules.length; i++) {
            if (rules[i] == null) {
                availableSlots++;
            }
        }

        if (rs.length > availableSlots) {
            System.out.println("WARNING: Not enough space for all rules. Only " + availableSlots + " out of " + rs.length + " rules were added.");
        }


        for (int i = 0; i < rules.length && count < rs.length; i++) {
            if (rules[i] == null) {
                rules[i] = rs[count];
                count++;
            }
        }

        numRules += count;
    }


    public Game(String n, Rule[] rs, int t, int ts) {
        this.name = n;
        this.teams = t;
        this.teamSize = ts;
        int count = 0;
        int availableSlots = 0;

        for (int i = 0; i < rules.length; i++) {
            if (rules[i] == null) {
                availableSlots++;
            }
        }

        if (rs.length > availableSlots) {
            System.out.println("WARNING: Not enough space for all rules. Only " + availableSlots + " out of " + rs.length + " rules were added.");
        }


        for (int i = 0; i < rules.length && count < rs.length; i++) {
            if (rules[i] == null) {
                rules[i] = rs[count];
                count++;
            }
        }

        numRules += count;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String set) {
        this.name = set;
    }

    public int getTeams() {
        return this.teams;
    }

    public void setTeams(int set) {
        this.teams = set;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int set) {
        this.teamSize = set;
    }

    public boolean addRule(Rule r) {
        for (int i = 0; i < rules.length; i++) {
            if (rules[i] == null) {
                rules[i] = r;
                numRules++;
                return true;
            }
        }
        return false; // this happens when no empty slots are there
    }


    public Rule[] getRules() {
        return rules;
    }

    public int getNumRules() {
        return numRules;
    }



}