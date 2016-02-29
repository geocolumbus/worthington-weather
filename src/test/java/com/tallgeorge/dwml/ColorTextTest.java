package com.tallgeorge.dwml;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTextTest {

    @Test
    public void testGetColor() throws Exception {
        assertEquals("\u001B[30m",ColorText.BLACK.getColor());
    }
}