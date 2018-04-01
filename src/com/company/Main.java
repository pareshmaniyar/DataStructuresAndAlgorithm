package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Hello, World!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Write number of best friends :");
        int num = Integer.parseInt(br.readLine());
        String[] names = new String[num];

        System.out.print("Write names of your best friends :");
        for(int i=0;i<num;i++)
        {
            names[i]=br.readLine();
        }
        for(int i=0;i<num;i++)
        {
            System.out.println(names[i]);
        }
    }
}
