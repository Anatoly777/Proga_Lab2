package MyAtt;
import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown(){
        super(Type.NORMAL, 90, 0.85);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.HP, (int) (p.getHP() - 0.25 * p.getStat(Stat.ATTACK)));
    }
}