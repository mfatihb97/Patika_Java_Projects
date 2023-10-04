package Week_04.Advanture_Game;

public class NeutralZone extends Location {


    public NeutralZone(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
