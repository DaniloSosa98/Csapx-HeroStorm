package heroes;

import game.Team;

public class Tank extends Hero{

    protected static int DAMAGE_AMOUNT = 15;
    protected static double SHIELD_DMG_MULTIPLIER = 0.90;
    protected static int TANK_HIT_POINTS = 40;

    protected Tank(Team team) {
        super(Heroes.getName(team, Heroes.Role.TANK), TANK_HIT_POINTS);
        this.MAX_HITPOINTS = TANK_HIT_POINTS;
    }


    public void attack(Hero enemy){
        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    public Heroes.Role getRole(){

        return Heroes.Role.TANK;
    }

    public void takeDamage(int amount){
        System.out.println(this.name + " takes " + Math.floor(amount * SHIELD_DMG_MULTIPLIER) + " damage");
        this.hitPoints -= Math.floor(amount * SHIELD_DMG_MULTIPLIER);
    }
}
