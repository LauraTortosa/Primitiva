import java.util.Scanner;

public class Block {
    private int[] numeros;

    public Block(int cantidadNumeros) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la cantidad de numero a jugar: ");
        cantidadNumeros = scan.nextInt();*/

        if (cantidadNumeros <= 6) {
            cantidadNumeros = 6;
        } else {
            if (cantidadNumeros >= 49) {
                cantidadNumeros = 49;
            }
        }

        int numeroAleatorio = (int)(Math.random() * cantidadNumeros);
    }

    public Block(int[] conjuntoNum) {
        numeros = conjuntoNum;
    }

    @Override
    public String toString() {
        String st = ""; //variable que guarda los num
        for (int i = 0; i < numeros.length; i++) { //recorre y añade un numero del conjunto
            st += numeros[i] + " ";
        }
        return st;
    }

    public int[] getNumeros() {
        return numeros;
    }


}
