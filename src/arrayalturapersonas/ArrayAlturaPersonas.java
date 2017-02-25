/*
7. Programa Java para leer la altura de N personas y calcular la altura media.
Calcular cuántas personas tienen una altura superior a la media y cuántas tienen
una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
 */
package arrayalturapersonas;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayAlturaPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numpersona;
        double alturaMedia = 0;
        double alturaSuperior = 0;
        double alturaInferior = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Numero de personas");
            numpersona = entrada.nextInt();
        } while (numpersona <= 0);
        System.out.println("Lectura de altura de personas");

        double[] alto = new double[numpersona];

        for (int i = 0; i < numpersona; i++) {
            System.out.println("Persona " + (i + 1) + " = ");
            alto[i] = entrada.nextDouble();
            alturaMedia = alturaMedia + alto[i];
        }
        alturaMedia = alturaMedia / numpersona;
        for (int i = 0; i < alto.length; i++) {
            if (alto[i] > alturaMedia) {
                alturaSuperior++;
            } else if (alto[i] < alturaMedia) {
                alturaInferior++;
            }

        }
        //Mostrar resultados
        System.out.println("Estatura media: " + alturaMedia);
        System.out.println("Personas con estatura superior a la media: " + alturaSuperior);
        System.out.println("Personas con estatura inferior a la media: " + alturaInferior);
    }

}
