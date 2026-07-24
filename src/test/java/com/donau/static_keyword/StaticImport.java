package com.donau.static_keyword;

//import static java.lang.Math.max;
import static java.lang.Math.*;

public class StaticImport {

    public static void main(String[] args) {

        int n1 = 5, n2 = 20;
      int n3 =  max(n1, n2);

        System.out.println(n3);

        double r = 3.5;
        double area = round( pow(r, 2) * PI);

        System.out.println(area);




    }
}
