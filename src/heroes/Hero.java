package heroes;

import game.Team;

public abstract class Hero extends Object{

    String name;
    int hitPoints;
    int MAX_HITPOINTS;

    protected Hero(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.MAX_HITPOINTS = hitPoints;
    }

    public abstract void attack(Hero enemy);

    //Factory Method
    public static Hero create(Heroes.Role role, Team team, Party party){
        if(role == Heroes.Role.BERSERKER){
            return new Berserker(team);
        }else if(role == Heroes.Role.TANK){
            return new Tank(team);
        }else{
            return new Healer(team, party);
        }
    }

    public String getName(){

        return this.name;
    }

    public abstract Heroes.Role getRole();

    public boolean hasFallen(){
        if (this.hitPoints <= 0){
            System.out.println(this.name + " has fallen!");
            return true;
        }
        return false;
    }

    public void heal(int amount){
        /*if( (MAX_HITPOINTS - hitPoints) >= amount){
            System.out.println(String.format("%1$s heals %2$s points", this.name, amount));
        }else{
            System.out.println(this.name + " hitpoints at max.");
        }*/

        this.hitPoints += amount;
    }

    public void takeDamage(int amount){
        System.out.println(this.name + " takes " + amount + " damage");
        this.hitPoints -= amount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getRole() + " " + this.hitPoints + "/" + this.MAX_HITPOINTS;
    }
}
