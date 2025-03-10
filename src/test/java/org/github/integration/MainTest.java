package org.github.integration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void greet() {
        assertEquals("Namaste from github-jenkins-integration", Main.greet());
    }
}