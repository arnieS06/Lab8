public class Demonstrator {
    public static void main(String[] args) {
        Rule[] commonRules = { new Rule("Players must have good sportsmanship"), new Rule("No cheating allowed or disqualified") };

        Rule[] detailedRules = {
                new Rule("Each player rolls a die at the start"), new Rule("If you land on a ladder you move up"),
                new Rule("If you land on a snake you move down"),  new Rule("The first player to reach the last square wins"),
                new Rule("Player must roll the exact number to win")
        };

        Sport football = new Sport("Football", commonRules, true, 3.5);
        PhysicalSport boxing = new PhysicalSport("Boxing", commonRules, false, 5.0, true);
        MotorizedSport formula1 = new MotorizedSport("Formula 1", commonRules, false, 4.0, "road");
        BoardGame chess = new BoardGame("Chess", commonRules, 8, 8);

        // this following class is the one that's carefully made
        DiceGame snakesAndLadders = new DiceGame("Snakes and Ladders", detailedRules, 2, 6);

        System.out.println(football);

        System.out.println(boxing);

        System.out.println(formula1);

        System.out.println(chess);

        System.out.println(snakesAndLadders);

    }
}
