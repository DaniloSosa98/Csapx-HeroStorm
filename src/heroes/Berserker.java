package heroes;

import game.Team;

public class Berserker extends Hero{

    protected static int BERSERKER_HIT_POINTS = 30;
    protected static int DAMAGE_AMOUNT = 20;

    protected Berserker(Team team) {
        super(Heroes.getName(team, Heroes.Role.BERSERKER), BERSERKER_HIT_POINTS);
        this.MAX_HITPOINTS = BERSERKER_HIT_POINTS;
    }

    @Override
    public void attack(Hero enemy) {
        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    @Override
    public Heroes.Role getRole() {

        return Heroes.Role.BERSERKER;
    }


}
