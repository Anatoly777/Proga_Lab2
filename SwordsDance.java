package MyAtt;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL, 0, 0.00);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, (int) (p.getStat(Stat.ATTACK) + 2));
    }
}
