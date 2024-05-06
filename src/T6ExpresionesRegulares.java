import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T6ExpresionesRegulares {
    public static void main(String[] args) {


    //Ejercicio 1
    String regrex = "He ido al .*";
    String frase1 = "He ido al cine.";
    Pattern pattern1 = Pattern.compile(regrex);
    Matcher matcher1 = pattern1.matcher(frase1);
    boolean matches1 = matcher1.matches();
    System.out.println(matches1);

    String frase2 = "He ido al supermercado.";
    Pattern pattern2 = Pattern.compile(regrex);
    Matcher matcher2 = pattern2.matcher(frase1);
    boolean matches2 = matcher2.matches();
    System.out.println(matches2);

    //Ejercicio 2









    }

}
