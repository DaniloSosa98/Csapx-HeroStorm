package game;

import heroes.Hero;
import heroes.Party;

import java.util.List;

public class HeroParty extends Object implements Party{

    Team team;
    int seed;

    public HeroParty(Team team, int seed) {
        this.team = team;
        this.seed = seed;
    }

    @Override
    public void addHero(Hero hero) {

    }

    @Override
    public Hero removeHero() {
        return null;
    }

    @Override
    public int numHeroes() {
        return 0;
    }

    @Override
    public Team getTeam() {
        return null;
    }

    @Override
    public List<Hero> getHeroes() {
        return null;
    }
}
