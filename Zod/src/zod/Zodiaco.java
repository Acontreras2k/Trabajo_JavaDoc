package zod;
import java.util.Scanner;
/**
 * 
 * @version 1.0, 03/03/2022
 * @author Angel
 *
 */
public class Zodiaco {

    public static void mensajeZod(){
        //Message shown when the sign is calculated
        int dia, mes;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Introduce el dia de nacimiento: "); 
        dia = Integer.parseInt(Sc.nextLine());//Specifies the day of the month (1-31)
        System.out.print("Introduce tu mes de nacimiento: "); 
        mes = Integer.parseInt(Sc.nextLine());//Specifies the month of the sign (1-12)
        System.out.println("Tu signo es: " + calculaSigno(dia,mes));//String that contains the name of the sign
        Sc.close();
}  /**
        * Parameters
        * @param dia Specifies the day of the month (1-31)
        * @param mes Specifies the month of the sign (1-12)
        
        * @return The name of the sign according to the date introduced
        */
    public static String calculaSigno(int dia, int mes) {
        /*
        * @param signo String that contains the name of the sign
        */
        String signo = null;
        switch (mes) {
            case 1:
                if (dia<=21)
                    signo = "Capricornio";
                else if (dia<=31)
                    signo = "Acuario";
                break;
            case 2:
                if (dia<=21)
                    signo = "Acuario";
                else if (dia<=29)
                    signo = "Piscis";
                break;
            case 3:
            if (dia <= 21) {
                
                signo = "Piscis";
            } else if (dia<=31){
                
                signo = "Aries";
            }
        
        case 4:
                if (dia<=21)
                    signo = "Aries";
                else if (dia<=31)
                    signo = "Tauro";
                break;
            case 5:
                if (dia<=21)
                    signo = "Tauro";
                else if (dia<=29)
                    signo = "Géminis";
                break;
            case 6:
            if (dia <= 21) {
                
                signo = "Géminis";
            } else if (dia<=31){
                
                signo = "Cáncer";
            }
         case 7:
                if (dia<=21)
                    signo = "Cáncer";
                else if (dia<=31)
                    signo = "Leo";
                break;
            case 8:
                if (dia<=21)
                    signo = "Leo";
                else if (dia<=29)
                    signo = "Virgo";
                break;
            case 9:
            if (dia <= 21) {
                
                signo = "Virgo";
            } else if (dia<=31){
                
                signo = "Libra";
            }
         case 10:
                if (dia<=21)
                    signo = "Libra";
                else if (dia<=31)
                    signo = "Escorpio";
                break;
            case 11:
                if (dia<=21)
                    signo = "Escorpio";
                else if (dia<=29)
                    signo = "Sagitario";
                break;
            case 12:
            if (dia <= 21) {
                
                signo = "Sagitario";
            } else if (dia<=31){
                
                signo = "Capricornio";
            }
            }
           
            if (signo==null){
                System.out.println("Los datos no son correctos");
            }
                return signo;
        }

    }





