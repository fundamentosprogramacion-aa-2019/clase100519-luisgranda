/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author Luis Granda
 */
public class CicloCinco {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 3;
        int contador = 1;
        int suma = 0;
        double promedio = 0;
        int nota = 0;
        Scanner entrada = new Scanner(System.in);
        String mensajeFinal = "";
        
       
        mensajeFinal = String.format("%s%s\n", mensajeFinal, 
                "Las notas ingresadas fueron");
        while (contador <= limite){
            System.out.printf("Ingrese la nota %d: ", contador);
            nota = entrada.nextInt();
            suma = suma + nota;
            //System.out.printf("%d\n", contador);
            mensajeFinal = String.format("%s%d\n", mensajeFinal,
                    nota);
            contador = contador + 1;
        }
        promedio = (double)suma/limite;
        mensajeFinal = String.format("%sY su promedio es: %.2f\n", 
                mensajeFinal, promedio);
        System.out.printf("%s", mensajeFinal);
    }
}
