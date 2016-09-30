public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        int bitsPerRow = width/8;
        int jumpToBit = bitsPerRow*y;
        byte b = screen[jumpToBit];
        b |= (1 << 7-x);
        screen[jumpToBit] = b;
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }

    public static void main(String[] args) {
    	byte[] screen = new byte[6];
    	setPixel(screen, 16, 2, 0);
    	//setPixel(screen, 16, 5, 1);
    }
}
