package zod;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Zodiaco {
    

    public static void mensajeZod(){

        int dia, mes;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Introduce el dia de nacimiento: ");
        dia = Integer.parseInt(Sc.nextLine());
        System.out.print("Introduce tu mes de nacimiento: ");
        mes = Integer.parseInt(Sc.nextLine());
        System.out.println("Tu signo es: " + calculaSigno(dia,mes));
}
    public static String calculaSigno(int dia, int mes) {
        if (mes == 1) {
            if (dia >= 21) {
                /*acuario*/
                return "acuario";
            } else {
                /*capricornio*/
                return "capricornio";
            }
        }
        if (mes == 2) {
            if (dia >= 20) {
                /**/
                return "piscis";
            } else {
                /**/
                return "acuario";
            }
        }
        if (mes == 3) {
            if (dia >= 21) {
                /**/
                return "aries";
            } else {
                /**/
                return "piscis";
            }
        }
        if (mes == 4) {
            if (dia >= 21) {
                /**/
                return "tauro";
            } else {
                /**/
                return "Aries";
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                /**/
                return "geminis";
            } else {
                /**/
                return "tauro";
            }
        }
        if (mes == 6) {
            if (dia >= 22) {
                /**/
                return "cancer";
            } else {
                /**/
                return "geminis";
            }
        }
        if (mes == 7) {
            if (dia >= 22) {
               /**/
                return "leo";
            } else {
                /**/
                return "cancer";
            }
        }
        if (mes == 8) {
            if (dia >= 24) {
                /**/
                return "virgo";
            } else {
                /**/
                return "leo";
            }
        }
        if (mes == 9) {
            if (dia >= 24) {
                /**/
                return "libra";
            } else {
                /**/
                return "virgo";
            }
        }
        if (mes == 10) {
            if (dia >= 23) {
                /**/
                return "escorpio";
            } else {
                /**/
                return "libra";
            }
        }
        if (mes == 11) {
            if (dia >= 22) {
                /**/
                return "sagitario";
            } else {
                /**/
                return "escorpio";
            }
        }
        if (mes == 12) {
            if (dia >= 22) {
                /**/
                return "capricornio";
            } else {
                /**/
                return "sagitario";
            }
        }
                /**/
        return "Fecha inválida";
    }
}

