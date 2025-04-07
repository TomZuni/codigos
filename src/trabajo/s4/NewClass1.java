
package trabajo.s4;

   
    import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion = -1;
        int edad = 0 ;
        double zonaA = 20000;
        double zonaB = 15000;
        double zonaC = 10000;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        double valor = 0;
        double valorT = 0;
        double desc = 0 ;
                
        do {
             
            System.out.println("===== MENÚ DE ZONAS DE ENTRADAS =====");
            System.out.println("1. Zona A");
            System.out.println("2. Zona B");
            System.out.println("3. Zona C");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
              
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                        
            } else {
                System.out.println("Error: Por favor ingrese una opción válida.");
                 scanner.next(); 
                 continue;                 
            }
            
            switch(opcion) {
                case 1 -> {
                    while(true){
                        System.out.println("ingrese la edad del comprador");
                        if (scanner.hasNextInt()) {
                            edad = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Error: Por favor ingrese una edad valida.");
                            scanner.next(); 
                        }
                    }
                    if(edad <= 18){
                        valor = zonaA * 0.10;
                        valorT = valorT + (zonaA - valor);
                        desc = desc + valor;
                    }else if(edad >= 65){
                        valor = zonaA * 0.15;
                        valorT = valorT + (zonaA - valor);
                        desc = desc + valor;
                    }else{
                        valorT = valorT + zonaA ;
                    }
                    cont1++;
                }
                case 2 -> {
                    while(true){
                        System.out.println("ingrese la edad del comprador");
                        if (scanner.hasNextInt()) {
                            edad = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Error: Por favor ingrese una edad valida.");
                            scanner.next(); 
                        }
                    }
                    if(edad <= 18){
                        valor = zonaB * 0.10;
                        valorT = valorT + (zonaB - valor);
                        desc = desc + valor;
                    }else if(edad >= 65){
                        valor = zonaB * 0.15;
                        valorT = valorT + (zonaB - valor);
                        desc = desc + valor;
                    }else{
                        valorT = valorT + zonaB ;
                    }
                    cont2++;
                }
                case 3 -> {
                    while(true){
                        System.out.println("ingrese la edad del comprador");
                        if (scanner.hasNextInt()) {
                            edad = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Error: Por favor ingrese una edad valida.");
                            scanner.next(); 
                        }
                    }
                    if(edad <= 18){
                        valor = zonaB * 0.10;
                        valorT = valorT + (zonaC - valor);
                        desc = desc + valor;
                    }else if(edad >= 65){
                        valor = zonaC * 0.15;
                        valorT = valorT + (zonaC - valor);
                        desc = desc + valor;
                    }else{
                        valorT = valorT + zonaC ;
                    }
                    cont3++;
                }
                case 0 -> {
                }
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
            
        } while(opcion != 0);
        
            if(cont1 != 0 ){
                System.out.println("Se compraron " + cont1 + " entradas en la zona A al valor de: " + zonaA);
            }
            if (cont2 != 0){
                System.out.println("Se compraron " + cont2 + " entradas en la zona B al valor de: " + zonaB);
            } if (cont3 != 0){
                System.out.println("Se compraron " + cont3 + " entradas en la zona C al valor de: " + zonaC);
            }
            if(desc != 0){
                System.out.println("Se Aplico un descuento de: " + desc );
            }
            if(valorT != 0){
                System.out.println("El valor total a pagar por las entradas es de: " + valorT);
            }else{
                System.out.println("No se compraron entradas ");
            }
            
        scanner.close();
    }
}


