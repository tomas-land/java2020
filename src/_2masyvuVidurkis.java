public class _2masyvuVidurkis {


    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};


        int sumaA = 0;
        int sumaB = 0;
        for (int x : a) {
            sumaA += x;

        }
        System.out.println("vidurkis pirmo masyvo: " + sumaA / a.length);

        for (int z : b) {

            sumaB+=z;
        }
        System.out.println("vidurkis antro masyvo: " + (double)sumaB/b.length);

        double skirtumas = (sumaA / a.length) - ((double)sumaB/b.length);
        System.out.println(skirtumas);

    }

}