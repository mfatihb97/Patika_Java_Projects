package Week_04.Advanture_Game;

public class River extends CombatZone {
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 1);
    }
}
