package MyAtt;
import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER, 80, 1);
    }
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2){
            Effect.flinch(pokemon);
        }
    }
}