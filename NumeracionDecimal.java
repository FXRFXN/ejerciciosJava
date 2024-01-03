import java.util.Scanner;
public class NumeracionDecimal {
    public static void main(String []args){
        //Programa que reciba un numero por teclado y dice si lo forman unidades,decenas
        // centenas

        Scanner teclado = new Scanner(System.in);

        String []nombresSistemaDecimal = new String[]{"Centenas de millon","Decenas de millon",
                "Unidades de millon","Centenas de millar","Decenas de millar","Unidades de millar",
                "Centenas","Decenas","Unidades"};

        System.out.println("Ingresa un numero que contenga 9 o menos digitos");

        long numero = teclado.nextLong();

        String numeroCadena = String.valueOf(numero);

        if (numero > 0 && numeroCadena.length()<=9){
            int iteradorArray = nombresSistemaDecimal.length - numeroCadena.length();

            for (int i = 0;i<numeroCadena.length();i++){
                System.out.println(numeroCadena.charAt(i) +" "+ nombresSistemaDecimal[iteradorArray++]);
            }
        }else{
            System.out.println("Lo siento, no se permiten numeros negativos 0 mayores a 10 digitos");
        }

    }

}
