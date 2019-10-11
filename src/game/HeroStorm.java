package game;

import heroes.Hero;

public class HeroStorm extends Object{

    int dragonSeed;
    int lionSeed;
    HeroParty dragons;
    HeroParty lions;

    public HeroStorm(int dragonSeed, int lionSeed) {
        this.dragonSeed = dragonSeed;
        this.lionSeed = lionSeed;
        this.dragons = new HeroParty(Team.DRAGON, this.dragonSeed);
        this.lions = new HeroParty(Team.LION , this.lionSeed);
        play();
    }

    public static void main(String[] args) {
        /*If you want to try it change the values from here*/
        int dS = 5;
        int lS = 7;
        HeroStorm game= new HeroStorm(dS, lS);

        /*This gets the seed from the CMD, but the CDM kept giving me problems
        that I couldn't solve/*
         */
        /*if(args.length == 2){
            //int dS = args[0].charAt(args[0].length() - 1);
            //int lS = args[1].charAt(args[1].length() - 1);
        } else{
            System.out.println("Incorrect arguments\nUsage: java HeroStorm dragon_seed_# lion_seed_#");
        }*/

    }

    void play(){
        //i is a counter to identify the turns
        int i = 0;
        //over it he boolean for my game turns 'do while'
        boolean over = true;

        do{
            //if the dragon team is empty, then lions won
            if(this.dragons.getHeroes().size() == 0){

                System.out.println("\nTeam Lion wins!");
                over = false;

                //if the lion team is empty, then dragons won
            } else if(this.lions.getHeroes().size() == 0){
                System.out.println("\nTeam Dragon wins!");
                over = false;

                //if neither is empty keep playing
            } else{
                System.out.println("\nBATTLE #" + (i+1) + "\n==========");

                System.out.println("DRAGON:");
                System.out.println(this.dragons.getHeroes() + "\n");
                System.out.println("LION:");
                System.out.println(this.lions.getHeroes() + "\n");

                //grab heroes from the front
                Hero tempD = this.dragons.removeHero();
                Hero tempL = this.lions.removeHero();

                //dragon start with the first turn (when i is even)
                if(i%2 == 0){
                    System.out.println("*** " + tempD.getName() + " vs " + tempL.getName() + "!\n");
                    tempD.attack(tempL);

                    //if lion survived the attack he attacks and is added at the end of the list
                    if(!tempL.hasFallen()){
                        tempL.attack(tempD);
                        this.lions.addHero(tempL);
                    }
                    //if dragon survived, then is added at the end of the list
                    if(!tempD.hasFallen()){
                        this.dragons.addHero(tempD);
                    }
                //lions start turn when i is odd
                } else {

                    System.out.println("*** " + tempL.getName() + " vs " + tempD.getName() + "!\n");
                    tempL.attack(tempD);

                    //if dragon survived the attack he attacks and is added at the end of the list
                    if(!tempD.hasFallen()){
                        tempD.attack(tempL);
                        this.dragons.addHero(tempD);
                    }
                    //if lion survived, then is added at the end of the list
                    if(!tempL.hasFallen()){
                        this.lions.addHero(tempL);
                    }
                }

                i++;
            }


        }while( over );

    }
}
