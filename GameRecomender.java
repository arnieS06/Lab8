public class GameRecomender {
    private Game[] listOfGames;
    private int numGames;

    public GameRecomender() {
        Game[] listOfGames = new Game[100];
        this.numGames = 0;
    }

    public GameRecomender(Game[] ig) {
        if (ig.length >= 100) {
            System.out.println("Array provided is too large");
            System.exit(1);
        }

        Game[] listOfGames = new Game[100];

        for (int i = 0; i < ig.length; i++) {
            listOfGames[i] = ig[i];

        }

        this.numGames = ig.length;
    }

    public boolean addGame(Game g) {
        for (int i = 0; i < listOfGames.length; i++) {
            if (listOfGames[i] == null) {
                listOfGames[i] = g;
                break;
            }
            
        }
    }

}
