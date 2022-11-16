package org.gradle.sample.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageUtilsIntegrationTest {

    @Test
    public void testGetMessage() {
        assertEquals("Hello,      World!", MessageUtils.getMessage());
    }
}
