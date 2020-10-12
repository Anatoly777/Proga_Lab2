package MyAtt;
import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia(){
        super(Type.PSYCHIC, 0, 0.00);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, (int) (p.getStat(Stat.SPECIAL_DEFENSE) + 2));
    }
}