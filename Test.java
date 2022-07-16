import org.junit.jupiter.api.Test;

import java.awt.Rectangle;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    private final double EPSILON = 1e-10;

    @Test
    public void test_problem1_10() {
        Monster monster = new Monster();
        Dragon dragon = new Dragon(true);
        Zombie zombie = new Zombie(10.0);
        EvilRobot robot = new EvilRobot(1000);
        MadClown clown = new MadClown(false);
        PotOfGold gold = new PotOfGold(10);
        TreasureChest chest = new TreasureChest(1000);
        GameElement[] gameElements = {
                monster,
                dragon,
                zombie,
                robot,
                clown,
                gold,
                chest
        };
        Stompable[] stompables = {
                monster,
                dragon,
                zombie,
                robot
        };
        for (GameElement element : gameElements) {
            element.tick();
            element.tick();
        }
        assertEquals(80, ((Monster)gameElements[0]).getHealth());
        assertEquals("blue", ((Monster)gameElements[0]).getColor());
        assertEquals(60, ((Dragon)gameElements[1]).getHealth());
        assertEquals(true, ((Dragon)gameElements[1]).isFireBreathing());
        assertEquals(12, ((PotOfGold)gameElements[5]).getNumPieces());
        assertEquals(902.5, ((TreasureChest)gameElements[6]).getWeight());
        int [] expected = new int [] {100, -50, 0, 0, -10};
        for (int i = 0; i < stompables.length; i++) {
            assertEquals(expected[i], stompables[i].stompOn());
        }
        assertEquals(0, ((Monster)gameElements[0]).getHealth());
        assertEquals("red", ((Monster)gameElements[0]).getColor());
        assertEquals(100, ((Dragon)gameElements[1]).getHealth());
        assertEquals(false, ((Dragon)gameElements[1]).isFireBreathing());
    }

    @Test
    public void test_problem11_16() {
        Telemarketer telemarketer = new Telemarketer("Jose");
        Sibling s1 = new Sibling("Mollie");
        Sibling s2 = new Sibling("Corey");
        Pest[] pests = {
                telemarketer,
                s1,
                s2,
                new Ad(),
                new Ad(),
                new Fly()
        };
        String [] expected = new String [] {
                "Call during dinner\nContinue talking when you say no",
                "Tease you about your insecurities\nLaugh at you when you are mad",
                "Tease you about your insecurities\nLaugh at you when you are mad",
                "Block something you really want to see\nDon't go away even when you click X",
                "Block something you really want to see\nDon't go away even when you click X",
                "Fly around your head\nLand on things",
        };
        for (int i = 0; i < pests.length; i++) {
            assertEquals(expected[i], pests[i].annoy());
        }

        Person[] people = { telemarketer, s1, s2 };
        Arrays.sort(people); // people is now sorted: Corey, Jose, Mollie
        String [] expected_name = new String [] {"Corey", "Jose", "Mollie"};
        for (int i = 0; i < people.length; i++){
            assertEquals(expected_name[i], people[i].getName());
        }
    }

    @Test
    public void test_problem17_20() {
        Measurer m = new PerimeterMeasurer();
        Filter filter = new PerimeterFilter();
        Rectangle rects[] = new Rectangle[4];
        rects[0] = new Rectangle(5, 10, 20, 30);
        rects[1] = new Rectangle(22, 3, 15, 20);
        rects[2] = new Rectangle(10, 20, 30, 40);
        rects[3] = new Rectangle(20, 30, 5, 10);
        assertEquals(66.66666666666667, Data.average(rects, m, filter), EPSILON);
        assertEquals(new Rectangle(5,10,20,30), Data.max(rects, m, filter));
    }
}

