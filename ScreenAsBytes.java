public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        int bitsPerRow = width/8;
        int jumpToBit = bitsPerRow*y;
        if (x > 7) {
        	int xdiv8 = x/8;
        	x -= 8 * xdiv8;
        	jumpToBit += xdiv8;
        }
        screen[jumpToBit] |= (1 << 7-x);
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }

}