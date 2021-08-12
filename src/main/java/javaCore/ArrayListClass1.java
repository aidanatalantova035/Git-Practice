package javaCore;

import java.util.Arrays;

public class ArrayListClass1 {
    public static void main(String[] args) {
        //Array --> fixed size

        int [] num1 = new int[3];
        num1[0] = 23;
        num1[1] = 24;
        num1[2] =15;
        System.out.println(Arrays.toString(num1));

        ArrayListClass1 obj = new ArrayListClass1();
        obj.sum(3, 23);
    }

    public  void  sum(int nums1, int nums2){
        System.out.println(nums1+nums2);
    }

}
