package org.github.integration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void greet() {
        assertEquals("Namaste from github-jenkins-integration", Main.greet());
    }
}