package junit.FootyScore;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FootyScoreTests {

    FootyScore footyScore;

    @Before
    public void setupFootyScore() {
        this.footyScore = null;
    }

    @Test
    public void testConstruction() {
        this.footyScore = new FootyScore();
    }

    private boolean checkScores(FootyScore score, int goals, int behinds, int points) {
        return score.sayScore().equals(
                Integer.toString(goals) + ", " + Integer.toString(behinds) + ", " + points
        );
    }

    @Test
    public void testNone() {
        this.footyScore = new FootyScore();
        assertEquals(0, this.footyScore.getPoints());
    }

    @Test
    public void testKickGoal() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        assertEquals(6, this.footyScore.getPoints());
    }

    @Test
    public void testKickGoal2() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        this.footyScore.kickGoal();
        assertEquals(12, this.footyScore.getPoints());
    }

    @Test
    public void testBehindGoal() {
        this.footyScore = new FootyScore();
        this.footyScore.kickBehind();
        assertEquals(1, this.footyScore.getPoints());
    }

    @Test
    public void testBehindGoal2() {
        this.footyScore = new FootyScore();
        this.footyScore.kickBehind();
        this.footyScore.kickBehind();
        assertEquals(2, this.footyScore.getPoints());
    }

    @Test
    public void testBothGoal() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        this.footyScore.kickBehind();
        assertEquals(7, this.footyScore.getPoints());
    }

    @Test
    public void testBothGoal2() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        this.footyScore.kickGoal();
        this.footyScore.kickBehind();
        this.footyScore.kickBehind();
        assertEquals(14, this.footyScore.getPoints());
    }

    @Test
    public void testSayPoints() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        this.footyScore.kickBehind();
        assertTrue(checkScores(footyScore, 1, 1, 7));
    }

    @Test
    public void inFrontOf() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        FootyScore score2 = new FootyScore();
        score2.kickBehind();
        assertTrue(this.footyScore.inFrontOf(score2));
    }

    @Test
    public void notInFrontOf() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        FootyScore score2 = new FootyScore();
        score2.kickBehind();
        assertTrue(!score2.inFrontOf(this.footyScore));
    }

    @Test
    public void notInFrontOfEqual() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        FootyScore score2 = new FootyScore();
        score2.kickGoal();
        assertTrue(!score2.inFrontOf(this.footyScore));
    }

    @Test
    public void notInFrontOfEqualReversed() {
        this.footyScore = new FootyScore();
        this.footyScore.kickGoal();
        FootyScore score2 = new FootyScore();
        score2.kickGoal();
        assertTrue(!this.footyScore.inFrontOf(score2));
    }
}
