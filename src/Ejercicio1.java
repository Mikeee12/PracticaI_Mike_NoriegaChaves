import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        boolean hipoteca = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Quiere solicitar una hipoteca?Introduzca true(si) o false(no)");
            hipoteca = sc.nextBoolean();


            if (hipoteca) {

                System.out.println("Perfecto, pero para que se la concedamos necesita cumplir con unos requisitos");
            } else {

                System.out.println("Salgase de la pagina entonces:)");
            }

        }while (hipoteca = false);



        boolean trabajo = true;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("¿Usted trabaja?Introduzca true(si) o false(no)");
        trabajo = sc1.nextBoolean();

        if (trabajo) {

            System.out.println("Perfecto ya cumple con uno de los 3 requisitos restantes");
        }

        else
        {

            System.out.println("Lo sentimos mucho pero no podemos concederle la hipoteca");
        }







    }
}

