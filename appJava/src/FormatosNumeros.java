import java.text.NumberFormat;
import java.util.Locale;

public class FormatosNumeros {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("es-CL");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
    }
}
