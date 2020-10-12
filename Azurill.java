package MyPok;
import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon {
    public Azurill(String name, int level){
        super(name, level);
        setStats(50, 20, 40, 30, 40, 20 );
        setType(Type.FAIRY, Type.NORMAL);
        setMove(new WorkUp(), new Waterfall());
    }
}
