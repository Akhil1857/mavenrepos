package com.knoldus;

import java.util.Scanner;

public class stringimpl {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String");
        String user_String=input.nextLine();
        int count= StringAPI.stringCount(user_String);
        System.out.println("Length of the string is : "+count);
        StringAPI.stringReverse(user_String);



    }
}