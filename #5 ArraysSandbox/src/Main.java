public class Main {
    public static void main(String[] args){
        GameEntry entryObject1 = new GameEntry("Sarbi", 5);
        GameEntry entryObject2 = new GameEntry("Mitalie", 10);
        GameEntry entryObject3 = new GameEntry("Atharva", 7);
        // System.out.println(entryObject1.getScore());

        Scoreboard game = new Scoreboard(10);
        game.add(entryObject1);
        game.add(entryObject2);
        game.add(entryObject3);
        game.add(entryObject1);
        game.add(entryObject2);
        game.add(entryObject3);
        game.remove(5);
        System.out.println(game.toString());

    }
}
