package Week_02.Fighting_Game;

public class Main {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("Mike",30,120,100,100,70);
        Fighter f2 = new Fighter("George",25,120,85,50,30);

        Brawl brawl = new Brawl(f1,f2,85,100);
        brawl.run();
    }
}
