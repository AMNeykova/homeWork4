public class bMi {
    public static void main (String[] args) {
        double kg = 60;
        double height = 1.70;
        double bMi = (kg/(height*height));

        String isEqualBmi = (bMi<16||bMi<30) ? "Thinness" : "Overweight";
        System.out.println(isEqualBmi);

    }
}
