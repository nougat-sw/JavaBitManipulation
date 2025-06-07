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
}
