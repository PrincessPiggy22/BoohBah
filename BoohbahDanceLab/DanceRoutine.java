public class DanceRoutine {

    private Boohbah[] boohbahs;

    DanceRoutine(Boohbah[] boobahs){

        this.boohbahs = boobahs;

    }

    String buildRoutine(){ // Geeks for Geeks
        // used AI to debug (wasn't helpful)
        StringBuilder sb = new StringBuilder();

        for (Boohbah b : this.boohbahs) {
                sb.append(b.performMove()).append("\n");
        }
        return sb.toString();
    }

    String modifyRoutine(){ // Geeks for Geeks

        StringBuilder sb = new StringBuilder();

        for (Boohbah b : this.boohbahs) {
            String skibidi = b.performMove().replace("performs", "dances to");
            sb.append(skibidi).append("\n");


        }
        return sb.toString();

    }

}
