import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class OopLearning {

    public static void main(String[] args) {
        System.out.println("Hello, Monster Game!");

        Goblin g1 = new Goblin(5, 10, 5, 2);
        System.out.println(g1.getHealth());
        g1.setHealth(-50);
        System.out.println(g1.isAlive());
        g1.setHealth(5);
        System.out.println(g1.getHealth());

        g1.GetAttackDamage();
        g1.GetAttackDamage(5);

        Dargon d1 = new Dargon();
        Goblin g2 = new Goblin(5, 2, 1, 10);
        Goblin g3 = new Goblin(5, 2, 1, 10);

    }
}