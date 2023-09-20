package Week_02.Fighting_Game;

public class Fighter {
    String name;
    int damage;
    int stamina;
    int weight;
    double dodge;
    double start_chance;

    Fighter(String name,int damage,int stamina,int weight,double dodge,double start_chance){

        this.name = name;
        this.damage = damage;
        this.stamina = stamina;
        this.weight = weight;
        this.dodge = dodge;
        this.start_chance =start_chance;
    }

    int hit(Fighter opponent){
        System.out.println("---------");
        System.out.println(this.name+ " deals "+this.damage +" damage"+ " => "+ opponent.name);

        if (opponent.isDodge()){
            System.out.println(opponent.name + " dodged ! ");
            return opponent.stamina;
        }

        if (opponent.stamina-this.damage <0)
            return 0;

        return opponent.stamina - this.damage;

    }

    public boolean isDodge(){
        double randomNumber = Math.random()*100;
        return  randomNumber <= this.dodge;
    }

    //here added new method attached to starting_chance parameter for each fighter ,and it will decide who will start the fight !
    public boolean starting_chance(){
        double randomNumber2 = Math.random()*100;
        return randomNumber2 <= this.start_chance;
    }


}
