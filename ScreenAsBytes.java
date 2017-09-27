public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {

        int height = screen.length / (width/8);


        // what bit in the byte to edit
        byte findbit = (byte) (1 << (8 - (x+1)));


        // which byte to edit
        if(x < (width / 2)) {
            screen[((y + y))] = findbit;
        }

        if(x >= (width/2)){
            screen[((y + y) + 1)] =findbit;

        }


    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }


}
