package Week_04.Advanture_Game.Adenture_Game;

public class SafeHouse extends NeutralZone {
    public SafeHouse(Player player) {
        super(player, "SafeHouse");
    }


    @Override
    public boolean onLocation() {
        System.out.println("===========================");
        System.out.println("You're in SafeHouse now ! ");
        System.out.println("Stamina is regenerated ! ");
        this.getPlayer().setStamina(this.getPlayer().getBaseStamina());
        return true;
    }
}
