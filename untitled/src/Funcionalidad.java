import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Funcionalidad {

    public static void conversor() {
        try {
            Object seleccion = inicio();
            if (seleccion.equals("Conversor de Monedas")) {
                prueba();
                eleccionMoneda();
            } else {
                prueba();
                tipoTemperatura();
            }
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero por favor", "Cuidado", ERROR_MESSAGE);
        } catch (java.lang.NullPointerException ex) {
            showMessageDialog(null, "Programa finalizado", "Fin de la conversion", INFORMATION_MESSAGE);
        }
    }

    private static Object inicio() {
        Object[] tipoOpciones = {"Conversor de Monedas","Conversor de Temperatura"};
        return showInputDialog(null, "Elige una opcion", "Tipo de conversores", PLAIN_MESSAGE, null, tipoOpciones, tipoOpciones[0]);
    }

    private static double valorIngresado;
    private static String valorSeleccionado;

    public static String getValorSeleccionado() {
        return valorSeleccionado;
    }

    private static void prueba() {
        valorIngresado = Double.parseDouble(showInputDialog(null,"Ingrese valor", "Ingrese el numero", INFORMATION_MESSAGE));
    }

    private static void eleccionMoneda() {
        Object[] tipoMonedas = {"Convertir de $ARS a $USD", "Convertir de $ARS a $EUR", "Convertir de $ARS a $GBP",
                "Convertir de $ARS  a $JPY", "Convertir de $ARS a $KRW", "Convertir de $USD a $ARS", "Convertir de $EUR a $ARS",
                "Convertir de $GBP a $ARS", "Convertir de $JPY a $ARS", "Convertir de $KRW a $ARS"};
        valorSeleccionado = (String) showInputDialog(null, "Elige una opcion", "Tipos de monedas", PLAIN_MESSAGE, null, tipoMonedas, tipoMonedas[0]);
        resultadoDivisa();
        deseaContinuar();

    }

    private static void tipoTemperatura() {
        Object[] tipoTemperatura = {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin",  "Grados Fahrenheit a Celsius", "Grados Kelvin a Celsius",};
        valorSeleccionado = (String) showInputDialog(null, "Elige una opcion", "Tipos de temperaturas", PLAIN_MESSAGE, null, tipoTemperatura, tipoTemperatura[0]);
        resultadoTemperatura();
        deseaContinuar();
    }

    private static void resultadoDivisa() {
        switch (valorSeleccionado) {
            case "Convertir de $ARS a $USD": Monedas.conversionMoneda(valorIngresado,"USD"); break;
            case "Convertir de $ARS a $EUR": Monedas.conversionMoneda(valorIngresado,"EUR"); break;
            case "Convertir de $ARS a $GBP": Monedas.conversionMoneda(valorIngresado,"GBP"); break;
            case "Convertir de $ARS a $JPY": Monedas.conversionMoneda(valorIngresado,"JPY"); break;
            case "Convertir de $ARS a $KRW": Monedas.conversionMoneda(valorIngresado,"KRW"); break;
            case "Convertir de $USD a $ARS", "Convertir de $EUR a $ARS", "Convertir de $JPY a $ARS", "Convertir de $GBP a $ARS", "Convertir de $KRW a $ARS": Monedas.conversionMoneda(valorIngresado,"ARS"); break;
        }
    }

private static void resultadoTemperatura() {
        switch (valorSeleccionado) {
            case "Grados Celsius a Grados Fahrenheit": Monedas.conversionTemperatura(valorIngresado,"CF"); break;
            case "Grados Celsius a Kelvin": Monedas.conversionTemperatura(valorIngresado,"CK"); break;
            case "Grados Fahrenheit a Celsius": Monedas.conversionTemperatura(valorIngresado,"FC"); break;
            case "Grados Kelvin a Celsius": Monedas.conversionTemperatura(valorIngresado,"KC"); break;

    }
}
    private static void deseaContinuar() {
        int respuesta = showConfirmDialog(null, "Deseas continuar?", "Selecciona una opcion", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE);
        if (respuesta == YES_OPTION) {
            conversor();
        } else {
            showMessageDialog(null, "Programa finalizado", "Fin de la conversion", INFORMATION_MESSAGE);
        }
    }

}
