/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static double[] f;

    public static void main(String[] args) {
        calculate(args);
    }

    public static void calculate(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);

            System.out.println("x" + "\t" + "F");

            for (double i = a; i <= b; i+=h){
                double result = Math.pow(Math.sin(i),2) - Math.cos(i * 2);
                f[(int) i] = result;
                System.out.println(i + "\t" + result);
            }


        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

}
