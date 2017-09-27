public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {


        String [] singlechara = a.split("");
        String [] singlecharb = b.split("");

        // single edit check
        if (singlechara.length == singlecharb.length) {
            int count = 0;
            for (int z = 0; z < singlechara.length; z++) {
                if (!singlechara[z].equals(singlecharb[z])) {
                    count++;
                }
                if (count > 1) {
                    return null;

                }
            }
        }

        // replace
        if (singlechara.length == singlecharb.length) {
            for (int i = 0; i < singlechara.length; i++) {

                if (!singlechara[i].equals(singlecharb[i])) {
                    return "replace," + i + "," + singlecharb[i];

                }

            }
        }

        // remove
        if (singlechara.length - 1 == singlecharb.length) {

            for (int j = 0; j < singlecharb.length; j++) {

                if (!singlechara[j].equals(singlecharb[j])) {

                    String tempwordd = a.substring(0, j) + a.substring(j+1);


                    if (tempwordd.equals(b)) {

                        return "remove," + j;
                    }



                    return null;


                }

            }
        }

        // insert
        if (singlechara.length + 1 == singlecharb.length) {

            for (int k = 0; k < singlechara.length; k++) {

                if (!singlechara[k].equals(singlecharb[k])) {

                    char temp = b.charAt(k);
                    String tempword = a.substring(0, k) + temp + a.substring(k);
                    if (tempword.equals(b)) {

                        return "insert," + k + "," + singlecharb[k];

                    }

                }
                //insert after last char
                if (k == singlechara.length - 1) {
                    char temp = b.charAt(singlechara.length);
                    String tempword = a.substring(0, singlechara.length) + temp;
                    if (tempword.equals(b)) {

                        return "insert," + singlechara.length + "," + singlecharb[singlechara.length];
                    }
                }

            }

        }

        return null;
    }

}
