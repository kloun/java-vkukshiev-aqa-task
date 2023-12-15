package iner.ne;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner iScan = new Scanner(System.in);
        int n = iScan.nextInt();
        if (n > 7) System.out.println("Привет");
    }
}