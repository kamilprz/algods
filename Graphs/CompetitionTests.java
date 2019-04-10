import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CompetitionTests {

    @Test
    public void testDijkstraConstructor() {
        CompetitionDijkstra dijkstra = new CompetitionDijkstra("tinyEWD.txt", 50, 80, 60);
        assertEquals("constructor failed with valid input", dijkstra.slowest, 50);
    }

    @Test
    public void testDijkstra() {
        CompetitionDijkstra dijkstra = new CompetitionDijkstra("tinyEWD.txt", 50,80,60);
        assertEquals("Test competition with TINYEWD", 38, dijkstra.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra1 = new CompetitionDijkstra("TINYsdfgdfgEWD.txt", 50, 80, 60);
        assertEquals("Test competition with invalid filename", -1, dijkstra1.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra2 = new CompetitionDijkstra("tinyEWD.txt", -1, 80, 60);
        assertEquals("Test competition with negative speed", -1, dijkstra2.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra3 = new CompetitionDijkstra(null, 50, 80, 60);
        assertEquals("Test competition with null filename", -1, dijkstra3.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra4 = new CompetitionDijkstra("tinyEWD-2.txt", 50, 80, 60);
        assertEquals("Test competition with node that doesn't have path", -1, dijkstra4.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra5 = new CompetitionDijkstra("input-J.txt", 98, 70, 84);
        assertEquals("Test competition with speeds fine?", -1, dijkstra5.timeRequiredforCompetition());

        CompetitionDijkstra dijkstra6 = new CompetitionDijkstra("tinyEWD.txt", 5, 80, 60);
        assertEquals("Test competition with less than 50 speed", -1, dijkstra6.timeRequiredforCompetition());
    }



    @Test
    public void testFWConstructor() {
        CompetitionFloydWarshall floyWar = new CompetitionFloydWarshall("input-I.txt", 60,70,84);
        assertEquals("constructor failed with valid input", floyWar.slowest, 60);
    }

    @Test
    public void testFloyWar() {
        CompetitionFloydWarshall floyWar = new CompetitionFloydWarshall("tinyEWD.txt", 50,80,60);
        assertEquals("Test competition with TINYEWD", 38, floyWar.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar1 = new CompetitionFloydWarshall("TINYsdfgdfgEWD.txt", 50, 80, 60);
        assertEquals("Test competition with invalid filename", -1, floyWar1.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar2 = new CompetitionFloydWarshall("tinyEWD.txt", -1, 80, 60);
        assertEquals("Test competition with negative speed", -1, floyWar2.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar3 = new CompetitionFloydWarshall(null, 50, 80, 60);
        assertEquals("Test competition with null filename", -1, floyWar3.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar4 = new CompetitionFloydWarshall("tinyEWD-2.txt", 50, 80, 60);
        assertEquals("Test competition with node that doesn't have path", -1, floyWar4.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar5 = new CompetitionFloydWarshall("input-J.txt", 98, 70, 84);
        assertEquals("Smile", -1, floyWar5.timeRequiredforCompetition());

        CompetitionFloydWarshall floyWar6 = new CompetitionFloydWarshall("tinyEWD.txt", 5, 80, 60);
        assertEquals("Test competition with less than 50 speed", -1, floyWar6.timeRequiredforCompetition());
    }

    //TODO - more tests

}