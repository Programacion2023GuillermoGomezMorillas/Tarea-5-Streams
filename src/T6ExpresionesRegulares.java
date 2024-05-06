import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T6ExpresionesRegulares {
    public static void main(String[] args) {


        //Ejercicio 1
        String regrex1 = "He ido al cine\\.|He ido al supermercado\\.";
        System.out.println("He ido al supermercado.".matches(regrex1));
        System.out.println("He ido al cine.".matches(regrex1));


        //Ejercicio 2
        String frase1 = "He ido al cine.";
        Pattern pattern1 = Pattern.compile(regrex1);
        Matcher matcher1 = pattern1.matcher(frase1);
        System.out.println(matcher1.matches());

        String frase2 = "He ido al supermercado.";
        Pattern pattern2 = Pattern.compile(regrex1);
        Matcher matcher2 = pattern2.matcher(frase2);
        System.out.println(matcher2.matches());

        //Ejercicio 3
        String remplazo = "Ciclo+$+formativo+$$+Desarrollo+$$$$+de+$$+aplicaciones+$+multiplataforma.";
        String regrex2 = "\\+\\$+\\+";
        System.out.println(remplazo.replaceAll(regrex2, "_"));

        //Ejercicio 4
        String ejercicio4 = "aaabcccccccdddefffg";
        String regrex3 = "a*bc+ddde.*";
        System.out.println(ejercicio4.matches(regrex3));
        Pattern pattern3 = Pattern.compile(regrex3);
        Matcher matcher3 = pattern3.matcher("sssdd aaabcccccccdddefffg ffffccc aaabcccccccdddefffg");
        System.out.println(matcher3.find());

        String regrex4 = "aaabcccccccdddefffg";
        Pattern pattern4 = Pattern.compile(regrex4);
        Matcher matcher4 = pattern4.matcher("sssdd aaabcccccccdddefffg ffffccc aaabcccccccdddefffg");
        int cont = 0;
        while(matcher4.find()){
            cont++;
        }
        System.out.printf("Se repite %d veces", cont );

        //Ejercicio 5
        String regrex5 = "\\w+\\.\\d+";
        System.out.println("abcdge.1234".matches(regrex5));

    }

}
