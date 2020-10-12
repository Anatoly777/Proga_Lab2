package MyPok;
import ru.ifmo.se.pokemon.*;

public class Buizel extends Pokemon {
    public Buizel(String name, int level){
        super(name, level);
        setStats(55, 65, 35, 60, 30, 85 );
        setType(Type.WATER);
        setMove(new MyAtt.Agility(), new MyAtt.IceBeam(), new MyAtt.Waterfall());
    }
}
