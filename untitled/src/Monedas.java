import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Monedas {

    private static double ARSUSD = 272.47D;
    private static double ARSEUR = 302.32D;
    private static double ARSGBP = 352.96D;
    private static double ARSJPY = 1.94D;
    private static double ARSKRW = 0.21D;

    public static double getARSUSD() {
        return ARSUSD;
    }

    public static double getARSEUR() {
        return ARSEUR;
    }

    public static double getARSGBP() {
        return ARSGBP;
    }

    public static double getARSJPY() {
        return ARSJPY;
    }

    public static double getARSKRW() {
        return ARSKRW;
    }



    public static void conversionMoneda(double valor, String moneda) {
        switch (moneda) {
            case "USD":
                double cuentaARSUSD = (valor / getARSUSD());
                showMessageDialog(null, "Tienes " + cuentaARSUSD + " Dolares", "Resultado", INFORMATION_MESSAGE); break;
            case "EUR":
                    double cuentaARSEUR = (valor / getARSEUR());
                    showMessageDialog(null, "Tienes " + cuentaARSEUR + " Euros", "Resultado", INFORMATION_MESSAGE); break;
            case "GBP":
                        double cuentaARSGBP = (valor / getARSGBP());
                        showMessageDialog(null, "Tienes " + cuentaARSGBP + " Libras Esterlinas", "Resultado", INFORMATION_MESSAGE); break;
            case "JPY":
                double cuentaARSJPY = (valor / getARSJPY());
                showMessageDialog(null, "Tienes " + cuentaARSJPY + " Yenes Japoneses", "Resultado", INFORMATION_MESSAGE); break;
            case "KRW":
                    double cuentaARSKRW = (valor / getARSKRW());
                    showMessageDialog(null, "Tienes " + cuentaARSKRW + " Wons Surcoreanos", "Resultado", INFORMATION_MESSAGE); break;
            case "ARS": if (Funcionalidad.getValorSeleccionado() == "Convertir de $USD a $ARS") {
                double cuentaUSDARS = (valor * getARSUSD());
                showMessageDialog(null, "Tienes " + cuentaUSDARS + " Pesos Argentinos", "Resultado", INFORMATION_MESSAGE); break;

            } else if (Funcionalidad.getValorSeleccionado() == "Convertir de $EUR a $ARS") {
                double cuentaEURARS = (valor * getARSEUR());
                showMessageDialog(null, "Tienes " + cuentaEURARS + " Pesos Argentinos", "Resultado", INFORMATION_MESSAGE); break;

            } else if (Funcionalidad.getValorSeleccionado() == "Convertir de $GBP a $ARS")    {
                double cuentaGBPARS = (valor * getARSGBP());
                showMessageDialog(null, "Tienes " + cuentaGBPARS + " Pesos Argentinos", "Resultado", INFORMATION_MESSAGE); break;
            } else if (Funcionalidad.getValorSeleccionado() == "Convertir de $JPY a $ARS") {
                double cuentaJPYARS = (valor * getARSJPY());
                showMessageDialog(null, "Tienes " + cuentaJPYARS + " Pesos Argentinos", "Resultado", INFORMATION_MESSAGE); break;
            } else {
                double cuentaKRWARS = (valor * getARSKRW());
                showMessageDialog(null, "Tienes " + cuentaKRWARS + " Pesos Argentinos", "Resultado", INFORMATION_MESSAGE); break;
            }
        }
    }

        public static void conversionTemperatura(double valor, String temperatura) {
        switch (temperatura){
            case "CF": double CF = (valor * 9/5) + 32;
                showMessageDialog(null, valor + " Celsius son " + CF + " Fahrenheit", "Resultado", INFORMATION_MESSAGE); break;
            case "CK": double CK = valor + 273.15;
                showMessageDialog(null, valor + " Celsius son " + CK + " Kelvin", "Resultado", INFORMATION_MESSAGE); break;
            case "FC": double FC = (valor-32) * 5/9;
                    showMessageDialog(null, valor + " Celsius son " + FC + " Fahrenheit", "Resultado", INFORMATION_MESSAGE); break;
            case "KC": double KC = valor - 273.15;
                        showMessageDialog(null, valor + " Celsius son " + KC + " Fahrenheit", "Resultado", INFORMATION_MESSAGE); break;
            }
        }

}


