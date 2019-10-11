package game;

import heroes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HeroParty extends Object implements Party{

    Team team;
    int seed;
    protected ArrayList<Hero> list = new ArrayList<>();

    public HeroParty(Team team, int seed) {
        this.team = team;
        this.seed = seed;
        this.list.add(Hero.create(Heroes.Role.BERSERKER, team, this));
        this.list.add(Hero.create(Heroes.Role.HEALER, team, this));
        this.list.add(Hero.create(Heroes.Role.TANK, team, this));
        Collections.shuffle(this.list, new Random(seed));
    }

    @Override
    public void addHero(Hero hero) {
        this.list.add(hero);
    }

    @Override
    public Hero removeHero() {
        return list.remove(0);
    }

    @Override
    public int numHeroes() {

        return list.size();
    }

    @Override
    public Team getTeam() {

        return this.team;
    }

    @Override
    public ArrayList<Hero> getHeroes() {

        return this.list;
    }
}
