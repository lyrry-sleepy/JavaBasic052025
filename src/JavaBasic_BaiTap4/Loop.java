package JavaBasic_BaiTap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        int n = 50;
        // cách 1: dùng collection list
        List<Integer> evenNumberList = new ArrayList<>();
        for (int i = 0; i <= n; i ++ ){
            if(i % 2 == 0){
                evenNumberList.add(i);
            }
        } // duyệt mảng:
        System.out.println(evenNumberList);

        // cách 2: dùng array
        int integerList[] = new int[26]; // từ 0 đến 50 có 26 số chẵn
        int index = 0; // tạo chỉ mục
        for(int i = 0 ; i <= n ; i++ ){
            if(i % 2 ==0 ){
                System.out.println(i + " ");
                integerList[index] = i; // gán số chẵn vào mảng
                index ++; // tăng chỉ mục
            }
        }
        // duyệt mảng:
        for(int value : integerList){
            System.out.println(value);
        }
    }
}
