public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        int bytesPerRow = width/8;
        int byteToChange = bytesPerRow*y;
        if (x > 7) {
        	int byteIndexInRow = x/8;
        	x -= 8 * byteIndexInRow;
        	byteToChange += byteIndexInRow;
        }
        screen[byteToChange] |= (1 << 7-x);
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        for (int i = startX; i < endX+1; i++) {
        	setPixel(screen, width, i, y);
        }
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        for (int i = startY; i < endY+1; i++) {
        	setPixel(screen, width, x, i);
        }
    }

}