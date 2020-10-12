package MyPok;
import ru.ifmo.se.pokemon.*;

public class Azumarill extends MyPok.Marill{
    public Azumarill(String name, int level){
        super(name, level);
        setStats(100, 50, 80, 60, 80, 50 );
        setType(Type.FAIRY, Type.WATER);
        setMove(new MyAtt.WorkUp(), new MyAtt.Waterfall(), new MyAtt.Amnesia(), new MyAtt.AquaRing());
    }
}
