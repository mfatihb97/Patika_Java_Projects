package Week_04.Advanture_Game;

public class Cave extends CombatZone {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 1);
    }
}
