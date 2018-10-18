package com.company;

import java.util.*;

public class Main {

    public static int SumaCifara(int n)
    {
        int suma=0;

        while(n!=0)
        {
            int cifra = n%10;
            n/=10;
            suma+=cifra;
        }

        return suma;
    }

    public static void main(String[] args) {
            System.out.println("Unesite broj: ");
            Scanner ulaz = new Scanner(System.in);
            int n = ulaz.nextInt();

            for(int i=1;i<=n;i++)
                if(i%SumaCifara(i)==0) System.out.print(i + " ");
        }


}
