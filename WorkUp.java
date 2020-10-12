package MyAtt;
import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(){
        super(Type.NORMAL, 0, 0.00);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, (int) (p.getStat(Stat.ATTACK) + 1));
        p.setMod(Stat.SPECIAL_ATTACK, (int) (p.getStat(Stat.SPECIAL_ATTACK) + 1));
    }
}
