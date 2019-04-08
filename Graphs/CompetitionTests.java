import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CompetitionTests {

    @Test
    public void testFWConstructor() {

        CompetitionFloydWarshall floyWar = new CompetitionFloydWarshall("input-I.txt", 60,70,84);
        assertEquals("constructor failed with valid input", floyWar.slowest, 60);

        floyWar = new CompetitionFloydWarshall("input-J.txt", 70,60,84);
        assertEquals("constructor failed with valid input", floyWar.slowest, 60);

        floyWar = new CompetitionFloydWarshall("input-J.txt", 90,60,50);
        assertEquals("constructor failed with valid input", floyWar.slowest, 50);

        floyWar = new CompetitionFloydWarshall("notARealFile.txt", 70,60,84);
        assertEquals("constructor failed with valid input", floyWar.validFile, false);

    }

    @Test
    public void testFW() {
        CompetitionFloydWarshall floyWar = new CompetitionFloydWarshall("input-I.txt", 60,70,84);
        assertEquals("constructor failed with valid input", floyWar.slowest, 60);
        floyWar.timeRequiredforCompetition();

        floyWar = new CompetitionFloydWarshall("input-J.txt", 70,60,84);
        assertEquals("constructor failed with valid input", floyWar.slowest, 60);

        floyWar = new CompetitionFloydWarshall("input-J.txt", 90,60,50);
        assertEquals("constructor failed with valid input", floyWar.slowest, 50);
    }

    //TODO - more tests

}