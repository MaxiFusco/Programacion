package com.mycompany.conversornum;
import java.util.Scanner;


public class ConversorNum {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int decimal = 0;
        int[] num = new int[16];
        

        System.out.println("Escriba un numero binario de 16 dígitos:");
        String num1 = teclado.next();
        
        if (num1.length() != 16) {
            System.out.println("Error, el número debe ser de 16 dígitos.");
            return;
        }
          for (int i = 0; i < 16; i++) {
            num[i] = Character.getNumericValue(num1.charAt(i));
        }
           for (int e = 0; e < 16; e++) {
            decimal += num[15 - e] * Math.pow(2, e);
        }
        System.out.println("Pasado a decimal es: " + decimal);
        System.out.println("Pasado a octal es: " + Integer.toOctalString(decimal));
        System.out.println("Pasado a hexadecimal es: " + Integer.toHexString(decimal));  
    }
}
