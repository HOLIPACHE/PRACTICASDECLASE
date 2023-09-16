/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADAS_SALIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String mARCA;
        String mODELO;
        int aÑO;
        double pRECIO;

        System.out.println("INTRODUCE LA MARCA");
        mARCA = input.nextLine();
        System.out.println("INDIQUE EL MODELO");
        mODELO = input.nextLine();
        System.out.println("DE QUE AÑO?");
        aÑO = input.nextInt();
        System.out.println("INDIQUE EL PRECIO A PAGAR");
        pRECIO = input.nextDouble();
        System.out.println("SU PEDIDO ESTA HECHO LUEGO SE LE INDICARA DONDE RECOGERLO, GRACIAS POR SU COMPRA");
    }
    
}
