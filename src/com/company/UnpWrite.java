package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;

public class UnpWrite {
    public void  wr(String str) {
        try {
            FileWriter writer = new FileWriter("results.txt",true);
            PrintWriter print = new PrintWriter(writer);
            print.println(str);
            print.close();
        }
        catch (Exception gdetvoifailmudak){

        }
    }
}
