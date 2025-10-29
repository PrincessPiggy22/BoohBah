public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah b1 = new Boohbah("Zing Zing Zingbah","the Worm");
        Boohbah b2 = new Boohbah("Jingbah","the Chicken Dance");
        Boohbah b3 = new Boohbah("Humbah","Poke dance");


        Boohbah[] theBoohbahs = {b1,b2,b3};
        DanceRoutine routine = new DanceRoutine(theBoohbahs);

        System.out.println("Og routine:");
        System.out.println(routine.buildRoutine());
        System.out.println("\nModified routine:");
        System.out.println(routine.modifyRoutine());
    }
}
