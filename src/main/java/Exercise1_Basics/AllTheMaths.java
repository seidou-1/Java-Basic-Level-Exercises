/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1_Basics;

/**
 *
 * @author laptop
 */
public class AllTheMaths {
    
    public static void main (String [] args){
        System.out.print("1 + 2 is: ");
        System.out.println (1+2);
        
        System.out.print ("42001 modulus 5 is: ");
        System.out.println(5565.0 / 22.0);
        
        System.out.print("223 times 31-42: ");
        System.out.println(223 * 31 - 42);
        
        System.out.print("Is 4 greater than -1? ");
        System.out.println(4 > -1);

        System.out.println("\n****** Now make the computer do some harder maths!");

        System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
        System.out.println(8043.52 - 4.2 + 23/56.0 * -76.13); //I was still able to build and run the program when
        //removing the decimal from 56.0. I changed it to 55 and got 8039.320000000001 as the output.

        System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        System.out.println(11111%3 - 67 - 1 + 9);

        System.out.print("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is : ");
        System.out.println(44 - 22 - 11 - 66 -88 -76 - 11 -33);

        System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is : ");
        System.out.println(22*3 -1 +4 *6 -9);

        System.out.print("Is 67 greater than 4 * 5? ");
        System.out.println("??");

        System.out.print("Is 78 less than than 4 * 5? ");
        System.out.print("??");
    }
}


