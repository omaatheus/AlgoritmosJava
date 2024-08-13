public class Celsius {
    public static void main(String[] args) {

        double c, f;

        //Ler uma temperatura em graus  Fahrenheit e apresentá-la convertida
        //em graus Celsius. A fórmula de  conversão é C ← (F -32)* (5/9), sendo  F
        //a temperatura em Fahrenheit e C a  temperatura em Celsius.

        f = 86;
        c = ((f - 32 )*  5 / 9 );

        System.out.println(c);
    }
}


