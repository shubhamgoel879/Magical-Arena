public class main {
    public static void main(String[] args) throws Exception {
        Player A = new Player("A", 50, 5, 10);
        Player B = new Player("B", 100, 10, 5);
        System.out.println("\nArena started!!");
        MagicalArena arena = new MagicalArena(A, B);
        String result = arena.startFightAndGetResult(A, B, 1000);
        System.out.println(result);
    }
}
