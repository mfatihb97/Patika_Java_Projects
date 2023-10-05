package Week_04.Advanture_Game.Adenture_Game;

public class Forest extends CombatZone {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 1);
    }
}
