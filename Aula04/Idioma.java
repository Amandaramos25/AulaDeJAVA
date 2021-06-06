package HoraDoSistema;

import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        Locale idi = Locale.getDefault();
        System.out.print("O idioma do sistema é");
        System.out.println(idi.getDisplayLanguage());
    }
}
