public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {


        String [] singlechara = a.split("");
        String [] singlecharb = b.split("");

        // replace
        if(singlechara.length == singlecharb.length) {
            for (int i = 0; i < singlechara.length; i++) {

                if (!singlechara[i].equals(singlecharb[i])) {

                    return "replace," + i + "," + singlecharb[i];

                }

            }
        }

        //remove
        if(singlechara.length-1 == singlecharb.length){

            for (int j = 0; j < singlechara.length; j++) {

                if (!singlechara[j].equals(singlecharb[j])) {

                    return "remove," + j;

                }


            }
        }

        //insert
        if(singlechara.length+1 == singlecharb.length){

            for (int k = 0; k < singlechara.length; k++){



                if (!singlechara[k].equals(singlecharb[k])) {

                    return "insert," + k + "," + singlecharb[k];

                }


                if(k == singlechara.length-1){
                    return "insert," + singlechara.length + "," + singlecharb[singlechara.length];
                }


            }

        }


        return null; // this is only here to make it compile
    }

}
