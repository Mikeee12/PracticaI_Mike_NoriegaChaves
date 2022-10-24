import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // pedimos al usuario que elija la operacion que quiere que se realice
        Scanner sc2 = new Scanner(System.in);
        int calculo=0;

        // Utilizamos un do while para que cada vez que termine de hacer un calculo te vuelva al menu y puedas volver a elegir otra opcion
        do {

            System.out.println("Escriba 1 si quiere el perimetro, 2 si el area y 3 si el volumen");
            calculo = sc2.nextInt();

            // declaramos la constante PI
            final double PI = 3.146;

            // declaramos las variables
            double area;
            double radio;
            double perimetro;
            double altura;
            double volumen;

            //aqui estan todos los casos con sus respectivas formulas y resultados
            switch (calculo) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Escribe el valor del radio: ");
                    radio = sc.nextDouble();
                    perimetro = 2 * PI * radio;
                    System.out.println("El perimetro del círculo es: " + perimetro );
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Escribe el valor del radio: ");
                    radio = sc1.nextDouble();
                    area = PI * radio * radio;
                    System.out.println("El área del círculo es: " + area );
                    break;
                case 3:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Escribe el valor del radio: ");
                    radio = sc4.nextDouble();
                    System.out.println("Escribe el valor de la altura: ");
                    altura = sc4.nextDouble();
                    volumen = PI * radio * radio * altura;
                    System.out.println("El volumen del circulo es: " + volumen );
                    break;
                default:
                    System.out.println("ERROR: número incorrecto."); break;

            }

        }while (calculo>0 && calculo<4);

    }

}

