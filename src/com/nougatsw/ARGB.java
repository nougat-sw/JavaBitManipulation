package com.nougatsw;

public class ARGB {
    public static int pack(int alpha, int red, int green, int blue) {
        return
                (alpha & 0xFF) << 24                //A
                        | (red & 0xFF) << 16        //R
                        | (green & 0xFF) << 8       //G
                        | (blue & 0xFF);            //B
    }

    public static int getAlpha(int color) {
        return (color >> 24) & 0xFF;
    }

    public static int getRed(int color) {
        return (color >> 16) & 0xFF;
    }

    public static int getGreen(int color) {
        return (color >> 8) & 0xFF;
    }

    public static int getBlue(int color) {
        return color & 0xFF;
    }

    public static int setAlpha(int color, int alpha) {
        return (color & ~(0xFF << 24)) | ((alpha & 0xFF) << 24);
    }

    public static int setRed(int color, int red) {
        return (color & ~(0xFF << 16)) | ((red & 0xFF) << 16);
    }

    public static int setGreen(int color, int green) {
        return (color & ~(0xFF << 8)) | ((green & 0xFF) << 8);
    }

    public static int setBlue(int color, int blue) {
        return (color & ~0xFF) | (blue & 0xFF);
    }
}