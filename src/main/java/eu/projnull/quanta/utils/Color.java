package eu.projnull.quanta.utils;

public class Color {

    private byte red;
    private byte green;
    private byte blue;

    private Color(byte red, byte green, byte blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Color fromRGB(int r, int g, int b) throws Exception {
        if (r < 0 || g < 0 || b < 0 || r > 255 || g > 255 || b > 255) {
            throw new IllegalArgumentException("Some value out of color range!");
        }
        return new Color((byte) r, (byte) g, (byte) b);
    }

    public static Color fromHex(String hex) throws Exception {
        //TODO: Add HEX Convert
        throw new Exception("Not Implemented!");
    }

    public byte getRed() {
        return red;
    }

    public byte getBlue() {
        return blue;
    }

    public byte getGreen() {
        return green;
    }
}
