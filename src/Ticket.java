public class Ticket {
    private Block[] blocks;

    public Ticket(int numBloq) {
        blocks = new Block[numBloq];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new Block(6);
        }
    }

    @Override
    public String toString() {
        String st = ""; //variable que guarda los num
        for (int i = 0; i < blocks.length; i++) { //recorre y añade un numero del conjunto
            st += blocks[i].toString() + " ";
        }
        return st;
    }

    public void printUsedNumbers() {
        for (int numBloq = 0; numBloq < blocks.length; numBloq++) {
            int[] numeros = blocks[numBloq].getNumeros();
            for (int i = 0; i < numeros.length; i++) {
                int num = numeros[i];
            }
        }

    }


}
