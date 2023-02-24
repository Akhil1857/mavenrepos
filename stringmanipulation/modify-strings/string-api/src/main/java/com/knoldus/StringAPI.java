package com.knoldus;
import java.util.*;
public class StringAPI {
    public static int stringCount(String new_string) {
        int length = 0;
        while (true) {
            try {
                char ch = new_string.charAt(length);
                length++;
            } catch (Exception e) {
                //System.out.println("Length of String is =" + length);
                break;
            }
        }
        return length;
    }

    public static void stringReverse(String new_string2)
    {
        int stringLength=stringCount(new_string2),index;
        String reverse="";
        char[] str =new char[stringLength];
        for(index=0;index<stringLength;index++)
        {
            str[index]=new_string2.charAt(index);
        }
        for(index=stringLength-1;index>=0;index--)
        {
            reverse+=str[index];
        }
        System.out.println(reverse);
    }



}
