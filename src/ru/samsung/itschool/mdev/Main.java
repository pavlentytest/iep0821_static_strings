package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Table wood_table = new Table();
        wood_table.legs = 6;

        Table metal_table = new Table();
        System.out.println(metal_table.legs); // ??? 6
        metal_table.doMove();

        Table.legs = 100;

        //Table.RADIUS = 100; // final - неизменяемая
        Table.doMove();

        System.out.println();

        // Класс?? - System
        // Метод?? - println()
        // out???? - поле класса System

       String str1 = new String("Hello");
       String str2 = new String("Hello");
       // System.out.println(str1==str2); // ??? false
        // так нельзя сравнивать

        System.out.println(str1.equals(str2));
        // Строка задается литерально
        String a1 = "Moscow";
        String a2 = "Moscow";
        //System.out.println(a1==a2); // ???  true
        System.out.println(a1.equals(a2));

        // Строка в Java - неизменяемая (immutable)
        String b1 = "1231233";
        System.out.println(b1.hashCode());

        b1 += "dfgklajdflgkadfg";
        System.out.println(b1.hashCode());

        // Для изменяемых строк - mutable
        // StringBuilder и StringBuffer
        StringBuilder sb1 = new StringBuilder("dfgadfgDGadfg");
        System.out.println(sb1.hashCode());

        sb1.append("sfhajdfagkldgdfg");
        System.out.println(sb1.hashCode());

        String str3 = sb1.toString(); //



    }
}
