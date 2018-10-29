package com.zup;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Calc calc = new Calc();
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        System.out.println( "1 + 2 ="+ calc.addition(1,2));
        try{
            System.out.println( "1 + 2 ="+ calc.addition(1,-2));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
