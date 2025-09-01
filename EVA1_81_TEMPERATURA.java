
package eva1_8.pkg1_temperatura;

public class EVA1_81_TEMPERATURA {

    public static void main(String[] args) {
        double K, C, Más; 
        C = 69;
        Más = 273;
        K = (C + Más);
        System.out.println("De Celsius a Kelvin: ");
        System.out.print("°C + 273 = °K ");
        System.out.println(K);
        System.out.println(" ");
    }
    static{ 
        double F, C;
        F = 69;
        C = 5*(F - 32) / 9;
        System.out.println("De Fahrenheit a Celsius: ");
        System.out.print("5(°F-32)/9 = °C ");
        System.out.println(C);
        System.out.println(" ");     
    }
    static{ 
        double F, C;
        C = 77;
        F = 9*C /5 +32;
        System.out.println("De Celsius a Fahrenheit: ");
        System.out.print("9*°C/5 +32 = °F ");
        System.out.println(F);
        System.out.println(" "); 
    }   
    }

