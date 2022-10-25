package getLargestExpressionResult;

public class GetLargestExpressionResult {
    public static double getResult(double a, double b) {
        double plus = a + b;
        double minus = a - b;
        double multi = a * b;
        double div = a / b;

        if (plus >= minus && plus >= multi && plus >= div) { //везде используем >= вместо >
            System.out.println("plus win: " + plus);
            return plus; //тогда возврат из функции всегда отработает и max больше не нужен

        } else if (minus >= plus && minus >= multi && minus >= div) {
            System.out.println("minus win: " + minus);
            return minus;

        } else if (multi >= plus && multi >= minus && multi >= div) {
            System.out.println("multi win: " + multi);
            return multi;

        } else if (div >= plus && div >= minus && div >= multi) {
            System.out.println("div win: " + div);
            return div;
        }

        return Double.MIN_VALUE; //если даже не пройдет один из блоков 'if - else if' вернем минимальное значение для double и будем знать, что что-то пошло не так
    }

    public static void main(String[] args) {

        System.out.println(getResult(77, 6));

    }
}