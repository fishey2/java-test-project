package com.thoughtworks.rover;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MarsRoverTest {

    @Test
    public void testThatFails() {
        Assert.assertTrue("This should fail", false);
    }

    @Test
    public void example() {
        assertTrue("This should pass", true);
    }
}
