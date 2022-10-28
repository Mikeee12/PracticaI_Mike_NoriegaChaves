import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("CÁLCULOS CIRCULO\n");

        System.out.println("1.- Cálculo perimetro");
        System.out.println("2.- Cálculo area");
        System.out.println("3.- Cálculo volumen");

        // pedimos al usuario que elija la operacion que quiere que se realice
        Scanner sc2 = new Scanner(System.in);
        int calculo = 0;

        // Utilizamos un do while para que cada vez que termine de hacer un calculo te vuelva al menu y puedas volver a elegir otra opcion
        do {

            System.out.println("\nEscriba 1 si quiere el perimetro, 2 si el area y 3 si el volumen");
            calculo = sc2.nextInt();
            //este if hace que si pones un numero que no sea 1,2 y 3 no te deje continuar
            if (calculo < 4) {


                // declaramos la constante PI

                final double PI = 3.146;

                // declaramos las variables
                double area = 0;
                double radio = 0;
                double perimetro;
                double volumen;

                //este scanner sirve para que el usuaio escriba el radio
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEscribe el valor del radio: ");
                radio = sc.nextDouble();

                //este if hace que si pones un numero que no sea positivo te diga que introduzca valores positivos
                if (radio > 0 && calculo < 4) {
                    //aqui estan todos los casos con sus formulas y resultados de las operaciones
                    switch (calculo) {
                        case 1:
                            perimetro = 2 * PI * radio;
                            System.out.println("\nEl perimetro del círculo es: " + perimetro);
                            break;
                        case 2:
                            area = PI * radio * radio;
                            System.out.println("\nEl área del círculo es: " + area);
                            break;
                        case 3:
                            volumen = 4 / 3 * PI * radio * radio * radio;
                            System.out.println("\nEl volumen del circulo es: " + volumen);
                            break;

                    }

                } else {
                    System.out.println("Introduzca valores positivos");

                }

            }else {
                System.out.println("numero incorrecto");
            }



        }while (calculo > 0 ) ;
    }
}

