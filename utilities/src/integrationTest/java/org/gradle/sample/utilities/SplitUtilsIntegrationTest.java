package org.gradle.sample.utilities;

import org.gradle.sample.list.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitUtilsIntegrationTest {
    @Test public void testSplit() {
        String source = "test 123";
        LinkedList split = SplitUtils.split(source);
        Assertions.assertEquals(2, split.size());
    }
}
