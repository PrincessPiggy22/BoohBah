public class DanceRoutine extends Boohbah {

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

    String remixRoutine(){ // got stuck so I put comments

        StringBuilder remix = new StringBuilder();

        // call buildRoutine to get base text
        String routine = buildRoutine();
        remix.append(routine);

        // insert() "--- REMIX --- \n" at the top
        remix.insert(0, "--- REMIX ---\n");

        // delete() the last \n
        remix.delete(remix.length()-1, remix.length());

        // append() "\n(Backwords Boohbah Shuffle)"
        remix.append("\n(Backwords Boohbah Shuffle!)");

        // reverse() entire string
        remix.reverse();

        // return string remix
        return remix.toString();
    }

}
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
