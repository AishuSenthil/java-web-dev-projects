package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsRetrunsOne(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void BracketReturnTrueTwo(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(("[LaunchCode]")));
    }

    @Test
    public void BracketReturnTrueThree(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BracketReturnTrueFour(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void BracketReturnsTrueFive(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void BracketReturnsTrueSix(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void BracketReturnFalseOne(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void BracketReturnFalseTwo(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void BracketReturnFalseThree(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void BracketReturnsFalseFour(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void BracketReturnsFalseFive(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void BracketReturnsFalseSix(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
}


