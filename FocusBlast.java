package MyAtt;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120, 0.70);
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE, (int) (p.getStat(Stat.SPECIAL_DEFENSE) - 1));
        }
    }
}