package MyAtt;
import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing(){
        super(Type.WATER, 0, 0.00);
    }
    public static void hill(Pokemon var0) {
        Effect var1 = (new Effect()).turns(-1);
        var1.stat(Stat.HP, (int)var0.getStat(Stat.HP) / 16);
        var0.setCondition(var1);
    }
    protected void applySelfEffects(Pokemon p) {
        hill(p);
    }
}