public class Main {
    public static void main(String[] args) {
        Block block1 = new Block(new int[] {5,10,15,20,25,30,35,40,45});
        System.out.println(block1.toString());

        Ticket tik1 = new Ticket(7);
        System.out.println(tik1.toString());
        tik1.printUsedNumbers();
    }
}
