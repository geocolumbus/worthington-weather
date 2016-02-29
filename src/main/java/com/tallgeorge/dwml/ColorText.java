package com.tallgeorge.dwml;

/**
 * Colorized Text
 */
public enum ColorText {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    RESET("\u001B[0m");

    private final String color;

    ColorText(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

