public class Experiment {

    public static void main(String[] args) {

        double[] ergebnisse = {1.3, 4.5, 2.6, 4.7, 1.8};
        //ergebnisse[0] = 1.3;
        //ergebnisse[1] = 1.3;
        double sum = 0;

        for (int i = 0; i < ergebnisse.length; i++) {
            sum = sum + ergebnisse[i];
            //altesum + ergebnisse[mit den jeweiigen index] = neuesum
            //0 + 1.3 = 1.3;
            //1.3 + 4.5 = 5.8;
        }
        System.out.println(sum/ergebnisse.length);
    }

}
