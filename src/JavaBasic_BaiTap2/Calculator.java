package JavaBasic_BaiTap2;

public class Calculator {
    Double a;
    Double b;

    public static Double sum(Double x,Double y) {
        Double sum = x + y;
        return sum;
    }

    public static void multiplication(Double x,Double y) {
        Double multi = x * y;
        System.out.println(multi);
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.a = 9.3;
        cal1.b = 2.77;
        Double sum = sum(cal1.a,cal1.b);
        System.out.println("Kết quả tổng 2 số: " + sum);
        System.out.println("Kết quả tích 2 số: ");
        multiplication(cal1.a,cal1.b);

    }
}
