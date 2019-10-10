package heroes;

import game.Team;

public class Tank extends Hero{

    protected static int DAMAGE_AMOUNT;
    protected static double SHIELD_DMG_MULTIPLIER;
    protected static int TANK_HIT_POINTS;

    protected Tank(String name, int hitPoints) {
        super(name, hitPoints);
    }


    void attack(Hero enemy){

    }

    Heroes.Role getRole(){
        return this.getRole();
    }

    void takeDamage(int amount){

    }
}
