/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaojava;

import java.util.Scanner;

/**
 *
 * @author noite
 */
public class IntroducaoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teste = new Scanner(System.in);
        System.out.println("Informe o valor");
        int retorno = teste.nextInt();
        while (retorno !=0){
            System.out.println("Informe outro valor");
            retorno = teste.nextInt();
                    
                    
        }
        System.out.println("Informado com sucesso");
        
        
    }
    
}
