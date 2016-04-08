package uits.jv1604.algoritms;

/**
 * Created by java on 07.04.16.
 */
public class Dz30002 {

    public static void main(String[] args) {
        int[][] masiv = new int[7][5];   //создаем массив
        int a, b, c = 0;
        //цикл для авто заполнения массива
        for (a = 0; a < masiv.length; a++) {     //цикл для заполнения ячеек столбцов а
            for (b = 0; b < masiv[0].length; b++) {
                masiv[a][b] = c;
                c = c + 5;    //будет заполнять через 5 цифр
            }
        }
        System.out.println("=====Сдвиговые операции с двумерным массивом=====");
        System.out.println("Массив [7] [5] :");
        int[][] masiv1 = new int[masiv.length][masiv[0].length];
        System.arraycopy(masiv, 0, masiv1, 0, masiv.length);
        for (a = 0; a < masiv.length; a++) {     //цикл для заполнения ячеек столбцов а
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вправо на 2 позиции :");
        sdvigVpravo(masiv, 2);
        for (a = 0; a < masiv.length; a++) {
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv[a][b] + "\t");
            }
            System.out.println();
        }
        sdvigVniz(masiv1, 2);
        System.out.println("Вниз на 2 позиции :");
        for (a = 0; a < masiv.length; a++) {
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv1[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вверх на 3 позиции :");
        sdvigVverh(masiv1, 3);
        for (a = 0; a < masiv.length; a++) {
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv1[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println("Влево на 3 позиции :");
        sdvigVverh(masiv1, 3);
        for (a = 0; a < masiv.length; a++) {
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv1[a][b] + "\t");
            }
            System.out.println();
        }

        //создаем методы


    }

    public static void sdvigVpravo(int[][] mas1, int d) {   //d число позиций для сдвига
        int razmer = mas1.length;                   //размер массива мас1
        int razmer2 =  mas1[0].length;
        for (int a = 0; a < d; a++) {              //создаем цикл
            for (int l = 0; l < razmer; l++) {
                int temp = mas1[l][razmer2 - 1];        //создаем переменную хранящую последнюю ячейку массива
                for (int k = razmer2 - 1; k > 0; k--) {
                    mas1[l][k] = mas1[l][k - 1];
                }
                mas1[l][0] = temp;
            }
        }
    }

    public static void sdvigVniz(int[][] mas1, int d) {   //d число позиций для сдвига
        int razmer = mas1.length;
        for (int a = 0; a < d; a++) {//создаем цикл
            for (int l = 0; l < razmer; l++) {
                int[] mas1temp = mas1[razmer - 1];
                for (int f = 0; f < razmer - 1; f++) {
                    mas1[l][f] = mas1[l][f + 1];
                }
                mas1[l][razmer - 1] = mas1temp;
            }
        }
    }


    public static void sdvigVverh(int[][] mas1, int d) {
        int razmer = mas1[0].length;
        for (int a = 0; a < d; a++) {
            for (int l = 0; l < razmer; l++) {
                int mas2temp = mas1[l][razmer - 1];
                for (int p = razmer - 1; p > 0; p--) {
                    mas1[l][p] = mas1[l][p - 1];
                }
                mas1[l][razmer - 1] = mas2temp;
            }
        }
    }

    public static void sdvigVlevo(int[][] mas1, int d) {
        int razmer = mas1[0].length;
        for (int a = 0; a < d; a++) {
            for (int l = 0; l < razmer; l++) {
                int mas3temp = mas1[l][razmer - 1];
                for (int p = 0; p < razmer - 1; p++) {
                    mas1[l][p] = mas1[l][p - 1];
                }
                mas1[l][razmer] = mas3temp;
            }
        }
    }
}




