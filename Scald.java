package MyAtt;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER, 80, 1.00);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3){
            Effect.burn(pokemon);
        }
    }
}