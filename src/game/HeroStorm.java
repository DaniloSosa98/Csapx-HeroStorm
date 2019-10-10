package game;

public class HeroStorm extends Object{

    int dragonSeed;
    int lionSeed;

    public HeroStorm(int dragonSeed, int lionSeed) {
        this.dragonSeed = dragonSeed;
        this.lionSeed = lionSeed;
    }

    public static void main(String[] args) {
        if(args.length == 2){
            for(int i = 0; i  < args.length; i++){
                System.out.println(args[i].charAt(args[i].length() - 1));
            }
        } else{
            System.out.println("Incorrect arguments\nUsage: java HeroStorm dragon_seed_# lion_seed_#");
        }

    }

    void play(){

    }
}
