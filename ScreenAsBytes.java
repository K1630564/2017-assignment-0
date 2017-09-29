public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {

        int height = screen.length / (width / 8);


        // what bit in the byte to edit
        byte findbit = (byte) (1 << (8 - (x +1)));


        // which byte to edit
            screen[(int) Math.floor((double)(y * width + x) / 8)] = findbit;





    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {



        for (int z = startX; z <= endX; z++) {

            int index = (int) Math.floor((double)(y * width + z) / 8);


            byte draw = (byte) (1 << (8 - (z +1)));

            screen[index] +=draw;


            if(z % 7 == 0 ) {

                for (int q = (z % 7) ; q <= endX - 8; q++){

                    z++;

                    int indexx = (int) Math.floor((double)(y * width + z) / 8);

                    byte temp = (byte) (1 << (8 - (q +1)));

                    screen[indexx] +=temp;
                }


            }

                }





        }









//}

    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }


}
