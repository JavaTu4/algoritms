package uits.jv1604.algoritms;

import java.util.Arrays;

/**
 * Created by JV on 4/8/2016
 */
public class App {
    public static void main(String[] args) {
        int[]ms = new int[25];
        int k = 5;
        for (int i = 0;i < ms.length;i++){
            ms[i] = k;
            k+=10;
        }
        System.out.println(Arrays.toString(ms));
    }
}
