package heroes;

import game.Team;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Hero{

    protected static int HEALER_HIT_POINTS = 35;
    protected static int HEAL_AMOUNT = 10;
    protected static int DAMAGE_AMOUNT = 10;
    protected Party party;

    protected Healer(Team team, Party party) {
        super(Heroes.getName(team, Heroes.Role.HEALER), HEALER_HIT_POINTS);
        this.party = party;
        this.MAX_HITPOINTS = HEALER_HIT_POINTS;
    }


    @Override
    public void attack(Hero enemy) {
        System.out.println(String.format("%1$s heals %2$s points", this.name, HEAL_AMOUNT));
        if((this.MAX_HITPOINTS - this.hitPoints) >= HEAL_AMOUNT){

            this.heal(HEAL_AMOUNT);
        }else{
            this.hitPoints = this.MAX_HITPOINTS;
        }


        for (int i = 0; i < this.party.getHeroes().size(); i++) {
            System.out.println(String.format("%1$s heals %2$s points", this.party.getHeroes().get(i).name, HEAL_AMOUNT));
            if( (this.party.getHeroes().get(i).MAX_HITPOINTS - this.party.getHeroes().get(i).hitPoints) >= HEAL_AMOUNT){

                this.party.getHeroes().get(i).heal(HEAL_AMOUNT);
            }else{
                this.party.getHeroes().get(i).hitPoints = this.party.getHeroes().get(i).MAX_HITPOINTS;
            }
        }

        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    @Override
    public Heroes.Role getRole() {

        return Heroes.Role.HEALER;
    }
}
