package heroes;

public class Healer extends Hero{

    protected static int HEALER_HIT_POINTS;
    protected static int HEAL_AMOUNT;
    protected static int DAMAGE_AMOUNT;

    protected Healer(String name, int hitPoints) {
        super(name, hitPoints);
    }


    @Override
    void attack(Hero enemy) {

    }

    @Override
    Heroes.Role getRole() {
        return null;
    }
}
