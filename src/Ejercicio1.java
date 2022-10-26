import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Introducimos las variables
        boolean hipoteca = true;
        boolean trabajo = true;
        int vivienda=0;
        int dinero=0;
        int ahorrado=0;

        //Utilizamos un do while para que cuando algo sea erroneo pare el programa

        do {

            //Utilizamos scanner para realizar la primera pregunta al usuario
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Quiere solicitar una hipoteca?Introduzca true(si) o false(no)");
            hipoteca = sc.nextBoolean();

            //Con el if hacemos que sus dos
            if (hipoteca) {

                System.out.println("Perfecto, pero para que se la concedamos necesita cumplir con unos requisitos");
            }
            else {

                System.out.println("Salgase de la pagina entonces:)");
                break;
            }

            Scanner sc1 = new Scanner(System.in);
            System.out.println("¿Usted trabaja?Introduzca true(si) o false(no)");
            trabajo = sc1.nextBoolean();

            if (trabajo) {

                System.out.println("Perfecto ya cumple con uno de los requisitos restantes");
            } else
            {

                System.out.println("Lo sentimos mucho pero no podemos concederle la hipoteca");
                break;
            }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("¿Cuanto dinero cuesta la vivienda que quiere comprar?");
        vivienda = sc2.nextInt();


        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduzca el dinero que desea solicitar.Recuerde que no puede superar el 80% del precio de la vivienda");
        dinero = sc3.nextInt();

        if (dinero <= vivienda*80/100 ) {

            System.out.println("Perfecto este dinero entra dentro de los limites establecidos.Ahora introduzca lo que tiene ahorrado");
            Scanner sc4 = new Scanner(System.in);
            ahorrado = sc4.nextInt();
            if (ahorrado >= vivienda * 20 / 100) {

                System.out.println("Genial ya tiene todos los requisitos necesarios y le daremos el dinero que nos ha solicitado");
            } else {
                System.out.println("No podemos darle el dinero ya que no cumple el requisito de que debe ser igual o superior al 20% del precio de la vivienda");
            }

        }
        else {
            System.out.println("Lo sentimos pero no podemos concederle esa cantidad");
    }
}while(hipoteca=false);
    }
    }

