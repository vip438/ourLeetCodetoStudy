package com.example.myleetcode.easy.排序算法;

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;

/**
 * 直接插入排序
 * 算法思想：
 * 将一个记录插入到已排好的有序表中，从而得到一个新的记录数加一的有序表；
 * 示例：{3,45,66,97,1,6,65}
 * 初始关键字 ：
 * (3) 45 66 97 1 6 65
 * i=2: (45) (3 45) 66 97 1 6 65
 * i=3: (66) (3 45 66) 97 1 6 65
 * i=4: (97) (3 45 66 97) 1 6 65
 * i=5: (1) (1 3 45 66 97) 6 65
 * i=6: (6) (1 3 6 45 66 97) 65
 * i=7: (65) (1 3 6 45 65 66 97)
 * 插入排序代码如下：
 * ————————————————
 * 版权声明：本文为CSDN博主「xld_hung」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/xld_hung/article/details/77587760
 */
public class Insert {
    public static void main(String[] args) {
        insertSort(new int[]{12, 1, 23, 14});
    }

    public static void insertSort(int[] arr) {
        int value;
        int index;
        for (int i = 0; i < arr.length; i++) {

            value = arr[i];
            index = i - 1;
            while (index >= 0 && arr[index] > arr[i]) {
                arr[i] = arr[index];
                index--;
            }

            arr[index + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }

}
