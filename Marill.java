package MyPok;
import ru.ifmo.se.pokemon.*;

public class Marill extends MyPok.Azurill {
    public Marill(String name, int level){
        super(name, level);
        setStats(70, 20, 50, 20, 50, 40 );
        setType(Type.FAIRY, Type.WATER);
        setMove(new MyAtt.WorkUp(), new MyAtt.Waterfall(), new MyAtt.Amnesia());
    }
}