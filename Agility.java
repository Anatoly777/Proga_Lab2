package MyAtt;
import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public Agility(){
        super(Type.PSYCHIC, 0, 0);
    }
    protected void aplySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 1);
    }
}
