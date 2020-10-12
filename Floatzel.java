package MyPok;
import ru.ifmo.se.pokemon.*;

public class Floatzel extends MyPok.Buizel {
    public Floatzel(String name, int level){
        super(name, level);
        setStats(85, 105, 55, 85, 50, 115 );
        setType(Type.WATER);
        setMove(new MyAtt.Agility(), new MyAtt.IceBeam(), new MyAtt.Waterfall(), new MyAtt.IceFang());
    }
}

