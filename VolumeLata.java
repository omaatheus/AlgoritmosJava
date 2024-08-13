public class VolumeLata {
    public static void main(String[] args) {

        //Calcular e apresentar o valor do volume  de uma lata de óleo,
        // utilizando a  fórmula VOLUME ← 3.14159 * R ↑ 2 *  ALTURA.

        double v, a, r, pi;
        r = 5;
        a = 12;
        pi = 3.14159;

        v = ((pi * (r * r) * a));

        System.out.println(v);

    }
}
