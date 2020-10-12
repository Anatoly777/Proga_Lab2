package MyAtt;
import ru.ifmo.se.pokemon.*;

public class IceFang extends PhysicalMove {
    public IceFang(){
        super(Type.ICE, 65, 0.95);
    }
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1){
            Effect.freeze(pokemon);
        }
        if (Math.random() < 0.1){
            Effect.flinch(pokemon);
        }
    }
}