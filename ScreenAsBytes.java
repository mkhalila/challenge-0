public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        int bitsPerRow = width/8;
        System.out.println("bits per row " + bitsPerRow);
        int jumpToBit = bitsPerRow*y;
        System.out.println("jum to bit " + jumpToBit);
        if (x > 7) {
        	int xdiv8 = x/8;
        	x -= 8 * xdiv8;
        	System.out.println("x = " + x);
        	jumpToBit += xdiv8;
        	System.out.println("jumpToBit " + jumpToBit);
        }
        screen[jumpToBit] |= (1 << 7-x);
        System.out.println("new value: " + screen[jumpToBit]);
        for (byte b : screen ) {
        	System.out.println(b);
        }
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }

    public static void main(String[] args) {
    	byte[] screen = new byte[12];
    	setPixel(screen, 32, 22, 2);
    }
}
