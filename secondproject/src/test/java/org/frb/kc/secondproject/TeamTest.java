package org.frb.kc.secondproject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class TeamTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConstructionWithNameKansasCityRoyals() {
        Team team = new Team("Kansas City Royals");
        assertEquals("Kansas City Royals", team.getName());
    }

    @Test
    public void testConstructionWithANameCincinnatiReds() {
        Team team = new Team("Cincinnati Reds");
        assertEquals("Cincinnati Reds", team.getName());
    }

    @Test
    public void testConstructionShouldNotAcceptAnEmptyString() {
        try {
            Team team = new Team("");
            fail("This shouldn't have succeeded");
        } catch (IllegalArgumentException iae) {
            asserTrue(true);
        }

    }

    @Test
    public void testConstructionShouldNotAcceptANull() {
        try {
            Team team = new Team(null);
            fail("This shouldn't have succeeded");
        } catch (NullPointerException npe) {
            asserTrue(true);

        }

    }

    @Test
    public void testTeamEquality(){
        Team team1 = new Team("Brooklyn Nets");
        Team team2 = new Team("Brooklyn Nets");
        assertFalse(team1 == team2);        //false
        assertTrue(team1.equals(team2));    //false
    }


}
