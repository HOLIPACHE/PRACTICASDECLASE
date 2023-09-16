/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_netbeans;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_NETBEANS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("pon la base");
        base = input.nextDouble();
        
        System.out.println("pon la altura");
        altura = input.nextDouble();
                
        area = base * altura / 2;
        
        System.out.println("tu area es");
        System.out.println(area);
    }
    
}
