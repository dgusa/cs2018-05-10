package by.it.stebletsky.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int m[] = new int[6];
        int a[] = new int[3];
        int b[] = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            m[i] = sc.nextInt();
            System.out.print(m[i] + " ");
        }

        System.out.println();
        System.out.print("a=[");
        for (int i = 0; i < 3; i++) {
            a[i] = m[i];
            System.out.print(a[i] + " ");
        }
        System.out.print("]");



    }
}