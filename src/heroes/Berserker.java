package heroes;

public class Berserker extends Hero{

    protected static int BERSERKER_HIT_POINTS;
    protected static int DAMAGE_AMOUNT;

    protected Berserker(String name, int hitPoints) {
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
