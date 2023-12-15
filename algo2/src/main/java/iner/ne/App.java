package iner.ne;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner iScan = new Scanner(System.in);
        String name = iScan.nextLine();
        if (name.equals("Вячеслав")) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}