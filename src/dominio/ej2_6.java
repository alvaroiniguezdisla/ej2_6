package dominio;

public class ej2_6 {

    public static double media(double[]lista,int i) {


        if(i==0) {
            return lista[i];
        }else {
            return lista[i]+ media(lista,i-1);
        }

    }

    public static double cuadrados(double[]lista,int i) {
        if(i==0) {
            return lista[i]*lista[i];
        }else {
            return lista[i]*lista[i]+cuadrados(lista,i-1);
        }
    }
    public static double desviacion(double[]lista) {
        double media=media(lista,lista.length-1)/lista.length;
        double cuadrados=cuadrados(lista,lista.length-1);
        double varianza=(cuadrados/lista.length)-(media*media);
        double desviacion=Math.sqrt(varianza);
        return  desviacion;
    }








}

