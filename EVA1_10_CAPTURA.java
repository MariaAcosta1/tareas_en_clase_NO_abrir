
package eva1_10_captura;
import java.util.Scanner;
public class EVA1_10_CAPTURA {

    public static void main(String[] args) {
        //SOLICITAR LA TEMPERATURA EN FARENHEIT
        Scanner input = new Scanner(System.in);
        double far, cent;
        //CAPTURA
        System.out.println("Temperatura en grados Farenheit: ");
        far = input.nextDouble();
        //DARLE LA TEMPERATURA EN GRADOS CENTIGRADOS
        cent = 5 * (far - 32) / 9;
        System.out.println("La temperatura es: ");
        System.out.println(cent);
    }
    
}
