import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 7 para obtener el día de la semana:");
        int ndia = sc.nextInt();

        switch (ndia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor, ingresa un número del 1 al 7.");
        }

        sc.close();
        // lo pongo para liberar el dato que se ingresó previamente :)
    }
}
