package com.github.jill252512003;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class aaTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        aa triangle = new aa(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
