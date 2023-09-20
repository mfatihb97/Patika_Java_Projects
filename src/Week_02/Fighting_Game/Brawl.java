package Week_02.Fighting_Game;

public class Brawl {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Brawl(Fighter f1,Fighter f2,int minWeight,int maxWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight = minWeight;
        this.maxWeight =maxWeight;
    }

    public void run(){
        if(isCheck()){
            if(f1.starting_chance()){                                       //here we add if-clause to decide starter
                System.out.println(f1.name + " will start the fight!");
                 while (f1.stamina >0 && f2.stamina>0){
                 System.out.println("====NEW ROUND====");
                 f2.stamina = f1.hit(f2);
                 if (isWin()){
                    break;
                 }
                 f1.stamina = f2.hit(f1);
                 if (isWin()){
                   break;
               }
                System.out.println(f1.name+" Stamina : " +f1.stamina );
                System.out.println(f2.name+" Stamina : " +f2.stamina );
            }
            }else{
                    System.out.println(f2.name + " will start the fight!");
                    while (f1.stamina >0 && f2.stamina>0){
                    System.out.println("====NEW ROUND====");
                    f1.stamina = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.stamina = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(f1.name+" Stamina : " +f1.stamina );
                    System.out.println(f2.name+" Stamina : " +f2.stamina );
                }

            }

        }else {
            System.out.println("Weights don't match ! ");
        }
    }

    boolean isCheck(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight)&&(f2.weight>=minWeight && f2.weight<= maxWeight);
    }

    boolean isWin(){
        if(this.f1.stamina==0){
            System.out.println(f2.name+ " won!");
            return true;

        }

        if(this.f2.stamina==0){
            System.out.println(f1.name+ " won!");
            return true;
        }

        return false;
    }
}
