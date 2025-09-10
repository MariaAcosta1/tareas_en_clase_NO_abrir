
package eva1_16_if_anidado;

import java.util.Scanner;

public class EVA1_16_IF_ANIDADO {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese el numnero de la semana (1 al 7): ");
        dia = captu.nextInt();
        if(dia== 1){
            System.out.println("Domingo");
        }else if (dia== 2){
                    System.out.println("Lunes");
                    }else if (dia== 3){
                    System.out.println("Martes");
                    }else if (dia== 4){
                    System.out.println("Miercoles");
                    }else if (dia== 5){
                    System.out.println("Jueves");
                    }else if (dia== 6){
                    System.out.println("Viernes");
                    }else if (dia== 7){
                    System.out.println("Sabado");
                    }else { //Opcional
                        System.out.println("El numero que ingreso no es valido.");
                            
                    
                    }
        }
        
        
        
    }
    
}
