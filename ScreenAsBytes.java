public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {

        int height = screen.length / (width / 8);


        // what bit in the byte to edit
        byte findbit = (byte) (1 << (8 - (x + 1)));


        // which byte to edit
        if (x < (width / (width/8))) {
            screen[((y + y))] = findbit;
        }

        if (x >= (width / (width/8))) {
            screen[((y + y) + 1)] = findbit;

        }


    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {

        // draw line






        for (int z = startX; z <= endX; z++) {
            byte draw = (byte) (1 << (8 - (z +1)));

            System.out.println(draw);
            // byte draw = (byte) ( 4 << (int) (((Math.ceil(((y * width + z) / 8)))) - 1));


            screen[(int) (Math.ceil((((y * width) + z) / 8))) - 1] =draw;
            ;


               // byte draw = (byte) (1 << (8 - (startX + z)));

               // if(z == width / (y +1)){

                    // z = z - (width / (y +1));
                }



               // System.out.println(draw);

               // System.out.println((((y * width) + z)/8) + " -  ");






           // if (z >= 8) {
             //   byte drawsecond = (byte) (1 << (8 - ((z-8) +1 )));

               // System.out.println(drawsecond);
            //    screen[((y + y) + 1)] = drawsecond;
           // }


        }









//}

    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }


}
