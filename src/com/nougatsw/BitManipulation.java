package com.nougatsw;

public class BitManipulation {
    public static void main(String[] args) {
        int red = ARGB.pack(255, 0xFF, 0xA1, 0x12);
        System.out.printf("0x%X%n", red);
        System.out.printf("0x%X%n", ARGB.getAlpha(red));
        System.out.printf("0x%X%n", ARGB.getRed(red));
        System.out.printf("0x%X%n", ARGB.getGreen(red));
        System.out.printf("0x%X%n", ARGB.getBlue(red));
    }
}
