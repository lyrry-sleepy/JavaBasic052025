package JavaBasic_BaiTap3;

public class Operator {
    int number = 100;

    public static void checkNumber(int n){
        if(n == 100 ){
            System.out.println("n bằng 100");
        }else if (n > 100) {
            System.out.println("n lớn hơn 100");
        } else {
            System.out.println("n nhỏ hơn 100");
        }
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        int c = 20;

        System.out.println((a > b) || (c > b));
        System.out.println((a >= b) && (c <= b));
        System.out.println((a == b) || (c >= b));

        int n = 99;
        checkNumber(n);
    }

}
