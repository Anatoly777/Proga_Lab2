package MyAtt;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends StatusMove {
    public IceBeam(){
        super(Type.ICE, 90, 1);
    }
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1){
            Effect.freeze(pokemon);
        }
    }
}