import ru.ifmo.se.pokemon.*;

public class BattleInvalidov {
    public static void main(String[] args) {
        Battle b = new Battle();
        Keldeo p1 = new Keldeo("Белый пони", 20);
        b.addAlly(p1);
        Floatzel p3 = new Floatzel("Стильный Барсук", 100);
        b.addAlly(p3);
        Marill p5 = new Marill("Шар С Ушами", 100);
        b.addAlly(p5);
        Azumarill p6 = new Azumarill("Яйцеголовый", 100);
        b.addFoe(p6);
        Buizel p2 = new Buizel("Хорек Самолет", 100);
        b.addFoe(p2);
        Azurill p4 = new Azurill("Неваляшка", 100);
        b.addFoe(p4);
        b.go();
    }
}