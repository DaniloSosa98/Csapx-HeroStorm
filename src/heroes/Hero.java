package heroes;

import game.Team;

public abstract class Hero extends Object{

    String name;
    int hitPoint;

    protected Hero(String name, int hitPoints) {
    }

    abstract void attack(Hero enemy);

    static Hero create(Heroes.Role role, Team team, Party party){

    }

    String getName(){

        return this.name;
    }

    abstract Heroes.Role getRole();

    boolean hasFallen(){
        if (this.hitPoint == 0){
            return true;
        }
        return false;
    }

    void heal(int amount){

        this.hitPoint += amount;
    }

    void takeDamage(int amount){

        this.hitPoint -= amount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getRole() + " " + this.hitPoint;
    }
}
